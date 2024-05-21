package ro.ase.ie.cts.lab.patterns.behavioral.strategy;

public class CardPayment implements  IPayment {
    String bankName;

    public CardPayment(String bankName) {
        super();
        this.bankName = bankName;
    }


    @Override
    public void pay(double value) {
        System.out.println("Connceting to bamk systems: " + this.bankName);
        System.out.println("Paying " + value);

    }
}
