package Base;

public class CustomShape extends Shape {
    private final Integer shape;

    public CustomShape(Double shape) {
        this.shape = (int) Math.round(shape);
    }

    @Override
    public Integer calculateShape() {
        return shape;
    }
}
