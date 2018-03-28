package cctairline;

/**
 *
 * @author Marcos
 */
public class Licence {
   
    public int pilot(float flightHours){
        
        if(flightHours >= 100 && flightHours < 200){
            return 1;
        }else if(flightHours >= 200 && flightHours < 300){
            return 2;
        }else if(flightHours >= 300 && flightHours < 500){
            return 3;
        }else if(flightHours >= 500 && flightHours < 700){
            return 4;
        }else if(flightHours >= 700 && flightHours < 800){
            return 5;
        }else if(flightHours >= 800 && flightHours < 1000){
            return 6;
        }else if(flightHours >= 1000 && flightHours < 1200){
            return 7;
        }else if(flightHours >= 1200 && flightHours < 1400){
            return 8;
        }else if(flightHours >= 1400 && flightHours < 1600){
            return 9;
        }else if(flightHours >= 1600 && flightHours < 1800){
            return 10;
        }else if(flightHours >= 1800 && flightHours < 1900){
            return 11;
        }else if(flightHours >= 1900){
            return 12;
        }
        
        return 0;
    }
}
