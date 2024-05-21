package ro.ase.ie.cts.lab.patterns.behavioral.observer;

import ro.ase.ie.cts.lab.patterns.command.*;

public class Test {
    public static void main(String[] args) {

        ServerConnectionModule connectionModule = new ServerConnectionModule("127.0.0.1", 6060);

        //abonam observatori -> toaster
        Toaster toaster = new Toaster();
        GameMonitor gameMonitor = new GameMonitor();

        //daca pierdem conexiunea...nu se intampla nimic pentru ca nimeni nu reactioneaza
        connectionModule.notifyConnectionLost();

        //acum reactioneaza
        connectionModule.register(toaster);
        connectionModule.register(gameMonitor);
        connectionModule.notifyConnectionLost();

        //ii dezabonam
        connectionModule.unregistered(gameMonitor);
        connectionModule.notifyConnectionLive();

        //observator ad-hoc -> care nu e clean
//        connectionModule.register(new IConnectionObserver() {
//            //se creaza instant o instanta anonima
//            @Override
//            public void connectionLost() {
//                System.out.println("Game stops");
//            }
//
//            @Override
//            public void connectionOpen() {
//                System.out.println("Game starts");
//
//            }
//        });
    }
}