abstract class Shape {
    String name;
    double area = 0;
    double perimeter = 0;

    Shape(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getperimeter() {
        return perimeter;
    }

    public void setperimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    abstract void calculateArea();

    abstract void calculateparimeter();

    abstract void draw();
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String name, double perimeter, double area, double length, double width) {
        super(name, area, perimeter);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    void calculateArea() {
        if (this.area > 0) {
            System.out.println(this.area);
        }
        System.out.println("len:" + length + "  width:" + width + " area" + (length * width));

    }

    @Override
    void calculateparimeter() {
        if (this.perimeter > 0) {
            System.out.println(this.perimeter);
        }
        System.out.println("len:" + length + "  width:" + width + "  perimeter:" + (length + width));

    }

    @Override
    void draw() {
        System.out.println("rectangle");

    }

}

class Square extends Shape {
    double len;
    private int parimeter;

    public Square(String name, double area, double perimeter, double len) {
        super(name, area, perimeter);
        this.len = len;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    @Override
    void calculateArea() {
        if (this.area > 0) {
            System.out.println(this.area);
        }
        System.out.println(len * len);

    }

    @Override
    void calculateparimeter() {
        if (this.parimeter > 0) {
            System.out.println(this.parimeter);
        }
        System.out.println(4 * len);

    }

    @Override
    void draw() {
        System.out.println("Square");

    }
}

class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println(Math.PI * radius * radius);

    }

    @Override
    void calculateparimeter() {
        System.out.println(Math.PI * radius * 2);

    }

    @Override
    void draw() {
        System.out.println("Circle");
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        // Shape shape = new Shape("ShapeFirstName",20.09,12.88);
        Circle circle = new Circle(null, 20, 0, 0);
        circle.radius = 10;
        circle.calculateparimeter();
    }

}
