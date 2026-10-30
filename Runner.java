import acm.program.*;
import acm.graphics.*;

public class Runner extends GraphicsProgram {

    public void run() {
        add(new GRect(100, 100, 200, 200));
    }

    public static void main(String[] args) {

        Runner world = new Runner();
        world.start();      

    }

}