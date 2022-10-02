/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description: In the MyFarm class, an array of length 6 will created and will consist of objects that extend from the
 * FarmAnimal class. After this array is created, the objects within it will be printed out.
 */

package Exercise1;

public class MyFarm {
    public static void main(String[]args){
        FarmAnimal [] farmAnimals = new FarmAnimal[6];

        farmAnimals[0] = new Chicken("co","male",12,3,"Cock-a-Doodle-do");
        farmAnimals[1] = new Cow("spots", "female", 100,2,"Moo");
        farmAnimals[2] = new Cow("Linda","female",120,4,"Moo");
        farmAnimals[3] = new Duck("Goose","male",20,2,"Quack-Quack");
        farmAnimals[4] = new Chicken("Bob", "female", 15,5,"Cock-a-Doodle-doo");
        farmAnimals[5] = new Cow("Mary", "female", 125,6,"Moo");

        for(FarmAnimal a: farmAnimals){
            System.out.println(a);
        }
    }
}
