package ro.ase.ie.cts.lab.patterns.behavioral.chain;

public class GameOverHandler extends HitHandler{

    @Override
    public void handleHit(int noPoints, Superhero hero) {
        if(hero.points <= 0) {
            System.out.println("Game over");
        }
        else {
            if(this.next != null) {
                this.next.handleHit(noPoints, hero);
            }
        }
    }

}