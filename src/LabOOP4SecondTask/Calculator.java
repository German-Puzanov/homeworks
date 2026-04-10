package LabOOP4SecondTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Calculator {
    static String path = "resourses/text2.txt";
    static String[] temp;
    static String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};

    private String numberGetter() throws IOException {
        boolean isCorrectDigit;

        if (!Files.exists(Paths.get(path))) {
            throw new FileNotFoundException("Wrong path selected!");
        }

        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            temp = scanner.nextLine().trim().split("");
            for (String digit : temp) {
                isCorrectDigit = false;
                for (String correctDigit : digits) {
                    if (digit.equals(correctDigit)) {
                        isCorrectDigit = true;
                        break;
                    }
                }
                if (!isCorrectDigit) {
                    return null;
                }
            }
            StringBuilder result = new StringBuilder();
            for (String num : temp) {
                result.append(num);
            }
            return result.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer decimalCalculation() throws Exception {
        String num = numberGetter();
        if (num == null) {
            throw new Exception("Invalid value");
        }

        String[] numArr = num.split("");
        Integer maxNum = null;
        int digit;
        for (String s : numArr) {
            digit = Integer.parseInt(s);
            if (maxNum == null || digit > maxNum) {
                maxNum = digit;
            }
        }

        int result = 0;
        int index = 0;
        maxNum += 1;
        double nextValue;
        for (int i = numArr.length - 1; i >= 0; i--) {
            nextValue = Integer.parseInt(numArr[i]) * Math.pow(maxNum, index);
            if (nextValue > Integer.MAX_VALUE) {
                throw new Exception("Number too big to convert it to int!");
            } else {
                result += (int) nextValue;
                index++;
            }
        }
        return result;
    }

}
