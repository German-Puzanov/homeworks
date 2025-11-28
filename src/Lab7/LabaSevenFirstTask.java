package Lab7;

import java.util.Scanner;

public class LabaSevenFirstTask {
    public static void main(String[] args) {
        int N = 25;
        Scanner scanner = new Scanner(System.in);
        try {
            int rows = Integer.parseInt(scanner.nextLine());
            int columns = Integer.parseInt(scanner.nextLine());
            if (rows <= 0 || columns <= 0){
                System.out.println("Error");
                return;
            }
            int[][] arr = new int[rows][columns];
            boolean reverse = true;
            int columnPos = columns - 1;
            int rowPos = rows - 1;

            for (int i = 1; i <= (rows * columns); i++) {
                arr[rowPos][columnPos] = i + N - 1;
                if (reverse) {
                    if (rowPos == 0) {
                        columnPos -= 1;
                        reverse = false;
                    } else {
                        rowPos -= 1;
                    }
                } else {
                    if (rowPos == rows - 1) {
                        columnPos -= 1;
                        reverse = true;
                    } else {
                        rowPos += 1;
                    }
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("\t" + arr[i][j]);
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error");
            scanner.close();
        }
    }
}
