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
        return side >= 0;
    }

    public boolean isCorrectPolygon(int[] sides) {
        for (int i = 0; i < sides.length - 1; i++) {
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
        return String.format("Polygon contains %d sides. It's perimeter %d", this.sides.length, getPerimeter());
    }
}
