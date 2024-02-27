package kg.kursanov;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }


}
