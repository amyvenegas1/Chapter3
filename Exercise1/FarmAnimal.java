/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description: The FarmAnimal class will serve as a superclass that will be extended from by subclasses.
 * In this superclass, three attributes will be created, name, gender and weight.
 */

package Exercise1;

public abstract class FarmAnimal {
    private String name;
    private String gender;
    private double  weight;
    private int age;

    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "[name= " + name + ", gender= "+ gender + ", weight= " + weight + ",age= " + age + "]";
    }

    public abstract String feedLoadingSchedule();
}
