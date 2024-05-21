package ro.ase.ie.cts.lab.patterns.behavioral.chain;

public class Superhero {
    String name;
    int points;
    boolean hasShield;

    public Superhero(String name, boolean hasShield) {
        super();
        this.name = name;
        this.hasShield = hasShield;
        this.points = 100;
    }

    public void isHit(int noPoints, HitHandler chain) {
        chain.handleHit(noPoints, this);
    }


}