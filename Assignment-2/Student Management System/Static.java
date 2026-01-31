abstract class Student {

    // Static variable (belongs to class)
    static String universityName;

    // Static block (executes when class loads)
    static {
        universityName = "Lovely Professional University";
    }

    // Static method
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
}

class EngineeringStudent extends Student {
    // No extra code needed for static demonstration
}

class MedicalStudent extends Student {
    // No extra code needed for static demonstration
}

public class StaticKeywordDemo {

    public static void main(String[] args) {

        // Creating objects
        Student s1 = new EngineeringStudent();
        Student s2 = new MedicalStudent();

        // Accessing static method using class name (recommended)
        Student.displayUniversityName();

        // Showing that static variable is shared by all objects
        System.out.println("University from s1: " + s1.universityName);
        System.out.println("University from s2: " + s2.universityName);

        // Modifying static variable
        Student.universityName = "LPU Punjab";

        System.out.println("\nAfter modifying static variable:\n");

        System.out.println("University from s1: " + s1.universityName);
        System.out.println("University from s2: " + s2.universityName);
    }
}
