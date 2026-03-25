package LabOOP2.LabOOP2SecondTask;

public class Quadrilateral extends Polygon {
    public Quadrilateral(int[] sides) {
        super(sides);
        if (!isQuadrilateral(sides)) {
            throw new IllegalArgumentException("Invalid value, try again!");
        }
    }

    public static boolean isQuadrilateral(int[] sides) {
        return sides.length == 4;
    }

    @Override
    public String toString() {
        return String.format("Quadrilateral contains %d sides Its perimeter is %d ", getSidesCount(), getPerimeter());
    }
}
