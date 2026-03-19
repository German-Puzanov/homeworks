package LabOOP2.LabOOP2SecondTask;

public class Polygon {
    protected int[] sides;


    public Polygon(int[] sides) {
        if (!isCorrectPolygon(sides)) {
            throw new IllegalArgumentException("Invalid value, try again!");
        }
        this.sides = sides;
        if (getSidesCount() == 1) ;
    }

    public int getSidesCount() {
        return this.sides.length;
    }

    public int getPerimeter() {
        int perimeter = 0;
        for (int side : this.sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public static boolean isCorrectSide(int side) {
        return side > 0;
    }

    public static boolean isCorrectPolygon(int[] sides) {
        if (sides.length == 0) return false;
        int sumOfLength;
        for (int i = 0; i < sides.length; i++) {
            sumOfLength = 0;
            if (!isCorrectSide(sides[i])) return false;
            for (int j = 0; j < sides.length; j++) {
                if (i == j) continue;
                sumOfLength += sides[j];
            }
            if (sumOfLength <= sides[i] && sides.length != 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Polygon contains %d sides. It's perimeter %d", getSidesCount(), getPerimeter());
    }
}
