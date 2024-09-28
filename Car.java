import java.util.ArrayList;
/**
 * Class Car keeps track of passengers in a car and holds methods to add/remove passengers.
 */
public class Car {
    private ArrayList<Passenger> passengers;
    private int capacity;

    //constructor
    /**
     * Constructor
     * @param maxCapacity
     */
    public Car(int maxCapacity){

        this.capacity = maxCapacity;
        this.passengers = new ArrayList<>(capacity);
    }

    //methods

    /**
     * Returns capacity
     * @return capacity
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     * returns seats remaining
     * @return seats remaing in a car
     */
    public int seatsRemaining(){
        return capacity - passengers.size();
    }

    /**
     * Adds a passenger p to the car. 
     * @param p
     * @return T/F if the passenger was added
     */
    public boolean addPassenger(Passenger p){

        if(seatsRemaining() > 0 ){
            if(passengers.contains(p)){
                System.out.println(p.getName() + " is already in the car.");
                return false;
            }else{
            passengers.add(p);
            return true;
            }
        }
        System.out.println("No seats remaining for: " + p.getName());
        return false;
    }

    /**
     * Removes a passenger from the car
     * @param p
     * @return T/F if the passenger was removed
     */
    public boolean removePassenger(Passenger p){
        if(passengers.contains(p)){
            passengers.remove(p);
            return true;
        }
        System.out.println(p.getName() +" is not on this car.");
        return false;
    }
    
    /**
     * Prints names of passengers on the car.
     */
    public void printManifest(){
        if(passengers.isEmpty()){
            System.out.println("This car is EMPTY.");
        }else{
            System.out.println("Passengers on this car: ");
            for (Passenger p : passengers) {
                System.out.println("- " + p.getName());
            }
        }

    }
    /**
     * Checks if car is empty
     * @return T/F if its empty
     */
    public boolean isEmpty(){
        return passengers.size() == 0;
    }

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        Car myCar = new Car(10);
        //myCar.printManifest();
        myCar.addPassenger(new Passenger("Vivian"));
        
        myCar.printManifest();
    }
}