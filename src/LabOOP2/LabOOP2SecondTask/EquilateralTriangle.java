package LabOOP2.LabOOP2SecondTask;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(int[] sides) {
        super(sides);
        if(!isEquilateralTriangle(sides)){
            throw new IllegalArgumentException("Invalid value, try again!");
        }
    }

    public static boolean isEquilateralTriangle(int[] sides) {
        return sides[0] == sides[1] && sides[1] == sides[2];
    }

    @Override
    public String toString() {
        return String.format("Equilateral triangle contains equal sides Its perimeter is %d Its radius of encircle is %f ", getPerimeter(), getInRadius());
    }
}
