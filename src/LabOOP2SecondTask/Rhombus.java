package LabOOP2SecondTask;

public class Rhombus extends Parallelogram {
    public Rhombus(int[] sides) {
        super(sides);
    }

    public boolean isRhombus(int[] sides) {
        return isParallelogram(sides) && sides[0] == sides[1] && sides[2] == sides[3] && sides[0] == sides[2];
    }

    @Override
    public String toString() {
        if (!isRhombus(sides)) return "Invalid value, try again!";
        return String.format("Rhombus contains %d equal sides Its perimeter is %d", getSidesCount(), getPerimeter());
    }
}