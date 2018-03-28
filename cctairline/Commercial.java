package cctairline;

/**
 *
 * @author Marcos
 */
public class Commercial extends Aircraft {
    
    private int passenger;

    public Commercial() {
    }

    public Commercial(int passenger) {
        this.passenger = passenger;
    }
    
    public Commercial(String maker, String model, String pilot, int capacity, int crew, int passenger) {
        this.setMaker(maker);
        this.setModel(model);
        this.setPilot(pilot);
        this.setCapacity(capacity);
        this.setCrew(crew);
        this.passenger = passenger;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
    
    
    
}
