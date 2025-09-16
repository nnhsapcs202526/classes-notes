/**
 * This class models a mileage tracker for a car.
 *
 * @author mrcallaghan
 * @version 15sep2025
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables (to store the object's attributes):
     *      specify the visibility (e.g., private)
     *          public: accessible by any code in any class
     *          private: accessible only by methods in this class
     *      specify the type (e.g., int, double, String, etc.)
     *      specify the name (e.g., distanceDriven)
     *      
     *      Instance variables differ from local variables in the following ways:
     *          scoped to the class (accessible in all methods of this class; lifetime is the same as object)
     *          automatically initialized to a default value (0, false, null, etc.)
     *          best practice is not to immediately intitialize instance variables (do so in constructor)
     */
    private int distanceDriven;      // in units of miles
    






    
    /*
     * 3. Define the constructor(s) to initialize objects:
     */
    
    
    
    
    
    
    
    
    /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public, private)
     *      the return type (e.g., void, int)
     *      the method name (e.g., incrementDistanceDriven, getDistanceDriven)
     *      the parameters and their type (e.g., miles of type int)
     */
    
    /**
     * Increments the number of miles that the car has driven.
     * 
     * @param miles the additional distance, in miles, this car has driven.
     * 
     */
    public void incrementDistanceDriven(int miles)
    {
        // fill in later
    }
    
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total number of miles driven
     */
    public int getDistanceDriven()
    {
        return 0;  // fill in later
    }
        
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(int gallons)
    {
        //this.fuelConsumed += gallons;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public int getFuelConsumed()
    {
        //return this.fuelConsumed;
        return 0;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public int getMileage()
    {
        //int mileage = this.fuelConsumed / this.distanceDriven;
        //return mileage;
        return 0;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        //return this.vin;
        return "";
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param vin    the vehicle identification (VIN) of this car
     */
    public void setVIN(String vin)
    {
        //vin = vin;
    }
}






