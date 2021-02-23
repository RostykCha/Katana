package Base;

public class Rectangle extends Shape {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public Integer calculateShape() {
        double result = this.height * this.width;
        return (int) Math.round(result);
    }
}
