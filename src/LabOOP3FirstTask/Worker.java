package LabOOP3FirstTask;

public class Worker extends BasePerson{
    public Worker(String name) throws IllegalArgumentException {
        super(name);
    }

    @Override
    public String getEmployment(){
        return "works";
    }

    @Override
    public String toString(){
        return String.format("%s %s",getName(),getEmployment());
    }
}
