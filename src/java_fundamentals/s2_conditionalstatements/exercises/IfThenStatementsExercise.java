package java_fundamentals.s2_conditionalstatements.exercises;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class IfThenStatementsExercise {
    public static void main(String[] args) {
        Exercise2();
    }

    public static void Exercise1(){
        int x = 11;
        int y = 11;

        if(x > y){
            System.out.println("X is bigger then Y");
        } else if (x < y) {
            System.out.println("X is smaller than Y");
        }else {
            System.out.println("X and Y are equal");
        }

        double difference = x - y;
        System.out.format("The difference of x & y is %.2f", difference);
    }

    public static void Exercise2(){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("PLAYER 1: Enter number from 1-5. GUESS!!!!");
        int input = scanner.nextInt();
        System.out.println("PLAYER 2: Enter number from 1-5. GUESS!!!!");
        int input2 = scanner.nextInt();

        if(input == randomNumber){
            System.out.println("Player 1 guessed it right!");
        } else if (input2 == randomNumber) {
            System.out.println("Player 2 guessed it right!");
        } else {
            System.out.format("Wrong! Better luck next time! The correct number is %d", randomNumber);
        }
    }
}
