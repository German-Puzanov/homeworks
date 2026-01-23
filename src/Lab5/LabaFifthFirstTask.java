package Lab5;

import java.util.Scanner;

public class LabaFifthFirstTask {
    public static void main(String[] args) {

        int N = 25;
        int x1, x2, x3, y1, y2, y3;

        Scanner scanner = new Scanner(System.in);

        String firstCord = scanner.nextLine().trim();
        String secondCord = scanner.nextLine().trim();
        String thirdCord = scanner.nextLine().trim();

        if (!firstCord.startsWith("(") || !firstCord.endsWith(")") || !firstCord.contains(",")) {
            System.out.println("Некорректно введены данные");
            return;
        }
        if (!secondCord.startsWith("(") || !secondCord.endsWith(")") || !secondCord.contains(",")) {
            System.out.println("Некорректно введены данные");
            return;
        }
        if (!thirdCord.startsWith("(") || !thirdCord.endsWith(")") || !thirdCord.contains(",")) {
            System.out.println("Некорректно введены данные");
            return;
        }

        int indexOfCommaFirstCord = firstCord.indexOf(",");
        int indexOfBracketFirstCord = firstCord.indexOf(")");

        int indexOfCommaSecondCord = secondCord.indexOf(",");
        int indexOfBracketSecondCord = secondCord.indexOf(")");

        int indexOfCommaThirdCord = thirdCord.indexOf(",");
        int indexOfBracketThirdCord = thirdCord.indexOf(")");

        try {
            x1 = N * Integer.parseInt(firstCord.substring(1, indexOfCommaFirstCord));
            y1 = N * Integer.parseInt(firstCord.substring(indexOfCommaFirstCord + 1, indexOfBracketFirstCord));
            x2 = N * Integer.parseInt(secondCord.substring(1, indexOfCommaSecondCord));
            y2 = N * Integer.parseInt(secondCord.substring(indexOfCommaSecondCord + 1, indexOfBracketSecondCord));
            x3 = N * Integer.parseInt(thirdCord.substring(1, indexOfCommaThirdCord));
            y3 = N * Integer.parseInt(thirdCord.substring(indexOfCommaThirdCord + 1, indexOfBracketThirdCord));
        } catch (NumberFormatException ex) {
            System.out.println("Некорректно введены данные");
            return;
        }
        double resultArea = area(x1, y1, x2, y2, x3, y3);
        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
        if (resultArea == -1) {
            System.out.println("Треугольник не прямоугольный не могу посчитать");
        } else {
            System.out.printf("%.2f", area(x1, y1, x2, y2, x3, y3));
        }

    }

    static double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (((x1 - x2) * (x3 - x2) + (y1 - y2) * (y3 - y2)) == 0 ||
                ((x2 - x1) * (x3 - x2) + (y2 - y1) * (y3 - y2)) == 0 ||
                ((x1 - x3) * (x2 - x3) + (y1 - y3) * (y2 - y3)) == 0) {
            double lengthAC = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            double lengthCE = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            return 0.5 * lengthAC * lengthCE;
        } else {
            return -1;
        }
    }
}