package LabOOP3SecondTask;

import LabOOP3SecondTask.ARMOR.Boots;
import LabOOP3SecondTask.ARMOR.Dress;
import LabOOP3SecondTask.ARMOR.Helmet;
import LabOOP3SecondTask.ITEM.HealthPotion;
import LabOOP3SecondTask.WEAPON.Sword;

public class Main {
    public static void main(String[] args) {
        try {
            var hpPotion = new HealthPotion(1);
            System.out.println(hpPotion);
            hpPotion.use();
            System.out.println(hpPotion);

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
