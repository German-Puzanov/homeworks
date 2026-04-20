package LabOOP6FirstTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = new String[1];

        while (command[0] == null || !command[0].equalsIgnoreCase("stop")) {
            command = scanner.nextLine().trim().split(" ");

            switch (command.length) {
                case 1:
                    if (command[0].equalsIgnoreCase("stop")) return;
                    else {
                        System.out.println("Error: Invalid command");
                        continue;
                    }
                case 2:
                    switch (command[0]) {
                        case "pop" -> pop(command[1]);
                        case "search" -> {
                            search(command[1]);
                            continue;
                        }
                        case "left" -> left(command[1]);
                        case "right" -> right(command[1]);
                        default -> {
                            System.out.println("Error: Invalid command");
                            continue;
                        }
                    }
                    break;
                case 3:
                    if (command[0].equals("push")) {
                        push(command[1], command[2]);
                    } else {
                        System.out.println("Error: Invalid command");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid command");
                    continue;
            }
            System.out.println(list);
        }

    }

    private static void push(String index, String number) {
        try {
            Integer num = Integer.parseInt(number);
            int idx = Integer.parseInt(index);
            if (idx > list.size()) {
                list.addLast(num);
            } else {
                list.add(idx, num);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid push argument!");
        }
    }

    private static void pop(String number) {
        try {
            Integer num = Integer.parseInt(number);
            list.remove(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid pop argument!");
        }
    }

    private static void search(String number) {
        try {
            Integer num = Integer.parseInt(number);
            if (!list.contains(num)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid search argument!");
        }
    }

    private static void left(String stp) {
        try {
            int step = Integer.parseInt(stp);
            ArrayList<Integer> rotateList = new ArrayList<>(list);
            list.clear();
            for (int i = 0; i < rotateList.size(); i++) {
                push(String.format("%d", Math.abs(i - step) % rotateList.size()), String.format("%d", rotateList.get(i)));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid left argument!");
        }
    }

    private static void right(String stp) {
        try {
            int step = Integer.parseInt(stp);
            ArrayList<Integer> rotateList = new ArrayList<>(list);
            list.clear();
            for (int i = 0; i < rotateList.size(); i++) {
                push(String.format("%d", Math.abs(i + step) % rotateList.size()), String.format("%d", rotateList.get(i)));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid right argument!");
        }
    }
}

