package Lab7;

import java.util.Scanner;

public class LabaSevenSecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number < 2 || number % 2 != 0) {
            try {
                number = Integer.parseInt(scanner.nextLine().trim());
                if (number < 2 || number % 2 != 0) {
                    System.out.println("Please, try again!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Please, try again!");
            }
        }
        String[][] strArr = new String[number][number];
        int[][] matrix = new int[number][number];
        boolean valid;
        while (true) {
            valid = true;
            for (int i = 0; i < number; i++) {
                String[] strEntry = scanner.nextLine().trim().split(" ");
                strArr[i] = strEntry;
                if (strEntry.length < number) {
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Please, try again!");
                continue;
            }

            for (int row = 0; row < number; row++) {
                for (int num = 0; num < number; num++) {
                    try {
                        matrix[row][num] = Integer.parseInt(strArr[row][num]);
                    } catch (NumberFormatException e) {
                        valid = false;
                    }
                }
            }

            if (!valid) {
                System.out.println("Please, try again!");
            } else {
                break;
            }
        }
        int firstSum = 0;
        int secondSum = 0;
        int thirdSum = 0;
        int fourthSum = 0;
        int halfNum = number / 2;
        for (int i = 0; i < halfNum; i++) {
            for (int j = 0; j < halfNum; j++) {
                firstSum += matrix[i][j];
                thirdSum += matrix[halfNum + i][j];
            }
        }
        for (int i = 0; i < halfNum; i++) {
            for (int j = 0; j < halfNum; j++) {
                secondSum += matrix[i][j + halfNum];
                fourthSum += matrix[halfNum + i][j + halfNum];
            }
        }
        System.out.println(firstSum);
        System.out.println(secondSum);
        System.out.println(thirdSum);
        System.out.println(fourthSum);

    }
}