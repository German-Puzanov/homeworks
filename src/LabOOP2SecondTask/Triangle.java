package LabOOP2SecondTask;

public class Triangle extends Polygon {
    public Triangle(int[] sides) {
        super(sides);
    }

    public double getInRadius() {
        int halfPerimeter = 0;
        double radiusIn;
        for (int i = 0; i < 3; i++) {
            halfPerimeter += sides[i];
        }
        halfPerimeter /= 2;
        radiusIn = Math.sqrt(halfPerimeter * (halfPerimeter - sides[0]) * (halfPerimeter - sides[1]) * (halfPerimeter - sides[2])) / halfPerimeter;
        return radiusIn;
    }

    public boolean isTriangle() {
        return getSidesCount() == 3 && isCorrectPolygon(sides);
    }

    @Override
    public String toString() {
        if (!isTriangle()) return "Invalid value, try again!";
        return String.format("Triangle contains %d sides Its perimeter is %d Its radius of incircle is %f", getSidesCount(), getPerimeter(), getInRadius());
    }


}
