package LabOOP2SecondTask;

public class Rhombus extends Parallelogram {
    public Rhombus(int[] sides) {
        super(sides);
    }

    public boolean isRhombus(int[] sides) {
        return sides[0] == sides[1] && sides[2] == sides[3] && sides[0] == sides[2];
    }
}
