package LabOOP2SecondTask;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(int[] sides) {
        super(sides);
    }

    public boolean isParallelogram(int[] sides) {
        return isQuadrilateral(sides) && (sides[0] == sides[2] && sides[1] == sides[3]);
    }

    @Override
    public String toString() {
        if (!isParallelogram(sides)) return "Invalid value, try again!";
        return String.format("Parallelogram contains two pairs of parallel sides Its perimeter is %d", getPerimeter());
    }
}