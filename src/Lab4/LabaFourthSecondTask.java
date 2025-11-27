package Lab4;

import java.util.Scanner;

public class LabaFourthSecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBooks;
        String searchingBook;
        String bookEntry;
        while (true) {

            boolean found = false;
            System.out.print("input number of books on the shelf: ");
            if (!scanner.hasNextInt()) {
                String input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("stop")) {
                    break;
                }
                continue;
            }

            String numOfBooks = scanner.nextLine().trim();
            if (numOfBooks.equalsIgnoreCase("stop")) {
                break;
            }
            if (Integer.parseInt(numOfBooks) <= 0) {
                continue;
            } else {
                numBooks = Integer.parseInt(numOfBooks);
            }

            System.out.print("input the finding book: ");
            searchingBook = scanner.nextLine().trim();

            if (searchingBook.equalsIgnoreCase("stop")) {
                break;
            }

            for (int i = 1; i <= numBooks; i++) {
                System.out.print("book " + (i) + ": ");
                bookEntry = scanner.nextLine().toLowerCase().trim();
                if (bookEntry.equals(searchingBook)) {
                    System.out.println("Checked " + i + " books and found " + searchingBook);
                    found = true;
                    break;
                }
                if (bookEntry.equals("stop")) {
                    System.out.println("You checked " + (i - 1) + " books and didn't find " + searchingBook);
                    return;
                }
            }

            if (!found) {
                System.out.println("You didn't find " + searchingBook);
            }
        }
    }
}