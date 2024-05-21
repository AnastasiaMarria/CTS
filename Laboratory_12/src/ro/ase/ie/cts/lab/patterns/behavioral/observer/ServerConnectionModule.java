package ro.ase.ie.cts.lab.patterns.behavioral.observer;

import java.util.ArrayList;

public class ServerConnectionModule {
    String serverIp;
    int serverPort;

    ArrayList<IConnectionObserver> observers = new ArrayList<>();

    public ServerConnectionModule(String serverIp, int serverPort) {
        super();
        this.serverIp = serverIp;
        this.serverPort = serverPort;
    }

    //cele 3 metode:
    // 1 adaugam observatori
    public void register(IConnectionObserver observer){
        this.observers.add(observer);

    }
    //2 ii dezabonam
    public void unregistered(IConnectionObserver observer){
        this.observers.remove(observer);
    }

    //3 metoda trigger
    public void notifyConnectionLost(){
        for(IConnectionObserver observer:this.observers){
            observer.connectionLost();
        }
    }

    //cealalta metoda ?
    public void notifyConnectionLive(){
        for(IConnectionObserver observer:this.observers){
            observer.connectionOpen();
        }
    }
}
