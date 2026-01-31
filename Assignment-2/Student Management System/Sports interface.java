// Sports interface
interface SportsParticipant {
    void playSport();
}

// Cultural interface
interface CulturalParticipant {
    void performActivity();
}

// Class implementing multiple interfaces
class AllRounderStudent implements SportsParticipant, CulturalParticipant {

    @Override
    public void playSport() {
        System.out.println("Student plays cricket");
    }

    @Override
    public void performActivity() {
        System.out.println("Student performs dance");
    }
}

// Main class
public class InterfaceOnePartDemo {

    public static void main(String[] args) {

        // Creating object
        AllRounderStudent student = new AllRounderStudent();

        // Calling interface methods
        student.playSport();
        student.performActivity();
    }
}
