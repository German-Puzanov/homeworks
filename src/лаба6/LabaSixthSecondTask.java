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
        for (String s : strArr) {
            for (int i : numArr) {
                if (s.length() == i) {
                    resultLenght += 1;
                }
            }
        }

        System.out.println(resultLenght);
        String[] result = new String[resultLenght];
        int index = 0;
        for (String s : strArr) {
            boolean rigthLenght = false;
            for (int i : numArr) {
                if (s.length() == i) {
                    rigthLenght = true;
                    break;
                }
            }
            if (rigthLenght) {
                result[index] = s;
                index += 1;
            }
        }
        for (String k : result){
            System.out.print(k + " ");
        }
    }


}
