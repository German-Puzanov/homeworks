package LabOOP2.LabOOP2SecondTask;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(int[] sides) {
        super(sides);
        if (!isIsoscelesTriangle()) {
            throw new IllegalArgumentException("Invalid value, try again!");
        }
    }

    public boolean isIsoscelesTriangle() {
        return isTriangle() && sides[0] == sides[1] | sides[1] == sides[2] | sides[0] == sides[2];
    }

    @Override
    public String toString() {
        return String.format("Isosceles triangle contains pair of equal sides Its perimeter is %d Its radius of incircle is %f", getPerimeter(), getInRadius());
    }
}