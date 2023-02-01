package java_fundamentals.s1_intro.exercises;

public class hello {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    public static void example1() {
        System.out.println("SHOPPING LIST");
        System.out.println("\t - Milk");
        System.out.println("\t\t > Semi-skimmed");
        System.out.println("\t\t > Medium");
        System.out.println("\t - Eggs");
        System.out.println("\t\t > Free-range");
        System.out.println("\t - Bread");
    }

    public static void example2() {
        System.out.println("SHOPPING LIST\n\t - Milk\n\t\t > Semi-skimmed\n\t\t > Medium\n\t - Eggs\n\t\t > Free-range\n\t - Bread");
    }

    public static void example3(){
        System.out.println("The");
        System.out.println("\tCake");
        System.out.println("Is\t\tA");
        System.out.println("\tLie");
    }
}
