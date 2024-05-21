package ro.ase.ie.cts.lab.patterns.behavioral.state;


public class Test {
    public static void main(String[] args) {

       Superhero hero = new Superhero("Batman");

       hero.move();

       hero.isHit(20);
       hero.move();

        hero.isHit(40);
        hero.move();

        hero.isHit(35);
        hero.move();

        hero.isHit(20);
        hero.move();




    }
}