package LabOOP2;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passengersNum;
        int oarsCount;
        do {
            try {
                try {
                    System.out.print("Введите количество пассажиров лодки: ");
                    passengersNum = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите количество вёсел лодки: ");
                    oarsCount = Integer.parseInt(scanner.nextLine());
                    Boat boat = new Boat(passengersNum, oarsCount);

                    System.out.println(boat);
                } catch (NumberFormatException e) {
                    System.out.println("Illegal Entry!");

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (!scanner.nextLine().equals("q"));
    }
}
