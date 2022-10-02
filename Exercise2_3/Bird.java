/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description:This Bird class was made to create an airplane object in the ThingsThatFly and ThingsThatMove classes,
 * this class will implement methods found within the Flight and Movement interfaces. It will override the methods within
 * the class.
 */

package Exercise2_3;

public class Bird implements Flight, Movement{
    private String type;

    public Bird(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps its wings to fly.");
    }

    @Override
    public void walk(){
       System.out.println("I walk on my feet");
    }

    @Override
    public void jump(){
        System.out.println("I jump by leaping on my feet.");
    }

    @Override
    public String toString(){
        return "Bird[type= " + type + "]: ";
    }
}
