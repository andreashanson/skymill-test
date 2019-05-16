package pkg;
import java.util.Random;

public class Dot {
    private int y;
    private int x;
    private int direction = 0;
    private final int NORTH = 0;
    private final int EAST = 1;
    private final int SOUTH = 2;
    private final int WEST = 3;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getDirection() {
        String directions[] = new String[4];
        directions[NORTH] = "NORTH";
        directions[EAST] = "EAST";
        directions[SOUTH] = "SOUTH";
        directions[WEST] = "WEST";
        return directions[this.direction];
    }

    public void turnRight() {
        switch (this.direction) {
            case NORTH:
                this.direction = EAST;
                break;
            case EAST:
                this.direction = SOUTH;
                break;
            case SOUTH:
                this.direction = WEST;
                break;
            case WEST:
                this.direction = NORTH;
                break;
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case NORTH:
                this.direction = WEST;
                break;
            case WEST:
                this.direction = SOUTH;
                break;
            case SOUTH:
                this.direction = EAST;
                break;
            case EAST:
                this.direction = NORTH;
                break;
        }
    }

    public void moveForward() {
        switch (this.direction) {
            case NORTH:
                this.y -= 1;
                break;
            case SOUTH:
                this.y += 1;
                break;
            case WEST:
                this.x -= 1;
                break;
            case EAST:
                this.x += 1;
                break;
        }
    }

    public void moveBackward() {
        switch (this.direction) {
        case NORTH:
            this.y += 1;
            break;
        case SOUTH:
            this.y -= 1;
            break;
        case WEST:
            this.x += 1;
            break;
        case EAST:
            this.x -= 1;
            break;
        }
    }

    public void printPosition() {
        String x = Integer.toString(this.x);
        String y = Integer.toString(this.y);
        System.out.println("[" +x+ ", "+y+"]");
    }

    public void printFailedSimulation() {
        System.out.println("[-1, -1]");
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
