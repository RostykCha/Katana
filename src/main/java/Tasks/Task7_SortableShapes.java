package Tasks;

import Base.Shape;

import java.util.ArrayList;
import java.util.Random;

public class Task7_SortableShapes {

    public static ArrayList<Shape> createRandomOrderedList(Random random, ArrayList<Shape> expected) {
        ArrayList<Shape> actual = new ArrayList<Shape>();
        for (Shape shape : expected) {
            int j = random.nextInt(actual.size() + 1);
            actual.add(j, shape);
        }
        return actual;
    }

}


