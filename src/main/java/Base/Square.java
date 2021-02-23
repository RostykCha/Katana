package Base;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public Integer calculateShape() {
        double result = this.side * this.side;
        return (int) Math.round(result);
    }
}
