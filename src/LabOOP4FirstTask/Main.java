package LabOOP4FirstTask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    static String path = "resourses/text2.txt";
    static String[] temp;

    static Long numCounter() throws IOException {
        Long result = null;
        long num;
        if (!Files.exists(Paths.get(path))) {
            throw new FileNotFoundException("Wrong path selected!");
        }

        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                temp = scanner.nextLine().split(" ");
                for (String word : temp) {
                    try {
                        num = Long.parseLong(word);
                        if (result == null) {
                            result = 0L;
                        }
                        result += num;
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            Long result = numCounter();
            if (result == null) {
                System.out.println("there is no numbers in this text! ");
            } else {
                System.out.printf("Sum of numbers in text = %d", numCounter());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
