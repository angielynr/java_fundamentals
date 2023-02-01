package java_fundamentals.s3_arraysmethods;

public class Methods {
    public static void main(String[] args) {
        Method1();
        MethodParam(5);
        int sum = ReturnSum(1, 1);
        System.out.println(sum);
    }

    public static void Method1(){
        System.out.println("Method1");
    }

    public static void MethodParam(int a){
        System.out.println(a * 2);
    }

    public static int ReturnSum(int a, int b){
        return a + b;
    }
}
