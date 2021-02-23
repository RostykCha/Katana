package Base;

public class Shape implements Comparable<Shape> {
    private int shape;

    public Integer calculateShape() {
        return shape;
    }

    @Override
    public int compareTo(Shape shape) {
        return this.calculateShape().compareTo(shape.calculateShape());
    }
}
