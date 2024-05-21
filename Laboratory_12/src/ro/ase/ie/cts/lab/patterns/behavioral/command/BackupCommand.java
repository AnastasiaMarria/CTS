package ro.ase.ie.cts.lab.patterns.behavioral.command;

public class BackupCommand extends AbstractCommand{


    public BackupCommand(String data, IProcessingModule executor) {
        super(data, executor);
    }

    @Override
    public void doAsync() {
        this.executor.processData(data);
    }
}
