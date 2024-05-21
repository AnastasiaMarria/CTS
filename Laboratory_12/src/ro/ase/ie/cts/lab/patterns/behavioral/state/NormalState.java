package ro.ase.ie.cts.lab.patterns.behavioral.state;

public class NormalState implements  IHeroState{
    @Override
    public void getHit(int noPoints, Superhero hero) {
        hero.points -=noPoints;
        if(hero.points <= Superhero.WOUNDED_LEVEL){
            //TO DO: change state to wounded
            hero.setState(new WoundedState());
        }

    }

    @Override
    public void move() {
        System.out.println("Hero is running");
    }
}
