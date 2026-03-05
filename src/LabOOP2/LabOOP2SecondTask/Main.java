package LabOOP2.LabOOP2SecondTask;

public class Main {
    public static void main(String[] args) {
        try {
            var polygon = new Polygon(new int[]{2,3,4,5});
            var quadrilateral = new Quadrilateral(new int[]{1, 2, 2, 1});
            var parallelogram = new Parallelogram(new int[]{1,2,1,2});
            var rhombus = new Rhombus(new int[]{1,1,1,1});
            var triangle = new Triangle(new int[]{3,4,5});
            var isoscelesTriangle = new IsoscelesTriangle(new int[]{2,2,3});
            var equilateralTriangle = new EquilateralTriangle(new int[]{2,2,2});
            var circle = new Circle(new int[]{1});

            System.out.println(polygon);
            System.out.println(quadrilateral);
            System.out.println(parallelogram);
            System.out.println(rhombus);
            System.out.println(triangle);
            System.out.println(isoscelesTriangle);
            System.out.println(equilateralTriangle);
            System.out.println(circle);

        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }
}
