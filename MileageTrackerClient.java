
/**
 * Write a description of class MileageTrackerClient here.
 *
 * @author mrcallaghan
 * @version 25sep2025
 */
public class MileageTrackerClient
{
    public static void main()
    {
        // test code for creating MileageTracker objects
        //MileageTracker car1 = new MileageTracker();
        //System.out.println(car1);
        
        MileageTracker car2 = new MileageTracker(10000, 1000);
        System.out.println(car2);
        car2.incrementDistanceDriven(1000);
        car2.incrementFuelConsumed(100);
        System.out.println(car2);
        car2.incrementDistanceDriven(900);
        car2.incrementFuelConsumed(100);
        System.out.println(car2);
        
        
        
        
        //MileageTracker car3 = new MileageTracker(10000, 1000);
        //System.out.println(car3);
        
        //BankAccount account = new BankAccount();
    }
}
