package LabOOP6SecondTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Car> parkingCars = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] command;
        boolean onParking;

        do {
            command = scanner.nextLine().trim().split(" ");
            if (command.length == 1 && command[0].equalsIgnoreCase("stop")) break;
            if (command.length != 2) {
                System.out.println("Invalid command, please try again!");
                continue;
            }
            switch (command[0]) {
                case "IN,", "IN", "in,", "in" -> {
                    onParking = false;
                    try {
                        for (Car car : parkingCars) {
                            if (car.getNumber().equals(command[1])) {
                                onParking = true;
                                break;
                            }
                        }
                        if (!onParking) {
                            Car newCar = new Car(command[1]);
                            parkingCars.add(newCar);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "OUT,", "OUT", "out,", "out" -> {
                    onParking = false;
                    for (Car car : parkingCars) {
                        if (car.getNumber().equals(command[1])) {
                            parkingCars.remove(car);
                            onParking = true;
                            break;
                        }
                    }
                    if (!onParking) {
                        System.out.println("Error: The car had already left the parking or hadn't ever been in the parking");
                    }
                }
                case "search", "SEARCH", "search,", "SEARCH," -> {
                    onParking = false;
                    for (Car car : parkingCars) {
                        if (car.getNumber().equals(command[1])) {
                            onParking = true;
                            break;
                        }
                    }
                    if (onParking) {
                        System.out.println("Car in parking");
                    } else {
                        System.out.println("No such car on parking");
                    }
                }
                default -> System.out.println("Invalid command, please try again");
            }
        } while (true);

        if (parkingCars.isEmpty()) {
            System.out.println("Parking is empty");
        } else {
            for (Car car : parkingCars) {
                System.out.println(car);
            }
        }
    }
}
