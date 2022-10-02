/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description: The chicken class is a subclass of the FarmAnimal class, this class will use the same attributes of its
 * superclass, but will have an additional attribute, sound.
 */

package Exercise1;

public class Chicken extends FarmAnimal{
    public String sound;

    public Chicken(String name, String gender, double weight, int age, String sound){
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString(){
        return "Chicken " + sound + super.toString();
    }


    @Override
    public String feedLoadingSchedule() {
        return "8am-4pm";
    }
}


