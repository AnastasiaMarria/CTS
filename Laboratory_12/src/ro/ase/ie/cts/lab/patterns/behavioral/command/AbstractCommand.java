package ro.ase.ie.cts.lab.patterns.behavioral.command;

public abstract class AbstractCommand  {
    protected String data;
    protected IProcessingModule executor;
    public AbstractCommand(String data, IProcessingModule executor) {
        super();
        this.data = data;
        this.executor = executor;
    }
    public abstract void doAsync();  //for later abstract command


}
