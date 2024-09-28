/**
 * Engine handles fuel.
 */
public class Engine {

    //attributes
    private FuelType fuelType;
    private double currentFuel, maxFuel;

    /**
     * Constructor
     * @param f
     * @param fuel
     */
    public Engine(FuelType f, double fuel){
        this.fuelType = f;
        this.currentFuel = fuel;
        this.maxFuel = fuel;
    }

    //getters 
    /**
     * Returns fuel type
     * @return fuel type
     */
    public FuelType getFuelType(){
        return fuelType;
    }
    /**
     * Returns fuel type
     * @return fuel type
     */
    public double getCurrentFuel(){
        return currentFuel;
    }

    /**
     * Returns max fuel
     * @return max fuel
     */
    public double getMaxFuel(){
        return maxFuel;
    }

    //methods
    /**
     * Sets current fuel to max fuel
     */
    public void refuel(){
        currentFuel = maxFuel;
    }
    /**
     * Decreases fuel level. 
     * @return T/F if fuel is greater than 0
     */
    public boolean go(){
        currentFuel -= 5; //decrease fuel
        System.out.println("Remaining Fuel: " + this.currentFuel);
        return (this.currentFuel > 0);
    }

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}