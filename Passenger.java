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
        if(!c.addPassenger(this)){
            System.out.println("Car Full");
        }else{
            System.out.println("Passenger boarded.");
        }
        
    }

    /**
     * Removes passenger from a car
     * @param c car to get off of
     */
    public void getOffCar(Car c){
        if(!c.removePassenger(this)){
            System.out.println("Passenger not on board.");
        }else{
            System.out.println("Passenger removed.");
        }
    }
    /**
     * toString tells program how to print
     */
    public String toString(){
        return this.name;
    }

}
