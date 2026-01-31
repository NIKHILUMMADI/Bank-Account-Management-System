// Parent abstract class
abstract class Student {

    private int rollNumber;
    private String name;

    // Common setters & getters
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

    // Abstract method
    abstract double calculateGrade();
}

// Sports interface
interface SportsParticipant {
    void playSport();
}

// Cultural interface
interface CulturalParticipant {
    void performActivity();
}

// Class using multiple inheritance via interfaces
class AllRounderStudent extends Student
        implements SportsParticipant, CulturalParticipant {

    @Override
    double calculateGrade() {
        return 88.5;
    }

    @Override
    public void playSport() {
        System.out.println("AllRounder student plays basketball");
    }

    @Override
    public void performActivity() {
        System.out.println("AllRounder student performs music");
    }
}

// Main class
public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        AllRounderStudent student = new AllRounderStudent();

        student.setRollNumber(201);
        student.setName("Suresh");

        System.out.println("Roll No : " + student.getRollNumber());
        System.out.println("Name    : " + student.getName());
        System.out.println("Grade   : " + student.calculateGrade());

        student.playSport();
        student.performActivity();
    }
}
