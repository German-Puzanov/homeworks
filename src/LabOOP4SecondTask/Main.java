package LabOOP4SecondTask;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Calculator calc = new Calculator();
            System.out.println(calc.decimalCalculation());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
