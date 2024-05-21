package ro.ase.ie.cts.lab.patterns.behavioral.command;

public class GameUpdates implements IProcessingModule {

    @Override
    public void processData(String data) {
        System.out.println("Updating data: " + data);
    }
}
