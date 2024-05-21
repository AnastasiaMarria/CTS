package ro.ase.ie.cts.lab.patterns.behavioral.strategy;

import ro.ase.ie.cts.lab.patterns.command.*;



public class Test {
    public static void main(String[] args) {

       UserAccount account = new UserAccount();

       account.setPaymentSolution(new PayPayPayment());
       account.paySubscription(100);

        account.setPaymentSolution(new CardPayment("ACME"));
        account.paySubscription(100);



    }
}