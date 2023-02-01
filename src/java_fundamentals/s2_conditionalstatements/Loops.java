package java_fundamentals.s2_conditionalstatements;

public class Loops {
    public static void main(String[] args) {

        //while loop
        int i = 1;
        while(i <= 10){
            System.out.println("while loop" + i);
            i++;
        }

        //for loop
        for (int x = 1; x <= 10; x++){
            System.out.println("for loop" + x);
        }

        for(int y = 10; y >= 1; y--){
            System.out.println(y);
        }
    }
}
