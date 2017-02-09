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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // Creating a city called kitchener
        City kitchener = new City();
       //Creating a robot named jimmy that lives in kitchener
       Robot jimmy = new Robot(kitchener, 1, 2,Direction.SOUTH);
       //Creatiing a wall around jimmy
       new Wall(kitchener, 1, 2, Direction.SOUTH);
       new Wall(kitchener, 1, 2, Direction.EAST);
       new Wall(kitchener, 1, 2, Direction.NORTH);
       new Wall(kitchener, 1, 1, Direction.NORTH);
       new Wall(kitchener, 1, 1, Direction.WEST);
       new Wall(kitchener, 2, 1, Direction.WEST);
       new Wall(kitchener, 2, 1, Direction.SOUTH);
       //creating a "newspaper"
       new Thing(kitchener, 2, 2);
       //jimmy getting the newspaper
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.pickThing();
       //jimmy returning to original position with newspaper
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.move();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.turnLeft();
       jimmy.putThing();
       
    
       
             
    }
}
