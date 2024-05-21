package ro.ase.ie.cts.lab.patterns.behavioral.chain;

public class HitLogger extends HitHandler{

    @Override
    public void handleHit(int noPoints, Superhero hero) {
        System.out.println(
                "Log: You got a hit of " + noPoints);
        if(this.next != null) {
            this.next.handleHit(noPoints, hero);
        }
    }

}