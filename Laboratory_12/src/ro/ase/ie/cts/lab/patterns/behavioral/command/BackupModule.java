package ro.ase.ie.cts.lab.patterns.behavioral.command;

public class BackupModule implements IProcessingModule{
    @Override
    public void processData(String data) {
        System.out.println("Backing up " + data);
    }
}
