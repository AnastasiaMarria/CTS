package ro.ase.ie.cts.lab.patterns.behavioral.chain;

public class ShieldHitHandler extends HitHandler{

    @Override
    public void handleHit(int noPoints, Superhero hero) {
        if(hero.hasShield) {
            hero.points -= noPoints/2;
        } else {
            hero.points -= noPoints;
        }

        System.out.println("Points left: " + hero.points);

        if(this.next != null) {
            this.next.handleHit(noPoints, hero);
        }
    }

}