package LabOOP3FirstTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine().trim();
        try {
            var worker = new Worker(name);
            System.out.println(worker);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var student = new Student(name);
            System.out.println(student);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var pensioner = new Pensioner(name);
            System.out.println(pensioner);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
