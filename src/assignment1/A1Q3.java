/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Creating a city called kitchener
        City kitchener = new City();
       //Creating a robot named jimmy that lives in kitchener
       Robot jimmy = new Robot(kitchener, 3, 0,Direction.EAST);
      //creating a flag
       new Thing(kitchener, 3, 1);
       //creating a mountain
       new Wall(kitchener, 3,2, Direction.WEST);
       new Wall(kitchener, 3,2, Direction.NORTH);
       new Wall(kitchener, 2,3, Direction.WEST);
       new Wall(kitchener, 1,3, Direction.WEST);
       new Wall(kitchener, 1,3, Direction.NORTH);
       new Wall(kitchener, 1,3, Direction.EAST);
       new Wall(kitchener, 2,4, Direction.NORTH);
       new Wall(kitchener, 3,4, Direction.EAST);
       new Wall(kitchener, 2,4, Direction.EAST);
       //moving jimmy across the mountain
       jimmy.move();
       jimmy.pickThing();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.putThing();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.move();
       jimmy.turnLeft();
               
       
    }
}
