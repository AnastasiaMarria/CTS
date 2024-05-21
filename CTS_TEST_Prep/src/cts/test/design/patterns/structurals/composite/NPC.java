package cts.test.design.patterns.structurals.composite;

public class NPC extends CompositeNode{  //represent an individual NPC
    @Override
    public void move(int distance) {
        System.out.println("The NPC moves");  // Prints "The NPC moves" when called.
    }

    @Override
    public void shoot(int power) {
        System.out.println("The NPC shoots");  // Prints "The NPC shoots" when called.

    }
}
