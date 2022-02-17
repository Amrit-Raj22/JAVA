abstract class vehicle {
    abstract void drive();

    abstract void steeringmechanism();

    void start() {
        System.out.println("Starting....");

    }

    void stop() {
        System.out.println("Stopped!!");
    }
}

class car extends vehicle {

    void drive() {
        System.out.println("Driving Car");
    }

    void steeringmechanism() {
        System.out.println("Steering of car");
    }

}

class bike extends vehicle {
    void drive() {
        System.out.println("driving bike");
    }

    void steeringmechanism() {
        System.out.println("Steering of bike");
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        bike b = new bike();
        car c = new car();
        b.drive();
        b.steeringmechanism();
        b.start();
        b.stop();
        c.drive();
        c.steeringmechanism();
        c.start();
        c.stop();
    }

}
