package ro.ase.ie.cts.lab.patterns.behavioral.observer;

public interface IConnectionObserver {
    public void connectionLost();
    public void connectionOpen();
}
