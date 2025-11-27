package Lab2;

import java.util.Scanner;

public class LabaSecondSecondTask {
    public static void main(String[] args) {

        double result = 0;
        double weight = 0;
        Scanner scanner = new Scanner(System.in);
        int N = 1;

        System.out.print("Введите Фрукт: ");
        String item = scanner.nextLine().toLowerCase();

        System.out.print("Введите день недели или месяц: ");
        String dayMonth = scanner.nextLine().toLowerCase();

        System.out.println("Введите вес: ");
        if (scanner.hasNextDouble()) {
            weight = Double.parseDouble(scanner.nextLine());
        } else {
            System.out.println("INVALID");
            return;
        }
        scanner.close();


        Boolean boolDayMonths = switch (dayMonth) {
            case "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "january", "february",
                 "march", "april", "may", "june", "july", "august", "september", "october",
                 "november", "december" -> true;
            default -> false;
        };

        if (boolDayMonths && weight >= 0) {
            switch (item) {
                case "apple":
                    result = 9.99 * N * weight;
                    break;
                case "banana":
                    result = 11.49 * N * weight;
                    break;
                case "grapes":
                    result = 15.99 * N * weight;
                    break;
                case "kiwi":
                    result = 37.99 * N * weight;
                    break;
                case "mango":
                    result = 39.99 * N * weight;
                    break;
                case "orange":
                    result = 17.99 * N * weight;
                    break;
                case "plum":
                    result = 10.98 * N * weight;
                    break;
                default:
                    System.out.println("INVALID");
                    return;
            }

            if ((dayMonth.equals("march") || dayMonth.equals("april") || dayMonth.equals("may"))
                    && (item.equals("apple") || item.equals("kiwi"))) {
                result *= 1.09;
                System.out.println(Math.ceil(result * 100) / 100);
            } else {
                System.out.println(Math.ceil(result * 100) / 100);
            }
        } else {
            System.out.println("INVALID");

        }
    }
}