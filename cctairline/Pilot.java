package cctairline;

/**
 *
 * @author Marcos
 */
public class Pilot {
    
    private String name;
    private float flightHours;
    private int rating;

    public Pilot() {
    }

    public Pilot(String name, float flightHours) {
        this.name = name;
        this.flightHours = flightHours;
        this.setRating(pilot(this.flightHours));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(float flightHours) {
        this.flightHours = flightHours;
    }

    public int getRating() {
        return rating;
    }

    private void setRating(int rating) {
        
        this.rating = rating;
    }
    
    public int pilot(float fHours){
        
        if(fHours >= 100 && fHours < 200){
            return 1;
        }else if(fHours >= 200 && fHours < 300){
            return 2;
        }else if(fHours >= 300 && fHours < 500){
            return 3;
        }else if(fHours >= 500 && fHours < 700){
            return 4;
        }else if(fHours >= 700 && fHours < 800){
            return 5;
        }else if(fHours >= 800 && fHours < 1000){
            return 6;
        }else if(fHours >= 1000 && fHours < 1200){
            return 7;
        }else if(fHours >= 1200 && fHours < 1400){
            return 8;
        }else if(fHours >= 1400 && fHours < 1600){
            return 9;
        }else if(fHours >= 1600 && fHours < 1800){
            return 10;
        }else if(fHours >= 1800 && fHours < 1900){
            return 11;
        }else if(fHours >= 1900){
            return 12;
        }
        
        return 0;
    }

    @Override
    public String toString() {
        return "Pilot{" + "name=" + name + ", flightHours=" + flightHours + ", rating=" + rating + '}';
    }
    
    
    
}
