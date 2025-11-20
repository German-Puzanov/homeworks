import java.util.Scanner;

public class LabaFifthSecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.nextLine().trim();

        double result = averageNum(entry, 0, 0);
        if (result == (int) result) {
            System.out.printf("%d", (int) result);
        }
        else{
            System.out.printf("%s", result);
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
            try {
                String newText = text.substring(indexOfSpace + 1);
                int num = Integer.parseInt(text.substring(0, indexOfSpace));
                return averageNum(newText, value + num, count + 1);

            } catch (NumberFormatException ex) {
                String newText = text.substring(indexOfSpace + 1);
                return averageNum(newText, value, count);
            }
        }
    }
}
