
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
        System.out.println(car);
        
        MileageTracker car2 = new MileageTracker(10000, 1000);
        System.out.println(car2);
        
        MileageTracker car3 = new MileageTracker();
        System.out.println(car3);
        
        
    }
}
