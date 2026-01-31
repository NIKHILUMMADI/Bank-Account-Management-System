// Parent class
abstract class Student {

    private int rollNumber;
    private String name;

    // Common setters and getters
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be overridden
    abstract double calculateGrade();
}

// =======================
// Engineering Student
// =======================
class EngineeringStudent extends Student {

    private int internalAssessment;
    private int externalAssessment;

    EngineeringStudent(int internal, int external) {
        this.internalAssessment = internal;
        this.externalAssessment = external;
    }

    // Method overriding
    @Override
    double calculateGrade() {
        return (internalAssessment * 0.4) + (externalAssessment * 0.6);
    }
}

// =======================
// Medical Student
// =======================
class MedicalStudent extends Student {

    private int theoryMarks;
    private int practicalMarks;

    MedicalStudent(int theory, int practical) {
        this.theoryMarks = theory;
        this.practicalMarks = practical;
    }

    // Method overriding with different logic
    @Override
    double calculateGrade() {
        return (theoryMarks + practicalMarks) / 2.0;
    }
}

// =======================
// Main Class
// =======================
public class InheritanceDemo {

    public static void main(String[] args) {

        Student eng = new EngineeringStudent(80, 90);
        Student med = new MedicalStudent(85, 75);

        System.out.println("Engineering Student Grade: " + eng.calculateGrade());
        System.out.println("Medical Student Grade: " + med.calculateGrade());
    }
}
