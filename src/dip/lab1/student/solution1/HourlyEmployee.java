package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {

    /**
     * default constructor. Is this the best way to go?
     */
    public HourlyEmployee() {
    }
    private double hourlyRate;
    private double totalHrsForYear;

    /**
     * Convenience constructor. Is this the best way to go?
     *
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0 || hourlyRate > 1000) {
            System.out.println("Please input a correct amount");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear < 0 || totalHrsForYear > 99999) {
            this.totalHrsForYear = totalHrsForYear;
        }
    }

}
