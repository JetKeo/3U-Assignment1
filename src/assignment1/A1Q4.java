/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 // Creating a city called kitchener
        City kitchener = new City();
       //Creating a robot named jimmy & timmy that lives in kitchener
       Robot jimmy = new Robot(kitchener, 0, 0,Direction.SOUTH);
       Robot timmy = new Robot(kitchener, 0, 1,Direction.SOUTH);
      //creating a wall
       new Wall(kitchener, 0,1, Direction.WEST);
       new Wall(kitchener, 1,1, Direction.WEST);
       new Wall(kitchener, 1,1, Direction.SOUTH);
       //moving jimmy
       jimmy.move();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.move();
       
       //moving timmy
       timmy.move();
       timmy.turnLeft();
       timmy.move();
       //turning right
       timmy.turnLeft();
       timmy.turnLeft();
       timmy.turnLeft();
       //moving timmy
       timmy.move();
       timmy.turnLeft();
       timmy.turnLeft();
       timmy.turnLeft();
       timmy.move();
       
      
    }
}
