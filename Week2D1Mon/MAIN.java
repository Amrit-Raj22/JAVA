class Person {
    protected String name = "Default";

    Person(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Employee extends Person {
    protected double salary = 0.0;
    int year;
    protected String uan;

    Employee(String name, double salary, int year, String uan) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.uan = uan;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    void setUan(String uan) {
        this.uan = uan;
    }

    void setYear(int year) {
        this.year = year;
    }

    // @Override
    String getName() {
        return this.name;
    }

    int getYear() {
        return this.year;
    }

    double getSalary() {
        return this.salary;
    }

    String getUan() {
        return this.uan;
    }

}

public class MAIN {
    public static void main(String[] args) {
        Person person = new Person("person1");
        Employee employee1 = new Employee("newEmployee1", 1000, 2022, "UAN1");
        Employee employee2 = new Employee("newEmployee1", 1000, 2022, "UAN1");

        System.out.println(employee1.getUan() + "\t" + "Name:" + employee1.getName());
        System.out.println(employee2.getUan() + "\t" + "Name:" + employee2.getName());
        System.out.println(employee2 + "\t " + employee1 + "\t " + person);
        System.out.println(person.getName());

        if (person.getName() == employee1.getName()) {
            System.out.println("Person & employee1 are same");
        } else {
            System.out.println("Person & employee1 are Not same");
        }
        if (person.getName() == employee2.getName()) {
            System.out.println("Person & employee2 are same");
        } else {
            System.out.println("Person & employee2 are Not same");
        }
        if (employee1.getName() == employee2.getName() && employee1.getSalary() == employee2.getSalary()
                && employee1.getSalary() == employee2.getSalary()) {
            System.out.println("Employees are same");
        } else {
            System.out.println("Employees are NOT same");
        }

    }

}
