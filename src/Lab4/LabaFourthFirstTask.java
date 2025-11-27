package Lab4;

import java.util.Scanner;

public class LabaFourthFirstTask {
    public static void main(String[] args) {
        int minPrime = 0;
        int sumNonePrime = 0;
        int num;
        int maxPrime = 0;
        int maxNonePrime = 0;
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
            if (num == 2) {
                if (maxPrime == 0) maxPrime = num;
                if (minPrime == 0 || num < minPrime) minPrime = num;
                continue;
            }
            if (num % 2 == 0) {
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
                if (maxPrime == 0 || num > maxPrime) {
                    maxPrime = num;
                }
                if (minPrime == 0 || num < minPrime) {
                    minPrime = num;
                }
            }
            if (!primeFound) {
                sumNonePrime += num;
                if (maxNonePrime == 0 || num > maxNonePrime) {
                    maxNonePrime = num;
                }
            }

        }
        scanner.close();

        String resultMaxPrime = Integer.toString(maxPrime);
        String resultMaxNonePrime = Integer.toString(maxNonePrime);
        String resultSumNonePrime = Integer.toString(sumNonePrime);
        String resultMinPrime = Integer.toString(minPrime);

        if (resultMaxPrime.equals("0")) {
            resultMaxPrime = "undefined";
        }
        if (resultMaxNonePrime.equals("0")) {
            resultMaxNonePrime = "undefined";
        }
        if (resultSumNonePrime.equals("0")) {
            resultSumNonePrime = "undefined";
        }
        if (resultMinPrime.equals("0")) {
            resultMinPrime = "undefined";
        }

        System.out.println("Самое большое простое число: prime_" + resultMaxPrime);
        System.out.println("Самое большое составное число: non-prime_" + resultMaxNonePrime);
        System.out.println("Сумма составных чисел: non-prime_" + resultSumNonePrime);
        System.out.println("Самое маленькое простое число: prime_" + resultMinPrime);
    }
}
