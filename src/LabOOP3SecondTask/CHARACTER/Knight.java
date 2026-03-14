package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.WEAPON.Weapon;

public class Knight extends Hero {
    private int MAX_STRENGTH = 100;
    private int strength;
    private int forcePower = 1;

    public Knight(String username, int health, int strength) throws IllegalArgumentException {
        super(username, health);
        if (strength > MAX_STRENGTH) throw new IllegalArgumentException("Error: strength over MAX_VALUE");
        if (strength < 0) throw new IllegalArgumentException("Error: strength bellow zero");
        this.strength = strength;
    }


    @Override
    public String getUserName() {
        return username.trim();
    }

    @Override
    public boolean fight() {
        return false;
    }

}
