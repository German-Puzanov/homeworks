package лаба3;

import java.util.Scanner;

public class LabaThirdSecondTask {
    public static void main(String[] args) {
        boolean found = false;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество вводимых чисел: ");
        int numCount = Integer.parseInt(scanner.nextLine());
        if(numCount <= 0){
            System.out.println("undefined");
            return;
        }
        for (int i = 0; i < numCount; i++) {
            System.out.print("Введите число №" + (i+1) + ": ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 3 == 0){
                if(!found || num < result){
                    result = num;
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("undefined");
        }
        else{
            System.out.print("Минимальное число кратное трем: " + result);
        }
    }
}