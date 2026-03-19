package LabOOP3SecondTask;

import LabOOP3SecondTask.ARMOR.Armor;
import LabOOP3SecondTask.ARMOR.Boots;
import LabOOP3SecondTask.ARMOR.Dress;
import LabOOP3SecondTask.ARMOR.Helmet;
import LabOOP3SecondTask.CHARACTER.Hero;
import LabOOP3SecondTask.CHARACTER.Knight;
import LabOOP3SecondTask.ITEM.Food;
import LabOOP3SecondTask.ITEM.HealthPotion;
import LabOOP3SecondTask.WEAPON.Dagger;
import LabOOP3SecondTask.WEAPON.Sword;
import LabOOP3SecondTask.WEAPON.Weapon;

public class Main {
    public static void main(String[] args) {
        try {
            Knight kn1 = new Knight("bib",10,10);
            Knight kn2 = new Knight("bob",10,10);

            Food apple = new Food(10);
            HealthPotion boost = new HealthPotion(1);
            Sword sword = new Sword(10);
            Armor helmet = new Helmet(5);
            Armor boots = new Boots(5);
            Armor chestplate = new Dress(5);

            kn1.change(sword);
            kn2.dress(helmet);
            kn2.dress(boots);
            kn2.dress(chestplate);

            kn1.fight(kn2,1);
            System.out.println(kn1);
            System.out.println(kn2);
            System.out.println();

            kn1.fight(kn2,1);
            System.out.println(kn1);
            System.out.println(kn2);
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
