package ro.ase.ie.cts.lab.patterns.behavioral.strategy;

public class PayPayPayment implements IPayment{
    @Override
    public void pay(double value) {
        System.out.println("Paying with PayPay:" + value);

    }
}
