package LabOOP2.LabOOP2SecondTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] sides = new int[input.length];
        try {
            for (int i = 0; i < input.length; i++) {
                sides[i] = Integer.parseInt(input[i]);
            }
        } catch (NumberFormatException ignored) {
        }

        try {
            var polygon = new Polygon(sides);
            System.out.println(polygon);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var quadrilateral = new Quadrilateral(sides);
            System.out.println(quadrilateral);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var parallelogram = new Parallelogram(sides);
            System.out.println(parallelogram);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var rhombus = new Rhombus(sides);
            System.out.println(rhombus);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var triangle = new Triangle(sides);
            System.out.println(triangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var isoscelesTriangle = new IsoscelesTriangle(sides);
            System.out.println(isoscelesTriangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var equilateralTriangle = new EquilateralTriangle(sides);
            System.out.println(equilateralTriangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var circle = new Circle(sides);
            System.out.println(circle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
