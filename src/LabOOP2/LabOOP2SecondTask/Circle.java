package LabOOP2.LabOOP2SecondTask;

public class Circle extends Polygon {
    public Circle(int[] sides) {
        super(sides);
        if (!isCircle(sides)) {
            throw new IllegalArgumentException("Invalid value, try again!");
        }
    }

    public double getArea() {
        return Math.PI * Math.pow(sides[0], 2);
    }

    public boolean isCircle(int[] sides) {
        return getSidesCount() == 1;
    }

    @Override
    public String toString() {
        return String.format("Circle radius is %d Its perimeter is %f Its area is %f", sides[0], 2 * Math.PI * sides[0], getArea());
    }
}
