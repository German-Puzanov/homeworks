package LabOOP4SecondTask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Calculator {
    static String path = "resourses/text2.txt";
    static final String calculationPath = "resourses/calculation.txt";
    static String[] temp;
    static final String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    private static String[] inputArray;
    private static String[] outputArray;


    private static void inputSetter() throws IOException {

        if (!Files.exists(Paths.get(path))) {
            throw new FileNotFoundException("Wrong path selected!");
        }

        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            temp = scanner.nextLine().trim().split("\n");
            inputArray = temp;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void calculateInputs() throws Exception {

        if (inputArray == null) {
            throw new Exception("Invalid value");
        }
        boolean isCorrectNum;
        String[] splitNum;
        String[] output = new String[inputArray.length];
        int scale;
        long resultNum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            isCorrectNum = false;
            splitNum = inputArray[i].split("");
            for (int j = 0; j < splitNum.length; j++) {
                for (String digit : digits) {
                    if (splitNum[j].equals(digit)) {
                        isCorrectNum = true;
                        break;
                    }
                }
                if (!isCorrectNum) {
                    output[i] = "Invalid";
                    break;
                }
            }
            if (isCorrectNum) {
                scale = findMaxScale(splitNum);
                long addedNumber;
                for (int j = splitNum.length - 1; j > 0; j--) {
                    addedNumber = Integer.parseInt(splitNum[j]);
                    resultNum += (int) (addedNumber * Math.pow(scale, i));
                    if (resultNum > Integer.MAX_VALUE) {
                        output[i] = "invalid (too big to convert to in Integer)";
                        break;
                    }
                }
                output[i] = String.format("%d", resultNum);
            }
        }
        outputArray = output;
    }

    private static int findMaxScale(String[] splitNum) {
        int scale = 1;

        for (String digit : splitNum) {
            int num = Integer.parseInt(digit);
            if (num > scale) {
                scale = num;
            }
        }
        return scale + 1;
    }

    public static void calculatorReport() throws Exception {
        inputSetter();
        calculateInputs();
        String[] calculationArray = new String[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            calculationArray[i] = String.format("%s = %s", inputArray[i], outputArray[i]);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(calculationPath))) {

            out.writeObject(calculationArray);
            out.flush();

        } catch (IOException ex) {
            System.out.print("Something gone wrong!");
        }
    }

}
