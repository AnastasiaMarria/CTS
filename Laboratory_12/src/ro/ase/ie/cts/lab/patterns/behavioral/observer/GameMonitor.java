package ro.ase.ie.cts.lab.patterns.behavioral.observer;

public class GameMonitor implements IConnectionObserver{
    @Override
    public void connectionLost() {
        System.out.println("Saving game data");

    }

    @Override
    public void connectionOpen() {
        System.out.println("Reloading previous game data...");

    }
}
