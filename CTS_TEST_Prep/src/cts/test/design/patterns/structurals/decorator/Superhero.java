package cts.test.design.patterns.structurals.decorator;

public class Superhero implements ISuperhero{

    String name;
    int points;

    public Superhero(String name) {
        super();
        this.name = name;
        this.points = 100;
    }
    @Override
    public void run() {
        System.out.println("Is running");
    }

    @Override
    public void jump() {
        System.out.println("Is jumping");
    }

    @Override
    public void attack(String other) {
        System.out.println(
                this.name + " is attacking " + other);
    }
}
