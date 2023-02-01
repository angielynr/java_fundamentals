package java_fundamentals.s4_oop.data_structures;

public class DataStructures {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "maggie";
        emp.age = 2;
        emp.jobTitle = "good dog";

        Employee emp2 = new Employee();
        emp2.name = "angie";
        emp2.age = 24;
        emp2.jobTitle = "good girl";

        Employee emp3 = new Employee();
        emp3.name = "gel";
        emp3.age = 24;
        emp3.jobTitle = "good girl";

        displayEmployee(emp);
        displayEmployee(emp2);
        displayEmployee(emp3);
    }

    static void displayEmployee(Employee employee){
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Job Title: " + employee.jobTitle);
        System.out.println();
    }
}
