package LabOOP2.LabOOP2SecondTask;

public class Triangle extends Polygon {
    public Triangle(int[] sides) {
        super(sides);
        if (!isTriangle(sides)) {
            throw new IllegalArgumentException("Invalid value, try again!");
        }
    }

    public double getInRadius() {
        double halfPerimeter = 0;
        double radiusIn;
        for (int i = 0; i < 3; i++) {
            halfPerimeter += sides[i];
        }
        halfPerimeter /= 2;

        radiusIn = Math.sqrt(halfPerimeter * (halfPerimeter - sides[0]) * (halfPerimeter - sides[1]) * (halfPerimeter - sides[2])) / halfPerimeter;
        return radiusIn;
    }

    public static boolean isTriangle(int[] sides) {
        return sides.length == 3;
    }

    @Override
    public String toString() {
        return String.format("Triangle contains %d sides Its perimeter is %d Its radius of incircle is %f", getSidesCount(), getPerimeter(), getInRadius());
    }


}
