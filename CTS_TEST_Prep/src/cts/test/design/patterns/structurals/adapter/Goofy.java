package cts.test.design.patterns.structurals.adapter;

public class Goofy extends DisneyHero {

    public Goofy(){
        this.name="Goofy";
        this.stamina=1000;
    }
    @Override
    public void run(int distance) {
        System.out.print(this.name + "runs");

    }

    @Override
    public void jump() {
        System.out.print(this.name+"jumps");

    }

    @Override
    public void push() {
        System.out.print(this.name + "pushes other hero");

    }
}