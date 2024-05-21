package ro.ase.ie.cts.lab.patterns.behavioral.chain;

public abstract class HitHandler {

    HitHandler next;

    public void setNext(HitHandler next) {
        this.next = next;
    }

    public abstract void handleHit(int noPoints, Superhero hero);
}