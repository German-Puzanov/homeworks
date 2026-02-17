package LabOOP1;

import java.util.Scanner;

public class LabEightTaskTwo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите имя козы/козла (длина имени >= 3 символа): ");
            String name = scanner.nextLine().trim();

            int age;
            System.out.print("Введите возраст козы/козла: ");
            try {
                age = Integer.parseInt(scanner.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println("Invalid age!");
                return;
            }
            System.out.print("Введите коза или козел (male/female): ");
            String gender = scanner.nextLine().trim();

            Goat goat = new Goat(name, gender, age);
            System.out.println(goat.getInfo());
            while(!scanner.nextLine().trim().equalsIgnoreCase("q")){
                goat.addOneYear();
                System.out.println("Через год: \n" +  goat.getInfo());
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



    }
}
