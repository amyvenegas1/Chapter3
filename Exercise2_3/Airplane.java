/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description:This Airplane class was made to create an airplane object in the ThingsThatFly and ThingsThatMove classes,
 * this class will implement methods found within the Flight and Movement interfaces. It will override the methods within
 * the class.
 */

package Exercise2_3;

public class Airplane implements Flight, Movement{
    private String model;
    private int year;

    public Airplane(String model, int year){
    this.model = model;
    this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void fly(){
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    public void walk(){
        System.out.println("I tax on my wheels.");
    }

    public void jump(){
        System.out.println("I cannot jump.");
    }

    public String toString(){
        return "Airplane [model= " + model + ", year= " + year + "]: ";
    }
}
