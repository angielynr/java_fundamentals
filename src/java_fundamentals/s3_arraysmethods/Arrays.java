package java_fundamentals.s3_arraysmethods;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,3,4,5};
        int[] nums = new int[10];

        System.out.println(array[0]);

        for (int n: array
             ) {
            System.out.println(n);
        }

        //once created/initialized, size or length cannot be changed
    }
}
