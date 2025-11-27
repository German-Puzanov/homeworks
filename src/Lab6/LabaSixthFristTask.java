package Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class LabaSixthFristTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumArr = 0;
        int[] arr;
        int lenghtUniq = 0;
        boolean isUniq;
        while (true) {
            boolean validArr = true;
            String userEntry = scanner.nextLine();
            String[] strArr = userEntry.split(" ");
            arr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                try {
                    arr[i] = Integer.parseInt(strArr[i]);
                } catch (NumberFormatException ex) {
                    System.out.println("Please, try again");
                    validArr = false;
                    break;
                }
            }
            if (validArr) {
                break;
            }
        }
        for (int num : arr) {
            sumArr += num;
        }
        for (int i = 0; i < arr.length; i++) {
            isUniq = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUniq = false;
                    break;
                }
            }
            if (isUniq) {
                lenghtUniq += 1;
            }
        }
        int[] outputArr = new int[lenghtUniq];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            isUniq = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUniq = false;
                    break;
                }
            }
            if (isUniq) {
                outputArr[index] = arr[i];
                index += 1;
            }
        }
        System.out.println("Сумма элементов массива: " + sumArr);
        System.out.println("Длинна массива: " + arr.length);
        System.out.println("Уникальные элементы массива: " + Arrays.toString(outputArr));
    }
}

