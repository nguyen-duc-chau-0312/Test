package Day5;

public class Cicle {
    public double radius;

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
