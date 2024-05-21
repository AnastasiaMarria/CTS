package ro.ase.ie.cts.lab.patterns.behavioral.command;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<AbstractCommand> promises = new ArrayList<>();

        IProcessingModule backup = new BackupModule();

        IProcessingModule updates = new GameUpdates();

        //add a future call for updates
        promises.add(new UpdateCommand("Update game client", updates, "10.0.0.1"));
        promises.add(new BackupCommand("User data ", backup));
        promises.add(new UpdateCommand("Update game client", updates, "10.0.0.1"));

        System.out.println("Game runs on the main thread");

        //imagine this happening on a different thread
        promises.get(0).doAsync();
        promises.remove(0); //i executed, then i remove it

        promises.get(0).doAsync();
        promises.remove(0);

    }
}