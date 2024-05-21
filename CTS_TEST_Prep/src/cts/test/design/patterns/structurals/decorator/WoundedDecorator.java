package cts.test.design.patterns.structurals.decorator;

public class WoundedDecorator extends AbstractHeroDecorator{

    public WoundedDecorator(ISuperhero hero) {
        super(hero);
    }



    @Override
    public void run() {
        System.out.println("Is moving slow because is wounded");
    }

    @Override
    public void attack(String other) {
        this.hero.attack(other);
    }

}