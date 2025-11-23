package лаба1;

import java.util.Scanner;

public class LabaFirstFirstTask {
    public static void main(String[] args){

        int N = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число А затем число В ");

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        double result = (N + 2)/Math.sqrt(Math.abs(A*B)) - Math.pow(B,2)/N;

        System.out.println("/// РЕЗУЛЬТАТ ///");
        System.out.printf("%.3f",result);
        scanner.close();
    }
}
