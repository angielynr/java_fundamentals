package java_fundamentals.s5_inheritance_polymorphism.polymorphism;

public class Account2 extends Account1{
    private boolean visa;

    public Account2(String name, String bankName, double balance, boolean visa) {
        super(name, bankName, balance);
        this.visa = visa;
    }

    @Override
    public double Withdraw(double amount) {
        //return super.Deposit();
        double fee = 0.10 * amount;
        //amount -= fee;
        amount = amount - fee;

        return super.Withdraw(amount);
    }
}
