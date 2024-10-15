public class Passenger {
    
    private String name;
    /**
     * constructor
     * @param name name of passenger
     */
    public Passenger(String name) {
        this.name = name;
    }
    /**
     * Returns name
     * @return name
     */
    public String getName(){
        return this.name;
    }


    //methods
    /**
     * Adds passenger to a car
     * @param c car to get onto
     */
    public void boardCar(Car c){

        try {
            // Attempt to add the passenger to the car
            if (c.addPassenger(this)) {
                System.out.println(name + " successfully boarded the car.");
                
            } else {
                throw new Exception("Failed to board the car: Car is full.");
            }
        } catch (Exception e) {
            // Catch any exceptions and print the error message
            System.out.println(e.getMessage());
            
        }
        
    }

    /**
     * Removes passenger from a car
     * @param c car to get off of
     */
    public void getOffCar(Car c){

        try {
            // Attempt to remove the passenger from the car
            if (c.removePassenger(this)) {
                System.out.println(name + " successfully got off the car.");
                
            } else {
                throw new Exception("Failed to get off the car: Passenger is not on the car.");
            }
        } catch (Exception e) {
            // Catch any exceptions and print the error message
            System.err.println(e.getMessage());
            
        }
        
        
    }
    /**
     * toString tells program how to print
     * @return name of passenger
     */
    public String toString(){
        return this.name;
    }

}
