// Sports interface
interface SportsParticipant {
    void playSport();
}

// Student class implementing interface
class AllRounderStudent implements SportsParticipant {

    @Override
    public void playSport() {
        System.out.println("AllRounder student plays football");
    }
}

// Main class
public class InterfacePolymorphismDemo {

    public static void main(String[] args) {

        // Interface reference pointing to implementing class object
        SportsParticipant sp;

        sp = new AllRounderStudent();
        sp.playSport();
    }
}
