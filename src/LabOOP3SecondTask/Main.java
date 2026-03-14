package LabOOP3SecondTask;

import LabOOP3SecondTask.ARMOR.Armor;
import LabOOP3SecondTask.ARMOR.Boots;
import LabOOP3SecondTask.ARMOR.Dress;
import LabOOP3SecondTask.ARMOR.Helmet;
import LabOOP3SecondTask.CHARACTER.Hero;
import LabOOP3SecondTask.CHARACTER.Knight;
import LabOOP3SecondTask.ITEM.Food;
import LabOOP3SecondTask.ITEM.HealthPotion;
import LabOOP3SecondTask.WEAPON.Sword;
import LabOOP3SecondTask.WEAPON.Weapon;

public class Main {
    public static void main(String[] args) {
        try {
            Knight kn1 = new Knight("bib",5,10);
            Knight kn2 = new Knight("bob",5,10);
            Food apple = new Food(1);
            HealthPotion boost = new HealthPotion(1);

            var sword = new Sword(5);
            kn1.change(sword);
            kn2.putInto(boost,1);
            kn1.fight(kn2,2);
            kn2.useItem(1);


            System.out.println(kn1);
            System.out.println(kn2);


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
