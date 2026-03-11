package LabOOP3SecondTask.ARMOR;

public class Helmet extends BaseArmor{
    private int HELMET_POSITION = 3;

    public Helmet(int durability) throws IllegalArgumentException {
        super(durability);
    }

    @Override
    public int getPosition() {
        return HELMET_POSITION;
    }

}
