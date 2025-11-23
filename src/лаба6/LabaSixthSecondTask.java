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

        for (int i = 0; i < numArrStr.length; i++) {
            try {
                int digit = Integer.parseInt(numArrStr[i]);
                numArr[i] = digit;
            } catch (NumberFormatException e) {
                scanner.close();
                System.out.println("Error");
                return;
            }

        }
        int resultLenght = 0;
        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (strArr[i].length() == numArr[j]) {
                    resultLenght += 1;
                }
            }
        }

        System.out.println(resultLenght);
        String[] result = new String[resultLenght];
        int index = 0;
        for (int i = 0; i < strArr.length; i++) {
            boolean rigthLenght = false;
            for (int j = 0; j < numArr.length; j++) {
                if (strArr[i].length() == numArr[j]) {
                    rigthLenght = true;
                    break;
                }
            }
            if (rigthLenght) {
                result[index] = strArr[i];
                index += 1;
            }
        }
        for (String k : result){
            System.out.print(k + " ");
        }
    }


}
