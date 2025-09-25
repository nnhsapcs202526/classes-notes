
/**
 * Write a description of class MileageTrackerClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MileageTrackerClient
{
       public static void main()
    {
        MileageTracker car = new MileageTracker();
        //System.out.println(car);
        
        MileageTracker car2 = new MileageTracker(10000, 1000);
        System.out.println(car2);
        
        car2.incrementFuelConsumed(100);
        car2.incrementDistanceDriven(1000);
        
        // printing the object reference will display the String from toString method
        System.out.println(car2);
        
        MileageTracker car3 = new MileageTracker();
        //System.out.println(car3);
        
        
    }
}
