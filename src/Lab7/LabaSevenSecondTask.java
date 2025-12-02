package Lab7;

import java.util.Arrays;
import java.util.Scanner;
public class LabaSevenSecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number < 2 || number % 2 != 0) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < 2 || number % 2 != 0){
                    System.out.println("Please, try again!");
                    continue;
                }

            } catch (NumberFormatException ex) {
                System.out.println("Please, try again!");
                continue;
            }
            String[][] strArr = new String[number][number];
            while (true){
                boolean valid = true;
                for (int i = 0; i < number; i++){
                    String[] strEntry = scanner.nextLine().split(" ");
                    strArr[i] = strEntry;
                    if (strEntry.length < number){
                        valid = false;
                        break;
                    }
                }
                int[][] matrix = new int[number][number];
                if (valid) {
                    for (int row = 0; row < number; row++) {
                        for (int num = 0; num < number; num++) {
                            matrix[row][num] = Integer.parseInt(strArr[row][num]);
                        }
                    }
                }
                else{
                    System.out.println("Please, try again!");
                    continue;
                }
                System.out.println(Arrays.deepToString(matrix));
                break;
            }
        }
    }
}
