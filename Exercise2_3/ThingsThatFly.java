/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description:In this ThingsThatFly class, an array of objects that implement the flight class will be created and then
 * printed out.
 */

package Exercise2_3;

public class ThingsThatFly {
    public static void main(String[]args){
        Flight [] flightList = new Flight[3];

        flightList[0] = new Airplane("Boeing 737",2014);
        flightList[1] = new Bird("Cardinal");
        flightList[2] = new Bird("Blue Jay");

        for(Flight f:flightList){
            System.out.print(f);
            f.fly();
        }

    }
}
