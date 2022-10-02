/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description:In the ThingsThatMove class, an array of objects that implement the Movement interface will be created and
 * then printed out. Because the Movement interface is an extension of the Flight interface, it will also print out the
 * fly() method.
 */

package Exercise2_3;

public class ThingsThatMove {
    public static void main(String[]args){
        Movement [] movementList = new Movement[3];

        movementList[0] = new Airplane("Boeing 737",2014);
        movementList[1] = new Bird("Cardinal");
        movementList[2] = new Bird("Blue Jay");

        for(Movement m: movementList){
            System.out.println(m);
            m.fly();
            m.walk();
            m.jump();
        }
    }
}
