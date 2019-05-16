import java.util.Scanner;
import java.io.*;

import pkg.Grid;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(4, 4, 2, 2);
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Move forward");
        System.out.println("(2) Move backward");
        System.out.println("(3) Turn left");
        System.out.println("(4) Turn right");
        System.out.println("(5) Check direction");
        System.out.println("(0) Quit");
        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input == 0) {

                if (grid.isDotOnGrid()) grid.dot.printPosition();
                else grid.dot.printFailedSimulation();
                
                sc.close();
                System.exit(0);
                break;
            }
            switch (input) {
                case 1:
                    grid.dot.moveForward();
                    System.out.println("You moved forward.");
                    break;
                case 2:
                    grid.dot.moveBackward();
                    System.out.println("You moved backward.");
                    break;
                case 3:
                    System.out.println("You moved 90 degree to the right.");
                    grid.dot.turnRight();
                    break;
                case 4:
                    System.out.println("You moved 90 degrees to the left.");
                    grid.dot.turnLeft();
                    break;
                case 5:
                    System.out.println("Your direction is: " + grid.dot.getDirection());
                    break;
            }
        }
    }
}