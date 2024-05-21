package ro.ase.ie.cts.lab.patterns.behavioral.state;

public class Superhero {

    public static int NORMAL_LEVEL = 100;
    public static int WOUNDED_LEVEL = 50;
    public static int CRITICAL_LEVEL =10;
    String name;
    int points;
    IHeroState state;


    public Superhero(String name) {
        super();
        this.name = name;
        this.points = NORMAL_LEVEL;
        //TO DO: set an initial state
        this.state =new NormalState();

    }
    public void setState(IHeroState state){
        this.state= state;
    }


    public void move(){
        this.state.move();
    }

    public void isHit(int noPoints){
        this.state.getHit(noPoints, this);
    }
}
