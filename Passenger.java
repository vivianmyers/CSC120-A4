public class Passenger {
    
    private String name;
    /**
     * constructor
     * @param name
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
     * @param c
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
     * @param c
     */
    public void getOffCar(Car c){
        if(!c.removePassenger(this)){
            System.out.println("Passenger not on board.");
        }else{
            System.out.println("Passenger removed.");
        }
    }

    public String toString(){
        return this.name;
    }

}
