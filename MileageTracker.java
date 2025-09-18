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
     *          private: only accessible by methods in this class
     *      specify the type (e.g., int, double, String, etc.)
     *      specify the name (e.g., distanceDriven)
     *      
     *  Instance Variables differ from local variables in the following ways:
     *          scoped to the class (accessible in all methods of the class; lifetime is the same as the object)
     *          automatically initialized to a default value (0, false, null)
     *          best practice is not to immediately initialize instance variables (do so in constructor)
     */
    private int distanceDriven;  // in units of miles
    private int fuelConsumed;    // in units of gallons
    private String vin;          // vehicle id #

    /*
     * 3. Define the constructor(s) to initialize objects:
     *      responsible for intializing newly created objects
     *      invoked automatically via the 'new' operator
     *      name of the constructor must match the class name (e.g., MileageTracker)
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     * 
     */
    
    /**
     * Default constructor for the MileageTracker class.
     * 
     *      Initializes the object's miles driven and fuel consumed to zero.  Set's vin to null.
     */
    public MileageTracker()
    {
        /*
         * The "this" reserved word reference to the current object (like "self" in Python).
         *      It's usage is encouraged, but not always required.
         */
        this.distanceDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
        System.out.println("Default constructor executing...");
    }
    
    /**
     * Constructs a MileageTracker object with the intial miles driven and fuel consumed to specified values.
     *      vin will still be set to null.
     *      
     * @param intialDistanceDriven the number of miles driven already
     * @param intialFuelConsumed the amount of fuel already consumed
     */
    public MileageTracker(int initialDistanceDriven, int initialFuelConsumed)
    {
        this.distanceDriven = initialDistanceDriven;
        this.fuelConsumed = initialFuelConsumed;
        this.vin = null;
        System.out.println("Other constructor executing...");
    }
    
    
     /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public or private)
     *      the return type (e.g., void, int, double, Turtle, etc.)
     *      the method name (e.g., incrementDistanceDriven, getDistanceDriven)
     *      the parameters and their types (e.g., miles of type int)
     */
    
    /**
     * Increments the number of miles that the car has driven.
     * 
     * @param miles the additional distance, in miles, the car has driven
     */
    public void incrementDistanceDriven(int miles)  // method header or method signature
    {
        this.distanceDriven += miles;
        //this.distanceDriven = this.distanceDriven + miles;  // same as above
    }
      
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total number of miles driven
     */
    public int getDistanceDriven()
    {
        return this.distanceDriven;  
    }
    
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(int gallons)
    {
        this.fuelConsumed += gallons;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public int getFuelConsumed()
    {
        return this.fuelConsumed;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public int getMileage()
    {
        int mileage = this.distanceDriven / this.fuelConsumed;
        return mileage;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        return this.vin;
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param vin    the vehicle identification (VIN) of this car
     */
    public void setVIN(String newVIN)
    {
        /*
         * When the parameter is named 'vin', is "shadows" the instance variable 'vin'.  In this code,
         *  'vin' would refer to the parameter and not the instance variable.
         *  
         *  Local and parameter variables "shadow" instance varibales of the same name. 
         *  
         *  To refer explicitly to the instance variable, use 'this'.
         *  
         *  Best practice: avoid this issue altogether and give local, parameter, and instance variables
         *      unique names!
         */
        
        // bad
        //vin = vin;
        
        // better
        this.vin = vin;
        
        // best practice
        this.vin = newVIN;
    }
    

}






