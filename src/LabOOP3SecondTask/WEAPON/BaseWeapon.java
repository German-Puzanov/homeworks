package LabOOP3SecondTask.WEAPON;

public abstract class BaseWeapon implements Weapon{
    protected double power;

    public BaseWeapon(double power) throws IllegalArgumentException{
        if (power < MIN_VALUE) {
            throw new IllegalArgumentException("Error: Power below MIN_VALUE");
        }
        if (power > MAX_VALUE) {
            throw new IllegalArgumentException("Error: Power over MAX_VALUE");
        }
        this.power = power;
    }

    @Override
    public double getPower() {
        return this.power;
    }

    @Override
    public int getDistance() {
        return 1;
    }

    @Override
    public String toString(){
        return String.format("[%S], power: [%.1f], distance: [%d]",getClass().getSimpleName(),getPower(),getDistance());
    }
}
