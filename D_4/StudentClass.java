class StudentId {
    private int rollNo;
    private String name;
    public static final String UNIVERSITY = "UniversityName";
    private String homeTown;
    static int count = 1;

    StudentId() {
        this.rollNo = count++;
        this.name = "default";
        this.homeTown = "defaultHome";
        // System.out.println(this.rollNo + " " + this.name + " " + this.homeTown + " "
        // + StudentId.UNIVERSITY);
    }

    StudentId(String name) {
        this();
        this.name = name;
        this.homeTown = "defaultHome";
        System.out.println(this.rollNo + " " + this.name + " " + this.homeTown + " "
                + StudentId.UNIVERSITY);
    }

    StudentId(String name, String homeTown) {
        this(name);
        this.name = name;
        this.homeTown = homeTown;
        System.out.println(this.rollNo + " " + this.name + " " + this.homeTown + " " + StudentId.UNIVERSITY);
    }

}

public class StudentClass {
    public static void main(String[] args) {
        StudentId student1 = new StudentId();
        StudentId student2 = new StudentId("student2");
        StudentId student3 = new StudentId("student3", "newHome");

        // System.out.println(student1.rollNo()+" "+student1.name()+"
        // "+student1.university())
    }

}
