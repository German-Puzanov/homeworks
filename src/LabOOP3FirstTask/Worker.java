package LabOOP3FirstTask;

public class Worker extends BasePerson{
    public Worker(String name) throws IllegalArgumentException {
        super(name);
    }

    @Override
    public String getEmployment(){
        return "works";
    }

}
