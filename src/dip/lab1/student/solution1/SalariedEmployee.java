package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    /** default constructor. Is this the best way to go? */
    public SalariedEmployee() {}
    private double annualSalary;
    private double annualBonus;

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    @Override
    public final double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        if(  annualSalary < 0 || annualSalary > 9999999) {
        System.out.println("Please enter a valid Salary");
    }
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
          if( annualBonus < 0 || annualBonus > 100000) {
        System.out.println("Please enter a valid Bonus");
    }
        this.annualBonus = annualBonus;
    }

    
}
