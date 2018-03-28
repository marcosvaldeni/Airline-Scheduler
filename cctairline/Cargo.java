package cctairline;

/**
 *
 * @author Marcos
 */
public class Cargo extends Aircraft {
    
    private float weightLoad;

    public Cargo() {
    }

    public Cargo(String maker, String model, String pilot, int capacity, int crew, float weightLoad) {
        this.setMaker(maker);
        this.setModel(model);
        this.setPilot(pilot);
        this.setCapacity(capacity);
        this.setCrew(crew);
        this.weightLoad = weightLoad;
    }

    public float getWeightLoad() {
        return weightLoad;
    }

    public void setWeightLoad(float weightLoad) {
        this.weightLoad = weightLoad;
    }

    
}
