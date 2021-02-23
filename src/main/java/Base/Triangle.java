package Base;

public class Triangle extends Shape {
    double triangleBase;
    double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public Integer calculateShape() {
        double result = this.triangleBase * this.triangleHeight / 2;
        return (int) Math.round(result);
    }
}
