package Base;

public class Circle extends Shape {
    double radius;
    double shape;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Integer calculateShape() {
        double result = this.radius * this.radius * 3.14159;
        return (int) Math.round(result);
    }
}
