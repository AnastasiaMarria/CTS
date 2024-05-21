package cts.test.design.patterns.structurals.adapter;

public class Disney2SuperheroAdapter implements ISuperhero {
    DisneyHero disneyHero;

    public Disney2SuperheroAdapter(DisneyHero hero) {
        this.disneyHero=hero;
    }

    @Override
    public void run() {
        this.disneyHero.run(10);
    }

    @Override
    public void jump() {
        System.out.println("Disney hero is jumping");
    }

    @Override
    public void attack(String ohter) {
        this.disneyHero.push();
        System.out.println("....." + ohter);
    }
}
