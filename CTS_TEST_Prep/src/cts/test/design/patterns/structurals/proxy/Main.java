package cts.test.design.patterns.structurals.proxy;

public class Main {
    public static void main(String[] args) {
        IChatServer server = new CharServer();

        server = new FilterProxy(server);

        server.sendMessage("Alice", "John", "How are you");
        server.sendMessage("Vader", "John", "I know were you are");
        server.sendMessage("Vader", "John", "You are stupid");
    }
}