package java_fundamentals.s4_oop.data_structures.composition;

public class Composition {
    public static void main(String[] args) {

        // Inheritance derives one class from another, composition defines a class as the sum of its parts.

        //Composition HAS-A
        //Code duplication

        //Inheritance
        // Code re-usability
        // IS-A
        //Inheritance .. class Developer : Employee

        Student studentOne = new Student();
        studentOne.setName("Angielyn Rivera");
        studentOne.setDateOfBirth("August 27, 1998");
        studentOne.setHasStudentHousing(true);

        studentOne.setCourse(new Course());

//        studentOne.getCourse().setTitle("Java");
//        studentOne.getCourse().setDescription("Java Desc");
//        studentOne.getCourse().setStartDate("January 1, 2030");

        Course course = studentOne.getCourse();
        course.setTitle("Java");
        course.setDescription("Java Desc");
        course.setStartDate("January 1, 2030");

        System.out.println("Name: " + studentOne.getName());
        System.out.println("Date of birth: " + studentOne.getDateOfBirth());
        System.out.println("Has student housing: " + studentOne.hasStudentHousing());
        System.out.println("Course Title: " + course.getTitle());
        System.out.println("Course Description: " + course.getDescription());
        System.out.println("Course Start Date: " + course.getStartDate());

        //Student 2
        Student studentTwo = new Student();
        studentTwo.setName("Maggie");
        studentTwo.setDateOfBirth("May 2, 2021");
        studentTwo.setHasStudentHousing(true);

        studentTwo.setCourse(new Course());
        Course course2 = studentTwo.getCourse();
        course2.setTitle(".Net");
        course2.setDescription(".Net peeps");
        course2.setStartDate("May 1, 2012");

        System.out.println("------");
        System.out.println("Name: " + studentTwo.getName());
        System.out.println("Course Title: " + course2.getTitle());
        System.out.println("Course Description: " + course2.getDescription());
        System.out.println("Course Start Date: " + course2.getStartDate());
    }
}

