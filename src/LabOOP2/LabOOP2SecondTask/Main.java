package LabOOP2.LabOOP2SecondTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();
        int[] sides = new int[input.length];
        try {
            for (int i = 0; i < input.length; i++) {
                sides[i] = Integer.parseInt(input[i]);
            }
        } catch (NumberFormatException ignored) {
        }

        try {
            var polygon = new Polygon(sides);
            System.out.println("Многоугольник: " + polygon);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var quadrilateral = new Quadrilateral(sides);
            System.out.println("Четырехугольник: " + quadrilateral);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var parallelogram = new Parallelogram(sides);
            System.out.println("Параллелограмм: " + parallelogram);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var rhombus = new Rhombus(sides);
            System.out.println("Ромб: " + rhombus);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var triangle = new Triangle(sides);
            System.out.println("Треугольник: " + triangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var isoscelesTriangle = new IsoscelesTriangle(sides);
            System.out.println("Равнобедренный треугольник: " + isoscelesTriangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var equilateralTriangle = new EquilateralTriangle(sides);
            System.out.println("Равносторонний треугольник: " +equilateralTriangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var circle = new Circle(sides);
            System.out.println("Круг: " +circle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
