package Lab4;

import java.util.Scanner;

public class LabaFourthFirstTask {
    public static void main(String[] args) {
        int minPrime = 0;
        int sumNonePrime = 0;
        int num;
        int N = 25;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean primeFound = true;
            if (!scanner.hasNextInt()){
                if ("stop".equalsIgnoreCase(scanner.next())){
                    scanner.nextLine();
                    break;
                }
                System.out.println("invalid");
                scanner.nextLine();
                continue;
            }

            num = Integer.parseInt(scanner.next());

            if (num <= 1 || num == N) {
                System.out.println("invalid");
                continue;
            }

            if (num % 2 == 0 && num != 2) {
                primeFound = false;
            } else {
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
                    if (num % i == 0) {
                        primeFound = false;
                        break;
                    }
                }
            }

            if (primeFound) {
                if (minPrime == 0 || num < minPrime) {
                    minPrime = num;
                }
            }
            else {
                sumNonePrime += num;
            }

        }
        scanner.close();

        String resultSumNonePrime = Integer.toString(sumNonePrime);
        String resultMinPrime = Integer.toString(minPrime);

        if (resultSumNonePrime.equals("0")) {
            resultSumNonePrime = "undefined";
        }
        if (resultMinPrime.equals("0")) {
            resultMinPrime = "undefined";
        }

        System.out.println("Сумма составных чисел: non-prime_" + resultSumNonePrime);
        System.out.println("Самое маленькое простое число: prime_" + resultMinPrime);
    }
}