package LabOOP3FirstTask;

public abstract class BasePerson implements Person{
    private final String name;

    public BasePerson(String name) throws IllegalArgumentException{
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmployment() {
        return "";
    }
    @Override
    public String toString(){
        return String.format("%s %s",getName(),getEmployment());
    }
}
