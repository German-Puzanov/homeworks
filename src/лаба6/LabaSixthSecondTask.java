package лаба6;

import java.util.Arrays;
import java.util.Scanner;

public class LabaSixthSecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String strEntry = scanner.nextLine();
        String[] strArr = strEntry.split(" ");

        System.out.println(Arrays.toString(strArr));

        String intEntry = scanner.nextLine();
        String[] numArrStr = intEntry.split(" ");
        int[] numArr = new int[numArrStr.length];

        for (int i = 0; i < numArrStr.length; i++){
            try {
                int digit = Integer.parseInt(numArrStr[i]);
                numArr[i] = digit;
            } catch (NumberFormatException e) {
                scanner.close();
                System.out.println("Error");
                return;
            }

        }
        System.out.println(Arrays.toString(numArr));

    }

}
