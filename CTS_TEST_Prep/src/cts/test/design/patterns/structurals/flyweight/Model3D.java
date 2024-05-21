package cts.test.design.patterns.structurals.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model3D implements Interface3DModel{

    //permanent state
    String name;  //name of the model
    List<Integer> points;  //list of points representing the model

    // CONSTRUCTOR -> Initializes the model with a given name, prints a loading message, and populates the points with random values.
    public Model3D(String name) {
        super();
        this.name = name;

        System.out.println("Loading model for " + name);
        Random random = new Random();
        int noPoints = random.nextInt(100);
        points = new ArrayList<>(noPoints);
        for(int i=0; i<noPoints;i++)
        {
            points.add(random.nextInt());
        }
    }

    @Override
    public void display(Coordinates coordinates, String color) {
        System.out.println("Display: " + this.name);
        System.out.println("Number of points : " + this.points.size());
        System.out.println("Coordinates " + coordinates.getX() + ":" + coordinates.getY());
        System.out.println("Color: " + color);

    }
}
