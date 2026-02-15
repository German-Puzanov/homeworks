package LabOOP1;

import java.util.Scanner;

public class LabEightTaskTwo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            String name = scanner.nextLine().trim();
            String gender = scanner.nextLine().trim();
            int age;
            try {
                age = Integer.parseInt(scanner.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println("Invalid age!");
                return;
            }
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
