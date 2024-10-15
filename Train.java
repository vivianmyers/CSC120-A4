import java.util.ArrayList;
/**
 * Ties all other classes: Car, Enginer, Passenger into one Class
 */
public class Train {

    //attributes
    private final Engine ENGINE;
    private ArrayList<Car> cars;

    //constructor
    /**
     * Constructor
     * @param fuelType type of fuel
     * @param fuelCapacity max fuel
     * @param nCars max number of cars in a train
     * @param passengerCapacity max passenger number in a car
     */
    public Train(FuelType fuelType, double fuelCapacity, 
    int nCars, int passengerCapacity){
        this.ENGINE = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
    }

    //getters
    /**
     * Return engine
     * @return engine
     */
    public Engine getEngine(){
        return ENGINE;
    }
    /**
     * Returns car
     * @param i index of car to get
     * @return car
     */
    public Car getCar(int i){
        return cars.get(i);
    }
    /**
     * Adds up capacities over all the cars
     * @return total capacity of all cars
     */
    public int getMaxCapacity(){
        int max = 0;
 
        for (int i = 1; i < cars.size(); i++){
            
            max += cars.get(i).getCapacity();
            
        }
        return max;
    }

    /**
     * Calculates total seats remaining on all cars
     * @return seats remaining total
     */
    public int seatsRemaining(){
        int totalSeats = 0;
        for (Car car : cars) {
            totalSeats += car.seatsRemaining();
        }
        return totalSeats;
    }

    /**
     * Prints cars and all passenger on the car
     */
    public void printManifest(){
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + " manifest:");
            cars.get(i).printManifest();
        }
    }

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 3, 2);
        
        // Create some passengers
        Passenger alice = new Passenger("Alice");
        Passenger bob = new Passenger("Bob");
        Passenger charlie = new Passenger("Charlie");

        // Try to board passengers onto different cars
        alice.boardCar(myTrain.getCar(0));
        bob.boardCar(myTrain.getCar(0));
        charlie.boardCar(myTrain.getCar(0)); // This one should fail due to capacity

        // Print the train's manifest
        myTrain.printManifest();
        
        // Test the engine functionality
        while (myTrain.getEngine().go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}
