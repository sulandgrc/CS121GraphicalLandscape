import acm.program.GraphicsProgram;
import acm.graphics.*;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Landscape extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 300;

    public static final int ROAD_WIDTH = 400;
    public static final int ROAD_HEIGHT = 100;

    public static final int MARKER_WIDTH = 30;
    public static final int MARKER_HEIGHT = 10;

    public static final int CAR_WIDTH = 50;
    public static final int CAR_HEIGHT = 25;

    public static final int SUN_SIZE = 50;

    public GOval sun; // declare sun here so it can be seen throughout the class.

    public void run() {
        // set the background color of the window
        setBackground(Color.CYAN);

        drawRoad();

        drawRoadMarkers();

        drawSun();

        //TODO: drawTree();

        // give the program "ears" for keyboard events
        addKeyListeners();

        drawMoveCar();

    }

    // This method is automatically called when a key is
    // pressed is addKeyListeners() was previously called
    public void keyPressed(KeyEvent e) {


    }

    // This method draws and moves the car along the highway
    // and makes the car reappear on the left side if it drives off
    // the right
    public void drawMoveCar() {
        GRect car = new GRect(10, 210, CAR_WIDTH, CAR_HEIGHT);
        car.setFilled(true);
        car.setColor(Color.RED);
        add(car);

        // TODO: make car move with infinite while

    }

    // This method draws the sun in the window
    // Note the sun is declared at the top of the class
    // so it can be accessed in the keyPressed method
    public void drawSun() {
        sun = new GOval(325, 25, SUN_SIZE, SUN_SIZE);
        sun.setFilled(true);
        sun.setColor(Color.YELLOW);
        add(sun);
    }

    // This method draws a black road in the window
    public void drawRoad() {
        GRect road = new GRect(0, 200, ROAD_WIDTH, ROAD_HEIGHT);
        road.setFilled(true);
        road.setColor(Color.BLACK);
        add(road);
    }

    // TODO: This method adds yellow highway divider lines to the highway
    public void drawRoadMarkers() {


    }

    // TODO: This method adds a tree to the landscape
    public void drawTree() {


    }

    public static void main(String[] args) {
        new Landscape().start();

    }

}
