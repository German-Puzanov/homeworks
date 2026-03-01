package LabOOP2SecondTask;

public class Quadrilateral extends Polygon {
    public Quadrilateral(int[] sides) {
        super(sides);
    }

    public boolean isQuadrilateral(int[] sides) {
        return sides.length == 4;
    }
}
