package Lab5;

import java.util.Scanner;

public class LabaFifthSecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        String entry = scanner.nextLine().trim();

        double result = averageNum(entry, 0, 0);
        if (result == (int) result) {
            System.out.printf("Среднее арифметическое чисел = " + "%d", (int) result);
        } else {
            System.out.printf("Среднее арифметическое чисел = " + "%s", result);
        }
    }

    static double averageNum(String text, int value, int count) {
        if (text.isEmpty()) {
            if (count == 0) {
                return 0;
            } else {
                return (double) value / count;
            }
        }
        int indexOfSpace = text.indexOf(" ");
        if (indexOfSpace == -1) {
            try {
                int num = Integer.parseInt(text);
                return (double) (value + num) / (count + 1);

            } catch (NumberFormatException ex) {
                if (count == 0) {
                    return 0;
                } else {
                    return (double) value / count;
                }
            }
        } else {
            String newText = text.substring(indexOfSpace + 1);
            try {
                int num = Integer.parseInt(text.substring(0, indexOfSpace));
                return averageNum(newText, value + num, count + 1);

            } catch (NumberFormatException ex) {
                return averageNum(newText, value, count);
            }
        }
    }
}
