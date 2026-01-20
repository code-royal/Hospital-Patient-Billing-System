
/**
 * @author PRAJWAL RAJBHANDARI
 * @version 20th Jan 2026
 */
public class Patient
{
    //attributes declaration
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;
    
    //parameterized constructor
    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge)
    {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    
    //setters and getters method for daysAdmitted
    public void setDaysAdmitted(int daysAdmitted)
    {
        this.daysAdmitted = daysAdmitted;
    }
    
    public int getDaysAdmitted()
    {
        return this.daysAdmitted;
    }
    
    //total hospital bill calulcation method
    public double calculateTotalBill()
    {
            if(daysAdmitted > 7) //for more than 7 days of hospital admission, 10% dicount is applied
            {
                double total = (getDaysAdmitted() * dailyCharge) - (getDaysAdmitted() * dailyCharge * 0.1);
                return total;
            }
            else
            {
                double total = getDaysAdmitted() * dailyCharge;
                return total;
            }
    }
    
    //patient details display method
    public String toString()
    {
        return "Patient's Name: " + this.patientName + "\nAge: " + this.age + "\nDays Admitted: " + getDaysAdmitted() + "\nDaily Charge: " + this.dailyCharge;
    }
}
