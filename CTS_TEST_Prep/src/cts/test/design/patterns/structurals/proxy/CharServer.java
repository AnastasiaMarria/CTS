package cts.test.design.patterns.structurals.proxy;

public class CharServer implements IChatServer{

    String ip;

    @Override
    public void sendMessage(String author, String destination, String message) {
        System.out.println(String.format("%s -> %s : %s", author, destination, message));  //returneaza valorile de la author, destination, message
                                                                                           // %s -> pentru ca sunt string uri
    }
}
