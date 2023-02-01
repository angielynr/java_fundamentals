package java_fundamentals.s5_inheritance_polymorphism.interfacee;

public class MainFace {
    public static void main(String[] args) {
        //interfaces are abstract by default
        //interfaces are implemented by classes
        //java only allows single inheritance and only extends one of the class
        //That is why use inheritance instead of abstract class
        //public

        Face2 face2 = new Face2();
        System.out.println(face2.Pretty());
    }
}
