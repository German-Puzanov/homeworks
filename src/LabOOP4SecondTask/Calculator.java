package LabOOP4SecondTask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Calculator {
    static String path = "resourses/task.txt";
    static final String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    private static String[] inputArray;
    private static String[] outputArray;


    public String getPath(){
        return path;
    }

    private void inputSetter() throws IOException {
        int length = 0;
        if (!Files.exists(Paths.get(path))) {
            throw new FileNotFoundException("Wrong path selected!");
        }

        try (FileReader reader = new FileReader(path); Scanner scanner = new Scanner(reader)) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine().trim();
                if (!line.isBlank()){
                    length++;
                }
            }
            if (length == 0) throw new Exception("Nothing to calculate!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try (FileReader reader = new FileReader(path); Scanner scanner = new Scanner(reader)) {
            String line;
            int index = 0;
            String[] input = new String[length];
            while (scanner.hasNextLine()) {
                line = scanner.nextLine().trim();
                if (!line.isBlank()){
                    input[index] = line;
                    index++;
                }
            }
            inputArray = input;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void outputSetter() {

        boolean isCorrectNum;
        String[] splitNum;
        String[] output = new String[inputArray.length];
        int scale;
        long resultNum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            isCorrectNum = false;
            splitNum = inputArray[i].split("");
            for (String s : splitNum) {
                isCorrectNum = false;
                for (String digit : digits) {
                    if (s.equals(digit)) {
                        isCorrectNum = true;
                        break;
                    }
                }
                if (!isCorrectNum) {
                    output[i] = "Invalid value (contains not valid symbols)";
                    break;
                }
            }
            if (isCorrectNum) {
                scale = findMaxScale(splitNum);
                long addedNumber;
                int pow = 0;
                boolean tooBigNumber = false;
                for (int j = splitNum.length - 1; j >= 0; j--) {
                    addedNumber = Integer.parseInt(splitNum[j]) * ((long) Math.pow(scale, pow));
                    if (addedNumber + resultNum > Integer.MAX_VALUE) {
                        tooBigNumber = true;
                        break;
                    }
                    resultNum += addedNumber;
                    pow++;
                }
                if (tooBigNumber){
                    output[i] = "invalid value (too big to convert to Integer)";
                    continue;
                }
                output[i] = String.format("%d", resultNum);
                resultNum = 0;
            }
        }
        outputArray = output;
    }

    private int findMaxScale(String[] splitNum) {
        int scale = 1;

        for (String digit : splitNum) {
            int num = Integer.parseInt(digit);
            if (num > scale) {
                scale = num;
            }
        }
        return (scale + 1);
    }

    public void calculatorReport() throws Exception {
        inputSetter();
        outputSetter();
        StringBuilder calculation = new StringBuilder();

        for (int i = 0; i < inputArray.length; i++) {
            calculation.append(String.format("%s = %s\n", inputArray[i], outputArray[i]));
        }

        try (FileWriter out = new FileWriter(path)) {
            out.write(calculation.toString());
            out.flush();
        } catch (IOException ex) {
            System.out.print("Something gone wrong!");
        }
    }

}
