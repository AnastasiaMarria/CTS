package ro.ase.ie.cts.lab.patterns.behavioral.command;

public class UpdateCommand extends AbstractCommand{

    protected String serverIP;
    public UpdateCommand(String data, IProcessingModule executor, String IP) {
        super(data, executor);
        this.serverIP=IP;
    }

    @Override
    public void doAsync() {
        System.out.println("Connecting to updates server at " + this.serverIP);
        this.executor.processData(this.data);
    }
}
