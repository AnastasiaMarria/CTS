package cts.test.design.patterns.structurals.adapter;

public class Superhero implements ISuperhero {
    String name;
    int points;

    public Superhero(String name) {
        super();
        this.name = name;
        this.points=points;
    }

    @Override
    public void run() {
        System.out.print("Is running");
    }

    @Override
    public void jump() {
        System.out.print("Is jumping");
    }

    @Override
    public void attack(String other) {
        System.out.print(this.name + "is attacking" + other);
    }
}
