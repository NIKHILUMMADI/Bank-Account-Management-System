// Parent abstract class
abstract class Student {
    abstract double calculateGrade();
}

// Engineering Student
class EngineeringStudent extends Student {

    @Override
    double calculateGrade() {
        return 78.5;
    }
}

// Medical Student
class MedicalStudent extends Student {

    @Override
    double calculateGrade() {
        return 85.0;
    }
}

// All Rounder Student
class AllRounderStudent extends Student {

    @Override
    double calculateGrade() {
        return 90.0;
    }
}

// Main class
public class PolymorphismLateBindingDemo {

    public static void main(String[] args) {

        // Polymorphism: one reference, many objects
        Student s;

        s = new EngineeringStudent();
        System.out.println("Engineering Grade: " + s.calculateGrade());

        s = new MedicalStudent();
        System.out.println("Medical Grade: " + s.calculateGrade());

        s = new AllRounderStudent();
        System.out.println("All Rounder Grade: " + s.calculateGrade());
    }
}
