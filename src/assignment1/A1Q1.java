package assignment1;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keonj9218
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a city called kitchener
        City kitchener = new City();
       //Creating a robot named jimmy that lives in kitchener
       Robot jimmy = new Robot(kitchener, 0, 2,Direction.WEST);
       //Creating a square wall
      new Wall(kitchener, 1, 2, Direction.EAST);
      new Wall(kitchener, 2, 2, Direction.EAST);
      new Wall(kitchener, 2, 2, Direction.SOUTH);
      new Wall(kitchener, 2, 1, Direction.SOUTH);
      new Wall(kitchener, 1, 1, Direction.WEST);
      new Wall(kitchener, 2, 1, Direction.WEST);
      new Wall(kitchener, 1, 1, Direction.NORTH);
      new Wall(kitchener, 1, 2, Direction.NORTH);
      //Moving jimmy around the wall
      jimmy.move();
      jimmy.move();
      jimmy.turnLeft();
      jimmy.move();
      jimmy.move();
      jimmy.move();
      jimmy.turnLeft();
      jimmy.move();
      jimmy.move();
      jimmy.move();
      jimmy.turnLeft();
      jimmy.move();
      jimmy.move();
      jimmy.move();
      jimmy.turnLeft();
      jimmy.move();
    }
}
