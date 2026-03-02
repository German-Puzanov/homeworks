package LabOOP2SecondTask;

public class Polygon {
    protected int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
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

    public boolean isCorrectSide(int side) {
        return side > 0;
    }

    public boolean isCorrectPolygon(int[] sides) {
        if (sides.length == 0) return false;
        for (int i = 0; i < sides.length - 1; i++) {
            if (!isCorrectSide(sides[i])) return false;
            for (int j = 0; j < sides.length - 1 - i; j++) {
                if (sides[j] < sides[j + 1]) {
                    int temp = sides[j];
                    sides[j] = sides[j + 1];
                    sides[j + 1] = temp;
                }
            }
        }
        for (int i = 2; i < sides.length; i++) {
            if (sides[i - 2] >= sides[i - 1] + sides[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (!isCorrectPolygon(this.sides)) return "Invalid value, try again!";
        return String.format("Polygon contains %d sides. It's perimeter %d", getSidesCount(), getPerimeter());
    }
}
