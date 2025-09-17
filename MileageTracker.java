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
     *          specify the visibility (e.g., private)
     *              public: accessible by any code in any class
     *              private: only accessible by methods in this class
     *          specify the type (e.g., int, double, String, Turtle, etc.)
     *          specify the name (e.g., distanceDriven)
     *          
     *    Instance variables differ from local variables in the following ways:
     *      scoped to the entire class (accessible in any method of this class)
     *          lifetime is the same as the object.
     */
    private int distanceDriven;
    private int fuelConsumed;
    private String vin;
  
    /*
     * 3. Define the constructor(s) to initialize objects:
     *      responsible for intializing newly created objects
     *      invoked automatically via the new operator
     *      name of the constructor has to match the class name
     *      has no return type, not even void
     *      mulitple constructors may be written and defined for a class
     *      one constructor can call another (with restrictions)
     */
    
    /**
     * Default constructor (no parameters) for the MileageTracker class.
     *      Initializes the instance variables for fuel consumed and miles driven to 0; intializes vin to null.
     */
    public MileageTracker()
    {
        /*
         * The 'this' keyword references the current object (same as 'self' in Python).
         *      It's usage is not required (usually), but encouraged.
         */
        this.distanceDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
        System.out.println("Executing default constructor for a MileageTracker... ");
    }
    
    /**
     * Constructs a new MileageTracker with an initial distance driven and fuel consumed; intializes vin to null.
     * 
     * @param intialDistanceDriven the intial distance driven for the car
     * @param intialFuelConsumed the initial fuel consumed by the car
     */
    public MileageTracker(int initialDistanceDriven, int initialFuelConsumed)
    {
        this.distanceDriven = initialDistanceDriven;
        this.fuelConsumed = initialFuelConsumed;
        this.vin = null;
        System.out.println("Executing other constructor for a MileageTracker... ");
    }
    

    /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public, private)
     *      the return type (e.g., void, int, double, Turtle, String, etc.)
     *      the method name (e.g., incrementDistanceDriven, getDistanceDriven)
     *      the parameters and their types (e.g., miles of type int)
     */
    
    /**
     * Increments the number of miles that the car has driven
     * 
     * @param miles the additional distance, in miles, the car has driven
     */
    public void incrementDistanceDriven(int miles)  // method header or signature
    {
        // implement later
    }
    
    /**
     * Returns the total number of miles the car has driven
     * 
     * @return the number of miles the car has driven
     */
    public int getDistanceDriven()
    {
        // implement later
        return 0;
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






