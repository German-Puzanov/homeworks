package LabOOP3SecondTask.ARMOR;

public class Boots extends BaseArmor {
    private static final int BOOTS_POSITION = 1;

    public Boots(int durability) throws IllegalArgumentException {
        super(durability);
    }

    @Override
    public int getPosition(){
        return BOOTS_POSITION;
    }

}
