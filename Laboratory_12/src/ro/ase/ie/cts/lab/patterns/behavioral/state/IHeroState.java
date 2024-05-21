package ro.ase.ie.cts.lab.patterns.behavioral.state;

public interface IHeroState {
    public void getHit(int noPoints, Superhero hero);  //trimitem referinta catre obiect cu Superhero hero
    public void move();
}
