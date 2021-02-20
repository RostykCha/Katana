import org.decimal4j.util.DoubleRounder;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6_TDDAreaCalculations {

    public static double getTotalArea(Object... object) {
        double result = 0;
        Object[] objectList = object;

        for (Object obj : objectList) {
            if (obj instanceof Triangle) {
                result += ((Triangle) obj).triangleBase * ((Triangle) obj).triangleHeight / 2;
            } else if (obj instanceof Square) {
                result += ((Square) obj).side * ((Square) obj).side;
            } else if (obj instanceof Rectangle) {
                result += ((Rectangle) obj).height * ((Rectangle) obj).width;
            } else if (obj instanceof Circle) {
                result += ((Circle) obj).radius * ((Circle) obj).radius * 3.14159;
            }
        }
        result = DoubleRounder.round(result, 2);
        return result;
    }

    @Test
    public void areaOfATriangleIsBaseMultipliedByHeight() {
        double triangleBase = 6;
        double triangleHeight = 4;

        assertEquals(12, getTotalArea(new Triangle(triangleBase, triangleHeight)), .0001);
    }

    @Test
    public void areaOfASquareIsSquareOfSide() {
        double side = 6;

        assertEquals(36, getTotalArea(new Square(side)), .0001);
    }

    @Test
    public void areaOfARectangleIsWidthMultipliedByHeight() {
        double height = 4;
        double width = 8;

        assertEquals(32, getTotalArea(new Rectangle(height, width)), .0001);
    }

    @Test
    public void areaOfACircleIsSquareOfRadiusMulitpliedByPi() {
        double radius = 3;

        assertEquals(28.27, getTotalArea(new Circle(radius)), .0001);
    }

    @Test
    public void totalAreaIsSumOfAreasOfDifferentShapes() {
        assertEquals(49.14, getTotalArea(new Rectangle(4, 2), new Rectangle(3, 4), new Circle(1), new Square(1), new Triangle(10, 5)), .0001);
    }

    @Test
    public void totalAreaIsRoundedTo2Decimals() {
        assertEquals(4.45, getTotalArea(new Rectangle(1.112, 2), new Rectangle(1.111, 2)), .0001);
    }

    @Test
    public void totalAreaIs0WhenThereAreNoShapes() {
        assertEquals(0, getTotalArea(), .0001);
    }

    public static class Triangle {
        double triangleBase;
        double triangleHeight;

        public Triangle(double triangleBase, double triangleHeight) {
            this.triangleBase = triangleBase;
            this.triangleHeight = triangleHeight;
        }
    }

    public static class Square {
        double side;

        public Square(double side) {
            this.side = side;
        }
    }

    public static class Rectangle {
        double height;
        double width;

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }
    }

    public static class Circle {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
    }
}
