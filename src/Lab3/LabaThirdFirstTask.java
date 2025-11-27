package Lab3;

import java.util.Scanner;

public class LabaThirdFirstTask {
    public static void main(String[] args) {

        int N = 25;
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("Введите число: ");
            int userNum = Integer.parseInt(scanner.nextLine());

            if ((userNum >= -15*N) && (userNum <= -11*N) || (userNum >= 11*N) && (userNum <= 15*N)){
                System.out.print("Correct_Number_" + userNum);
                scanner.close();
                break;
            }
            else{
                System.out.println("Not_yet");
            }
        }
    }
}
