package LabOOP5;

import java.util.Scanner;
import java.util.Stack;

public class Calc {
    public static void main(String[] args) throws Exception {
        StackInt numbers = new StackInt();
        Stack<String> operators = new Stack<>();
        Stack<String> openBrackets = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String[] mathProblem = scanner.nextLine().trim().split("");
        String[] mathArray = new String[mathProblem.length];
        String[] digitsArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9","-"};

        StringBuilder realNumber = new StringBuilder();
        boolean numFound;
        int index = 0;

        for (String s : mathProblem) {
            numFound = false;
            for (String string : digitsArray) {
                if (s.equals(string)) {
                    realNumber.append(s);
                    numFound = true;
                    break;
                }
            }
            if (!numFound) {
                if (realNumber.isEmpty()) {
                    mathArray[index] = s;
                    index++;
                } else {
                    mathArray[index] = realNumber.toString();
                    mathArray[index + 1] = s;
                    index += 2;
                    realNumber = new StringBuilder();
                }
            }
        }


        boolean operatorFound = false;
        for (String character : mathArray) {
            if (character == null) {
                continue;
            }
            if (character.equals("-") || character.equals("+") || character.equals("*")) {
                if (operatorFound || numbers.stackList.length == 0) throw new Exception("Illegal statement!");
                operators.push(character);
                operatorFound = true;
                continue;
            }
            operatorFound = false;
            try {
                int number = Integer.parseInt(character);
                if (openBrackets.isEmpty()) throw new Exception("Illegal statement!");
                numbers.push(number);
            } catch (NumberFormatException e) {

                if (character.equals(" ")) {
                    continue;
                }
                if (character.equals("(")) {
                    openBrackets.push(character);
                }
                if (character.equals(")")) {
                    if (numbers.stackList.length < 2 || operators.isEmpty() || openBrackets.isEmpty()) {
                        throw new Exception("Illegal statement!");
                    }
                    openBrackets.pop();
                    int secondNum = numbers.pop();
                    String operator = operators.pop();
                    int firstNum = numbers.pop();
                    switch (operator) {
                        case "+" -> numbers.push(firstNum + secondNum);
                        case "-" -> numbers.push(firstNum - secondNum);
                        case "*" -> numbers.push(firstNum * secondNum);
                    }
                }
            }
        }
        if (openBrackets.isEmpty() && numbers.peek() != null && numbers.stackList.length == 1) {
            System.out.println(numbers.peek());
        } else {
            throw new Exception("Illegal statement!");
        }
    }
}


