package LabOOP3FirstTask;

public class Main {
    public static void main(String[] args) {
        try {
            var worker = new Worker("Ivan");
            var student = new Student("Dima");
            var pensioner = new Pensioner("Nikolai");

            System.out.println(worker);
            System.out.println(student);
            System.out.println(pensioner);

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
