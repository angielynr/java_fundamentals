package java_fundamentals.s2_conditionalstatements;
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int userAge = scanner.nextInt();

        if(userAge >= 18){
            System.out.println("Do you have a pass? yes/no");
            String userInput = scanner.next();
            if(userInput.equals("yes")){
                System.out.println("You can go in");
            }
            else {
                System.out.println("Sorry, you need to have a pass");
            }
        }
        else {
            System.out.println("18 below are not allowed to go in.");
        }
    }
}
