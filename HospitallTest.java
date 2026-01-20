import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class HospitallTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitallTest
{
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList();
        
        //variable initialization for looping process
        char choice = 'Y';
        while(choice == 'Y' || choice == 'y') //condition check
        {
            System.out.println("Enter Patient's Name: ");
            String patientName = sc.nextLine();
        
            System.out.println("Enter Patient's Age: ");
            int age = sc.nextInt();
        
            System.out.println("Enter Days Admitted: ");
            int daysAdmitted = sc.nextInt();
        
            System.out.println("Enter Daily Charge: ");
            double dailyCharge = sc.nextDouble();
            
            //using ArrayList to store patient details
            patients.add(new Patient(patientName, age, daysAdmitted, dailyCharge));
            
            //asks whether you want to calculate bill of another patient or not
            System.out.println("Do you want to calculate bill for another patient? ");
            choice = sc.next().charAt(0);
            
            sc.nextLine(); //clears buffer from previous inputs
        }
        
        //looping for printing patient details and total hospital bill
        for(Patient patient: patients)
        {
            System.out.println(patients);
            double totalBill = patient.calculateTotalBill();
            System.out.println("Total hospital bill: " + totalBill);
            
            System.out.println();
        }
    }
}