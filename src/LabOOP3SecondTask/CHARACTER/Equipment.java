package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ARMOR.Armor;
import LabOOP3SecondTask.WEAPON.Weapon;

public interface Equipment {
    int CLOTHES_COUNT = 3;

    boolean change(Weapon weapon);
    void dress(Armor armor);
}
