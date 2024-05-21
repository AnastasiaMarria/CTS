package ro.ase.ie.cts.lab.patterns.behavioral.state;

public class WoundedState implements IHeroState{
    @Override
    public void getHit(int noPoints, Superhero hero) {
        hero.points -= noPoints;
        if(hero.points <= Superhero.CRITICAL_LEVEL){
            //TO DO: switch to critical state
            hero.setState(new CriticalState());
        }
    }

    @Override
    public void move() {
        System.out.println("Hero is moving slowly");
    }
}
