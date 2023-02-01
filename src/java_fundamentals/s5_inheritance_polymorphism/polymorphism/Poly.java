package java_fundamentals.s5_inheritance_polymorphism.polymorphism;

public class Poly {
    public static void main(String[] args) {
        // many forms
        //java treats objects as the VARIABLE TYPE not the OBJECT TYPE

        Account1 acc1 = new Account1("Angie", "komo", 10);
        acc1.Withdraw(2); //this will implement the override method in child class

        System.out.println("Your new balance is (Used account1 class):\n\t" + acc1.getBalance());

        Account1 acc2 = new Account2("Angie", "komo", 10, true);
        acc2.Withdraw(2);

        System.out.println("Your new balance is (Used account2 class):\n\t" + acc2.getBalance());


    }
}
