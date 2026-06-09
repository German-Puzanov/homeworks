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
                        case "left" -> rotate(command[1], "left");
                        case "right" -> rotate(command[1], "right");
                        default -> {
                            System.out.println("Error: Invalid command");
                            continue;
                        }
                    }
                    break;
                case 3:
                    if (command[0].equals("push")) {
                        push(command[1], command[2]);
                        System.out.println(list);
                        continue;
                    } else {
                        System.out.println("Error: Invalid command");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid command");
            }
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
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Error: Invalid push argument!");
        }
    }

    private static void pop(String number) {
        try {
            Integer num = Integer.parseInt(number);
            list.remove(num);
            System.out.println(list);
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

    private static void rotate(String stp, String dir) {
        try {
            if (list.isEmpty()) return;
            int step = Integer.parseInt(stp) % list.size();
            int size = list.size();
            ArrayList<Integer> rotateList = new ArrayList<>(list);
            int newIndex;
            for (int i = 0; i < rotateList.size(); i++) {
                if (dir.equalsIgnoreCase("left")) {
                    newIndex = (i - step + size) % size;
                } else {
                    newIndex = (i + step) % size;
                }
                rotateList.set(newIndex, list.get((i)));
            }
            list.clear();
            list.addAll(rotateList);
            System.out.println(list);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid rotate argument!");
        }
    }

}

