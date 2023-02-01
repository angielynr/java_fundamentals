package java_fundamentals.s1_intro;

public class TypeCasting {
    public static void main(String[] args) {

        //implicit
        int foo = 5;
        double fa = foo;

        System.out.println(foo);
        System.out.println(fa);

        //explicit
        double shoo = 10.5;
        int sha = (int) shoo;

        System.out.println(shoo);
        System.out.println(sha);

        int number = 10;
        String intToText = String.valueOf(number);
        System.out.println(number);
        System.out.println(intToText.getClass());

    }
}
