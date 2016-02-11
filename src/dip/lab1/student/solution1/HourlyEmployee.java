package dip.lab1.student.solution1;


/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;
    
    /** 
     * Default constructor. If you provide this your code will be
     * fragile because there's no guarantee the properties above will be
     * initialized.
     */
//    public HourlyEmployee() {}

    /**
     * Custom constructor. This is better because we guarantee
     * property initialization.
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    /* Custom implementation of Inteface contract. Therefore, this method
     * is polymorphic (common) to all employess and can be used in the
     * high-level class. The other methods are not part of the contract and
     * therefore can't be used in the high-level class.
     */
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }    
}


