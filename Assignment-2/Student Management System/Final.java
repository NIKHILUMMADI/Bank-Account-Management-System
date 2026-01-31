abstract class Student {

    // final variable (constant)
    final int MAX_SEMESTER = 8;

    // final method (cannot be overridden)
    final void showRules() {
        System.out.println("Students must follow university rules.");
    }
}

// Child class
class EngineeringStudent extends Student {

    void displayMaxSemester() {
        System.out.println("Maximum Semester: " + MAX_SEMESTER);
    }

    // ❌ NOT ALLOWED – overriding final method
    /*
    @Override
    void showRules() {
        System.out.println("Modified rules"); // Compile-time error
    }
    */
}

public class FinalKeywordDemo {

    public static void main(String[] args) {

        EngineeringStudent s = new EngineeringStudent();

        // Accessing final variable
        s.displayMaxSemester();

        // Calling final method
        s.showRules();

        // ❌ NOT ALLOWED – modifying final variable
        // s.MAX_SEMESTER = 10;   // Compile-time error
    }
}
