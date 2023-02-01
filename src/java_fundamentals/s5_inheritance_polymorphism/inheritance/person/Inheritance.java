package java_fundamentals.s5_inheritance_polymorphism.inheritance.person;

import java_fundamentals.s5_inheritance_polymorphism.inheritance.person1.A;
import java_fundamentals.s5_inheritance_polymorphism.inheritance.person2.B;

public class Inheritance {
    public static void main(String[] args) {

        //uses - extends
        //child class needs to implement the parent's constructor or use default constructor if none

        A a = new A();
        System.out.println(a.num1);

        B b = new B();
        System.out.println(b.num1);
    }
}
