class Parent {
    String firstname;
    String lastname;

    Parent() {
        this.lastname = "parent's LastName";
    }

    Parent(String firstname) {
        this();
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String random() {
        System.out.println("it's random");
        return "hello";
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        System.out.println("parent obj:\t");
        return String.format("Firstname: %s %nLastname: %s", this.firstname, this.lastname);
    }
}

class Child extends Parent {
    Child() {
        super();
    }

    Child(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {

        return (super.getFirstname()); ///// why child first name?????????????
    }
}

public class ChildOverride {
    public static void main(String[] args) {
        Parent parent = new Parent("ParentFirstName");
        System.out.println(parent.toString());
        Child child = new Child("ChildFirstName");
        System.out.println(child.toString());

    }
}
