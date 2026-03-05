package LabOOP2.LabOOP2SecondTask;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(int[] sides) {
        super(sides);
        if (!isParallelogram(sides)){
            throw new IllegalArgumentException("Invalid value, try again!");
        }
    }

    public boolean isParallelogram(int[] sides) {
        return isQuadrilateral(sides) && (sides[0] == sides[2] && sides[1] == sides[3]);
    }

    @Override
    public String toString() {
        return String.format("Parallelogram contains two pairs of parallel sides Its perimeter is %d", getPerimeter());
    }
}