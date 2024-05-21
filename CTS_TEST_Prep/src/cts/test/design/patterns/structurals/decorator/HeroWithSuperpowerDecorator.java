package cts.test.design.patterns.structurals.decorator;

public class HeroWithSuperpowerDecorator extends AbstractHeroDecorator{

    String superpower;


    public HeroWithSuperpowerDecorator(
            ISuperhero hero, String power) {
        super(hero);
        this.superpower = power;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        this.hero.run();
    }

    @Override
    public void attack(String other) {
        System.out.println(
                "Hero is using " + this.superpower +
                        " against " + other);
    }

}