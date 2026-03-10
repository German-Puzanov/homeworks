package LabOOP3FirstTask;

public class Student extends BasePerson{
    public Student(String name) throws IllegalArgumentException {
        super(name);
    }

    @Override
    public String getEmployment(){
        return "study";
    }

    @Override
    public String toString(){
        return String.format("%s %s",getName(),getEmployment());
    }
}
