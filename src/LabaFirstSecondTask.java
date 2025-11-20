import java.util.Scanner;

public class LabaFirstSecondTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");

        String str = scanner.nextLine();

        System.out.println("Введите начальный и конечный индекс новый строки ");

        int startIndex = Integer.parseInt(scanner.nextLine());
        int endIndex = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите какой символ вы хотите заменить и новый символ ");

        String oldChar = scanner.nextLine();
        String newChar = scanner.nextLine();

        String newStr = str.substring(startIndex,endIndex);

        System.out.println("/// РЕЗУЛЬТАТ ///");

        System.out.println(newStr);
        System.out.println(newStr.replace(oldChar,newChar));
        System.out.println(newStr.toLowerCase());

        scanner.close();
    }
}
