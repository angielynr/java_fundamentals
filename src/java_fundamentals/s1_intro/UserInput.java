package java_fundamentals.s1_intro;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = sc.nextLine();

        System.out.println("How old are you?");
        int userAge = sc.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old");

        System.out.println("Are you okay?");
        boolean isOkay = sc.nextBoolean();
        System.out.println("I don't care what you feel");
    }
}
