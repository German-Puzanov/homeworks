package LabOOP2SecondTask;

public class Parallelogram extends Quadrilateral{
    public Parallelogram(int[] sides) {
        super(sides);
    }
    public boolean isParallelogram(int[] sides){
        return sides[0] == sides[2] && sides[1] == sides[3];
    }
}
