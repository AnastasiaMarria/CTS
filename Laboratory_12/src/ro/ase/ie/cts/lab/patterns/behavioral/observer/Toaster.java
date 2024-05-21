package ro.ase.ie.cts.lab.patterns.behavioral.observer;

public class Toaster implements IConnectionObserver{


    @Override
    public void connectionLost() {
        System.out.println("Popup show: Connection is Lost!");
    }

    @Override
    public void connectionOpen() {
        System.out.println("Popup show: Connection done. ");

    }
}
