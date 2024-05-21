package ro.ase.ie.cts.lab.patterns.behavioral.strategy;

public class UserAccount {
    String username;

    IPayment paymentSolution;

    public void setPaymentSolution(IPayment paymentSolution) {
        this.paymentSolution = paymentSolution;
    }

    public void paySubscription(double value){
       // System.out.println("Paying with PayPal ");
        if(this.paymentSolution!= null){
            this.paymentSolution.pay(value); //if the user changes the paymentds methods, you dont need to change Userccount
        }
    }
}
