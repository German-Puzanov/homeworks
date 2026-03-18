package LabOOP3FirstTask;

public class Main {
    public static void main(String[] args) {
        try {
            Person[] mock = new Person[3];
            mock[0] = new Worker("Petr");
            mock[1] = new Student("Gleb");
            mock[2] = new Pensioner("Ivan Kuzmich");

            //Person worker = new Worker("Ben");

            for (Person pers : mock) {
                System.out.println(pers);
            }
            //System.out.println(worker.getEmployment());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
