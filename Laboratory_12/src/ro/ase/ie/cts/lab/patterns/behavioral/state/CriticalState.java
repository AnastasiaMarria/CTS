package ro.ase.ie.cts.lab.patterns.behavioral.state;

public class CriticalState implements IHeroState{
    @Override
    public void getHit(int noPoints, Superhero hero) {
        hero.points -=noPoints;
        if(hero.points<=0){
            System.out.println("GAME OVER");
        }
    }

    @Override
    public void move() {
        System.out.println("Is not moving");
    }
}
