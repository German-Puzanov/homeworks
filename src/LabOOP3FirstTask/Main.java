package LabOOP3FirstTask;

public class Main {
    public static void main(String[] args) {

        try {
            var worker = new Worker(null);
            System.out.println(worker);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var student = new Student(null);
            System.out.println(student);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            var pensioner = new Pensioner(null);
            System.out.println(pensioner);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
