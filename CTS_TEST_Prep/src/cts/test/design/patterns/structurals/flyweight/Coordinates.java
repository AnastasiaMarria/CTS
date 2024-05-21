package cts.test.design.patterns.structurals.flyweight;

public class Coordinates {
    int x;
    int y;

    public Coordinates(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }


    //getters for x and y
    public int getX() {
        return x;  //returns the x- cooordinate
    }

    public int getY() {
        return y; //returns the y coordinate
    }
}
