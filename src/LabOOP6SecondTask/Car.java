package LabOOP6SecondTask;

public class Car {
    private String number;


    public Car(String number) throws Exception {
        setNumber(number);
    }

    private void setNumber(String number) throws Exception {
        if (number != null && number.matches("^[А-Я]{1}[0-9]{3}[А-Я]{2}-[0-9]{2}[A-Z]{3}")) {
            this.number = number;
        } else {
            throw new Exception("Illegal car number");
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%s", number);
    }
}
