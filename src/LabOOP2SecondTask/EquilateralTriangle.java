package LabOOP2SecondTask;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(int[] sides) {
        super(sides);
    }

    public boolean isEquilateralTriangle() {
        return sides[0] == sides[1] && sides[1] == sides[2];
    }

    @Override
    public String toString() {
        if (!isEquilateralTriangle()) return "Invalid value, try again!";
        return String.format("Equilateral triangle contains equal sides Its perimeter is %d Its radius of incircle is %f ", getPerimeter(), getInRadius());
    }
}
