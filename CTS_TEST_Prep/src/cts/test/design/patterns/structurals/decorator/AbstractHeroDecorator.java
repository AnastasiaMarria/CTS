package cts.test.design.patterns.structurals.decorator;

public abstract class AbstractHeroDecorator implements ISuperhero {
    ISuperhero hero;

    public AbstractHeroDecorator(ISuperhero hero) {
        this.hero = hero;
    }

    @Override
    public void jump() {
        this.hero.jump();
    }


}
