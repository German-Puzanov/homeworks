package LabOOP3FirstTask;

public class Main {
    public static void main(String[] args) {

        try {
            var worker = new Worker("");
            System.out.println(worker);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var student = new Student("Dima");
            System.out.println(student);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var pensioner = new Pensioner("Nikolai");
            System.out.println(pensioner);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
