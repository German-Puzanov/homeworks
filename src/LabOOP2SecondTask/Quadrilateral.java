package LabOOP2SecondTask;

public class Quadrilateral extends Polygon {
    public Quadrilateral(int[] sides) {
        super(sides);
    }

    public boolean isQuadrilateral(int[] sides) {
        return getSidesCount() == 4;
    }

    @Override
    public String toString() {
        if (!isQuadrilateral(sides)) return "Invalid value, try again!";
        return String.format("Quadrilateral contains %d sides Its perimeter is %d ", getSidesCount(), getPerimeter());
    }
}
