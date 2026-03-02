package LabOOP2SecondTask;

public class Circle extends Polygon {
    public Circle(int[] sides) {
        super(sides);
    }
    public double getArea(){
        return Math.PI*Math.pow(sides[0],2);
    }
    public boolean isCircle(){
        return sides.length == 1 && sides[0] > 0;
    }
    @Override
    public String toString() {
        if (!isCircle()) return "Invalid value, try again!";
        return String.format("Circle radius is %d Its perimeter is %f Its area is %f",sides[0],2*Math.PI*sides[0],getArea());
    }
}
