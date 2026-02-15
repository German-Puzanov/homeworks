package LabOOP1;

public class Goat {
    private final String name;
    private final String gender;
    private int age;

    public Goat(String name, String gender, int age) throws IllegalArgumentException {
        if (name != null && !(name.isBlank()) && name.length() >= 3) {
            this.name = name;
        } else{
            throw new IllegalArgumentException("Invalid name!");
        }

        if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")){
            this.gender = gender;
        } else{
            throw new IllegalArgumentException("Invalid gender!");
        }
        if (age >= 0){
            this.age = age;
        }else {
            throw new IllegalArgumentException("Invalid age!");
        }
    }

    private int getProductivity() {
        if (!this.gender.equalsIgnoreCase("female")) return 0;
        if (this.age < 1) return 0;
        if (this.age >= 5) return 2;
        else return 5;
    }

    public void addOneYear() {
        this.age++;
    }

    public String getInfo() {
        return "Goat " + this.name + " gives " + getProductivity() + " liters of milk per day";
    }

}
