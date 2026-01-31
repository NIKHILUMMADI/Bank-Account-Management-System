import java.util.Scanner;

class student {
    private int rollno;
    private String name;
    private int semester;

    // constructor
    student(int rollno, String name, int semester) {
        setrollno(rollno);     // validation
        this.name = name;
        setsemester(semester); // validation
    }

    // getters
    public int getrollno() {
        return rollno;
    }

    public String getname() {
        return name;
    }

    public int getsemester() {
        return semester;
    }

    // setters with validation
    public void setrollno(int rollno) {
        if (rollno > 0 && rollno < 60) {
            this.rollno = rollno;
        } else {
            System.out.println("Invalid roll number");
        }
    }

    public void setsemester(int semester) {
        if (semester > 0 && semester <= 8) {
            this.semester = semester;
        } else {
            System.out.println("Invalid semester");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll no: ");
        int rollno = sc.nextInt();
        sc.nextLine(); // FIXED

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter semester: ");
        int semester = sc.nextInt();

        student s = new student(rollno, name, semester);

        System.out.println("\nStudent details:");
        System.out.println("Roll No: " + s.getrollno());
        System.out.println("Name: " + s.getname());
        System.out.println("Semester: " + s.getsemester());

        sc.close();
    }
}

