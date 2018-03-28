package cctairline;

/**
 *
 * @author Marcos
 */
public class Flight {
    
    private String origin;
    private String destination;
    private String departureTime;
    private String dateFlight;
    private Aircraft aircraft;

    public Flight(String origin, String destination, String departureTime, String dateFlight, Aircraft aircraft) {
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.dateFlight = dateFlight;
        this.aircraft = aircraft;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDateFlight() {
        return dateFlight;
    }

    public void setDateFlight(String dateFlight) {
        this.dateFlight = dateFlight;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
    
    void schedule(String arrivalTime){
        
    }
    
    void schedule(String arrivalTime, String departureTime){
        
    }

    @Override
    public String toString() {
        return "Flight{" + "origin=" + origin + ", destination=" + destination + ", departureTime=" + departureTime + ", dateFlight=" + dateFlight + ", aircraft=" + aircraft + '}';
    }
    
    

}
