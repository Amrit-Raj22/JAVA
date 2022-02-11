class Student {
    private int rollNo;
    private String name;

    protected void display() {
        System.out.println("name:" + name + "\nrollno.:" + rollNo);
    }

    protected void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    protected int getRollNo() {
        return this.rollNo;
    }

    ///// constroctors/////
    Student() {
        rollNo = 14;
        name = "Default";
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
        this.name = "Default";
    }

    Student(String name) {
        this.rollNo = 0;
        this.name = name;
    }

}

public class ClassStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(2, "Student2");
        Student student3 = new Student(3);
        Student student4 = new Student("Student4");

        student1.display();
        student1.setName("Student1");
        student1.setRollNo(1);
        System.out.println(student1.getName());
        System.out.println(student1.getRollNo());
        student1.display();

        student2.display();
        student2.setName("NewStudent2");
        student2.setRollNo(12);
        System.out.println(student2.getName());
        System.out.println(student2.getRollNo());
        student2.display();

        student3.display();
        student3.setName("Student3");
        student3.setRollNo(13);
        System.out.println(student3.getName());
        System.out.println(student3.getRollNo());
        student3.display();

        student4.display();
        student4.setName("NewStudent4");
        student4.setRollNo(4);
        System.out.println(student4.getName());
        System.out.println(student4.getRollNo());
        student4.display();

    }

}
