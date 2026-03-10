package LabOOP3FirstTask;

public class BasePerson implements Person{
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
}
