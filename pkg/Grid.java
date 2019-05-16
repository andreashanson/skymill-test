package pkg;

import java.util.Random;

public class Grid {
    private final int width;
    private final int height;
    public Dot dot;

    public Grid(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.dot = new Dot(x, y);
    }

    public boolean isDotOnGrid() {
        if (this.dot.getX() > this.width - 1) {
            return false;
        }
        else if (this.dot.getX() < 0) {
            return false;
        }
        else if (this.dot.getY() > this.height - 1) {
            return false;
        }
        else if (this.dot.getY() < 0) {
            return false;
        }
        else {
            return true;
        }
    }
}