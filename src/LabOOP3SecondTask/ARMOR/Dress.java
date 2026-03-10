package LabOOP3SecondTask.ARMOR;

public class Dress extends BaseArmor{
    private int DRESS_POSITION = 2;

    public Dress(int durability) throws IllegalArgumentException {
        super(durability);
    }

    @Override
    public int getPosition(){
        return DRESS_POSITION;
    }
}
