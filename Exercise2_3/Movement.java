/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: September 30, 2022
 * Description:This Movement Interface extends the Flight interface, and has two void funcitions of its own; walk() and
 * jump(). These methods will be overridden in the classes that implement it.
 */

package Exercise2_3;

public interface Movement extends Flight{
    void walk();
    void jump();



}
