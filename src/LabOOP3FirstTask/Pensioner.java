package LabOOP3FirstTask;

public class Pensioner extends  BasePerson{
    public Pensioner(String name) throws IllegalArgumentException {
        super(name);
    }

    @Override
    public String getEmployment(){
        return "Pensioner";
    }

    @Override
    public String toString() {
        return String.format("%s is resting", getName());
    }


}
