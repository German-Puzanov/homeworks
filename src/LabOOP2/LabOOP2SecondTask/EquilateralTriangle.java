package LabOOP2.LabOOP2SecondTask;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(int[] sides) {
        super(sides);
        if(!isEquilateralTriangle()){
            throw new IllegalArgumentException("Invalid value, try again!");
        }
    }

    public boolean isEquilateralTriangle() {
        return sides[0] == sides[1] && sides[1] == sides[2];
    }

    @Override
    public String toString() {
        return String.format("Equilateral triangle contains equal sides Its perimeter is %d Its radius of incircle is %f ", getPerimeter(), getInRadius());
    }
}
