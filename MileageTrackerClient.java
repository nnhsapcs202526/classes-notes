
/**
 * Write a description of class MileageTrackerClient here.
 *
 * @author mrcallaghan
 * @version 17sep2025
 */
public class MileageTrackerClient
{
    public static void main()
    {
        // test code
        //MileageTracker car = new MileageTracker();
        //System.out.println(car);
        
        MileageTracker car2 = new MileageTracker(10000, 1000);
        System.out.println(car2);
        car2.incrementDistanceDriven(100);
        car2.incrementFuelConsumed(10);
        System.out.println(car2);
        car2.incrementDistanceDriven(100);
        car2.incrementFuelConsumed(15);
        System.out.println(car2);
        
        
        //MileageTracker car3 = new MileageTracker();
        //System.out.println(car3);
        
        //BankAccount ba = new BankAccount();
        
    }
}
