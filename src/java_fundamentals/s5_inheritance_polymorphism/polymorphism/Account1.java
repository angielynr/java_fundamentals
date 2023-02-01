package java_fundamentals.s5_inheritance_polymorphism.polymorphism;

public class Account1 {
    private String name;
    private String bankName;
    private double balance;
    private double amount;

    public Account1(String name, String bankName, double balance) {
        this.name = name;
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double Withdraw(double amount){
        return balance -= amount;
    }
}
