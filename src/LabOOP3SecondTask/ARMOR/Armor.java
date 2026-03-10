package LabOOP3SecondTask.ARMOR;

public interface Armor {
    int MIN_VALUE = 5;
    int MAX_VALUE = 50;

    boolean isBroken();

    int protect(int damage);

    int getPosition();
}
