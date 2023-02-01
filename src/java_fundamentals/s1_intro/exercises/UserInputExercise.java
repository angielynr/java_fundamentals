package java_fundamentals.s1_intro.exercises;
import java.util.Scanner;

public class UserInputExercise {
    public static void main(String[] args) {
        UserInputExercise1();
        UserInputExercise2();
    }

    public static void UserInputExercise1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userName = sc.nextLine();

        System.out.println("How old are you?");
        int userAge = sc.nextInt();

        System.out.format("You've lived %d years. In another %d years you'll be %d years old.", userAge, 2, userAge + 2);
        System.out.format("Your name has %d characters.", userName.length());
    }

    public static void UserInputExercise2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nHope you had a good meal! How much is total bill?");
        double totalBill = sc.nextDouble();

        System.out.println("How many are you so we can split the bill equally:");
        int totalPerson = sc.nextInt();

        double billPerPerson = (totalBill / totalPerson);
        System.out.format("Let's split the bill!, so you are %d in total and the total bill is %.2f. Each person pays %.2f. Thanks!", totalPerson, totalBill, billPerPerson);
    }
}
