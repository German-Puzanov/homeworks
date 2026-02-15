package LabOOP1;

import java.util.Scanner;

public class LabEightTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEdge;
        try {
            System.out.print("Enter the edge of icosahedron: ");
            inputEdge = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! ");
            return;
        }

        Icosahedron icosahedron = new Icosahedron(inputEdge);

        System.out.println("Faces area = " + icosahedron.getFacesArea());
        System.out.println("Area = " + icosahedron.getArea());
        System.out.println("Volume = " + icosahedron.getVolume());
    }
}
