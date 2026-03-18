package LabOOP3SecondTask.WEAPON;

public class Sword extends BaseWeapon{
    private static final int SWORD_DISTANCE = 2;

    public Sword(double power) throws IllegalArgumentException {
        super(power);
    }

    @Override
    public int getDistance(){
        return SWORD_DISTANCE;
    }
}
