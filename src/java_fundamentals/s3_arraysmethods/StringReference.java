package java_fundamentals.s3_arraysmethods;

public class StringReference {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        // this is primitive type. the value is passed/copied
//        System.out.println(a);
//        System.out.println(b);

        int[] x = {1,2,3,4,5};
        int[] y = x; //this is Reference type, the value is not being passed, but the reference
                    // or address of the array.

        y[0] = 12; //so if I changed the y[0], x[0] will be updated too because they have the same address/reference
        for (int num: x
             ) {
            System.out.println("x: " + num);
        }

        for (int num: y
             ) {
            System.out.println("y: " + num);
        }
    }
}
