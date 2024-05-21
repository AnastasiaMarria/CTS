package cts.test.design.patterns.structurals.flyweight;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelsFactory = new ModelFactory();
        Interface3DModel building = modelsFactory.getModel("Building");

        building.display(new Coordinates(10,10), "grey");
        building.display(new Coordinates(100,25), "white");

        Interface3DModel soldier = modelsFactory.getModel("Soldier");
        soldier.display( new Coordinates(15,15), "green");
        soldier.display( new Coordinates(150,25), "green");
    }
}