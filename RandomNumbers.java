import acm.graphics.*;
import acm.program.*;

import java.awt.Color;
import java.util.Random;
/**
 * Name: <your name here>
 *
 * CS 121
 *
 * Core Topics: Random Number Generation and Color objects
 */
public class RandomNumbers extends GraphicsProgram {

    public static final int APPLICATION_HEIGHT = 300;
    public static final int APPLICATION_WIDTH = 400;
    public static final int MAX_RGB_VALUE = 255;

    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Random number between 5 and 10: " + random5To10());
        }

        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Random number between 100 and 115: " + randomInteger(100, 115));
        }

        System.out.println("\nColor generated: " + randomColor());

        System.out.println("\nX coordinate generated: " + randomCoordinate('x'));
        System.out.println("\nY coordinate generated: " + randomCoordinate('y'));
        System.out.println("\nZ coordinate generated: " + randomCoordinate('z'));

        // draws randomly colored lines in random locations
        randomColorLines();

        // draws randomly colored ovals in random locations
        randomColorOvals();
    }

    /**
     * @return a random integer between 5 and 10 inclusive
     */
    public int random5To10() {


        return 0;

    }
    
    /**
     * This method returns a random integer between min and max inclusive [min, max]
     *
     * @param min smallest random number to generate
     * @param max largest random number to generate
     * @return randomly generated number
     */
    public int randomInteger(int min, int max) {


        return 0;
    }

    /**
     * This method constructs a random color using a Color constructor that accepts the
     * red, green, and blue components of the color. The RGB components are integers in the
     * range 0 - 255 where 0 is the absence of the color component and 255 is the maximum
     * color component
     * Color color = new Color(redComponent,greenComponent,blueComponent);
     * Examples:
     * Color red = new Color(255,0,0);
     * Color green = new Color(0,255,0);
     * Color blue = new Color(0,0,255);
     *
     * @return a random Color object
     */
    public Color randomColor() {


        return null;
    }

    /**
     * This method generates an integer coordinate location that is in the current
     * window space.  This method expects an 'x' or 'y' as a coordinate parameter. If 'x' or 'y'
     * is not passed an IllegalArgumentException is thrown.
     *
     * @param coordinate indicates whether x or y coordinate is desired
     * @return an integer coordinate location
     */
    public int randomCoordinate(char coordinate) {


        return 0;
    }

   /**
     * This method generates random Colors and random x and y coordinates and adds GLines
     * objects with the random color and location to the window
     */
    public void randomColorLines() {

    }
    
    /**
     * TODO: This method generates random Colors and random x and y coordinates and adds filled GOval
     * objects with the random color and location to the window
     */
    public void randomColorOvals() {

    }

    public static void main(String[] args) {
        new RandomNumbers().start();
    }

}

