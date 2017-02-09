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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Creating a city called kitchener
        City kitchener = new City();
       //Creating a robot named jimmy & timmy that lives in kitchener
       Robot karel = new Robot(kitchener, 3, 3,Direction.EAST);
       Robot maria = new Robot(kitchener, 0, 1,Direction.WEST);
       
       //building walls
       new Wall(kitchener, 3, 3,Direction.SOUTH);
       new Wall(kitchener, 3, 3,Direction.EAST);
       new Wall(kitchener, 2, 3,Direction.EAST);
       new Wall(kitchener, 2, 3,Direction.NORTH);
       new Wall(kitchener, 2, 3,Direction.WEST);
       
       //creating Things on the ground
       new Thing(kitchener, 0, 0);
       new Thing(kitchener, 1, 0);
       new Thing(kitchener, 1, 1);
       new Thing(kitchener, 1, 2);
       new Thing(kitchener, 2, 2);
       
       //creating labels
       karel.setLabel("K");
       maria.setLabel("M");
       
       //moving maria & karel and picking up things
       maria.move();
       maria.pickThing();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.pickThing();
       maria.turnLeft();
       maria.move();
       maria.pickThing();
       karel.move();
       karel.pickThing();
       karel.turnLeft();
       maria.turnLeft();
       maria.move();
       maria.pickThing();

 
    }
}
