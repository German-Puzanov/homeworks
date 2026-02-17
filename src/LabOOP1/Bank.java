package LabOOP1;

import java.util.Scanner;

public class Bank {
    public static final int MAX_NUM_OF_ACCOUNTS = 100;
    public static BankAccount[] accounts = new BankAccount[MAX_NUM_OF_ACCOUNTS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idCount = 0;

        while (true) {
            String command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("end")) {
                break;
            }
            if (command.equalsIgnoreCase("create")) {
                idCount++;
                if (idCount == MAX_NUM_OF_ACCOUNTS+1) {
                    idCount--;
                    System.out.println("No vacant places, please choose another bank");
                    continue;
                }
                accounts[idCount - 1] = new BankAccount();
                System.out.println("Account ID" + idCount + " created");
                continue;

            }
            String[] commandSplit = command.split(" ");
            try {
                if (commandSplit[0].equalsIgnoreCase("Set") && commandSplit[1].equalsIgnoreCase("interest")) {
                    BankAccount.setInterestRate(Double.parseDouble(commandSplit[2]));
                    System.out.println("Changed Interest rate");
                    continue;
                }
                if (commandSplit[0].equalsIgnoreCase("Add") && commandSplit[1].equalsIgnoreCase("deposit")) {
                    if (Integer.parseInt(commandSplit[2]) > idCount) {
                        System.out.println("Account ID" + commandSplit[2] + " does not exist");
                    } else {
                        accounts[Integer.parseInt(commandSplit[2]) - 1].deposit(Double.parseDouble(commandSplit[3]));
                        System.out.println("Deposited " + commandSplit[3] + " to ID" + commandSplit[2]);
                    }
                    continue;
                }
                if (commandSplit[0].equalsIgnoreCase("Get") && commandSplit[1].equalsIgnoreCase("interest")) {
                    if (Integer.parseInt(commandSplit[2]) > idCount) {
                        System.out.println("Account ID" + commandSplit[2] + " does not exist");
                    } else {
                        System.out.println(accounts[Integer.parseInt(commandSplit[2]) - 1].getInterestRate(Integer.parseInt(commandSplit[3])));
                    }
                    continue;
                }
                System.out.println("Invalid command");

            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid entry");

            }
        }
    }
}
