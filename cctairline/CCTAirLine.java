package cctairline;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Marcos
 */
public class CCTAirLine {

    public static void main(String[] args) {
        
        Pilot p1 = new Pilot("Rick Vasquez", 1037);
        Pilot p2 = new Pilot("Toby liver", 1120);
        Pilot p3 = new Pilot("Lucas Phelps", 1507);
        Pilot p4 = new Pilot("Lee Taylor", 1370);
        Pilot p5 = new Pilot("Diogo Da Silva", 1005);
        
        Cargo cargo1 = new Cargo("Boeing","737-700",p1.getName(),10,10,3000);
        Cargo cargo2 = new Cargo("Boeing","737-700",p2.getName(),10,10,3000);
        Cargo cargo3 = new Cargo("Boeing","737-700",p4.getName(),10,10,3000);
        Commercial commercial01 = new Commercial("Boeing","747-8",p3.getName(),350,10,300);
        Commercial commercial02 = new Commercial("Airbus","A-320",p3.getName(),350,10,300);
        
        Flight flight1 = new Flight("Paris","London","27/01/2018","27/01/2018",cargo1);
        Flight flight2 = new Flight("Berlin","Dublin","27/01/2018","29/01/2018",cargo2);
        Flight flight3 = new Flight("Marrocos","Sevilia","29/01/2018","29/01/2018",cargo3);
        Flight flight4 = new Flight("Madri","Frankford","29/01/2018","29/01/2018",commercial01);
        Flight flight5 = new Flight("Lisboa","Dublin","29/01/2018","29/01/2018",commercial02);
        

        System.out.println(p1.toString());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(p2.toString());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(p3.toString());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(p4.toString());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(p5.toString());
        System.out.println("------------------------------------------------------------------------");
    }
    
}
