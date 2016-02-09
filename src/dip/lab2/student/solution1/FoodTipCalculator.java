/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author athanas1
 */
public class FoodTipCalculator implements TipCalculator {
    /*
    These are Rigid need to bend them 
    */
     private double MIN_BILL = 0.00;
    private String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double GOOD_RATE = 0.20;
    private double FAIR_RATE = 0.15;
    private double POOR_RATE = 0.10;

    private double bill;
   
    private ServiceQuality serviceQuality;

    public FoodTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

     @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public double getMIN_BILL() {
        return MIN_BILL;
    }

    public void setMIN_BILL(double MIN_BILL) {
        this.MIN_BILL = MIN_BILL;
    }

    public double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public void setGOOD_RATE(double GOOD_RATE) {
        this.GOOD_RATE = GOOD_RATE;
    }

    public double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public void setFAIR_RATE(double FAIR_RATE) {
        this.FAIR_RATE = FAIR_RATE;
    }

    public double getPOOR_RATE() {
        return POOR_RATE;
    }

    public void setPOOR_RATE(double POOR_RATE) {
        this.POOR_RATE = POOR_RATE;
    }
    
}
