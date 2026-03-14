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
            Knight kn1 = new Knight("bib",50,2);
            Knight kn2 = new Knight("bob",50,2);

            var sapogi = new Boots(5);
            var kolchuga = new Dress(5);
            kn2.dress(sapogi);
            kn2.dress(kolchuga);
            var sword = new Sword(5);
            kn1.change(sword);

            System.out.println(sapogi);
            System.out.println(kolchuga);
            System.out.println();

            kn1.fight(kn2,1);
            System.out.println(sapogi);
            System.out.println(kolchuga);
            System.out.println(kn2);
            System.out.println();

            kn1.fight(kn2,1);
            System.out.println(sapogi);
            System.out.println(kolchuga);
            System.out.println(kn2);
            System.out.println();

            kn1.fight(kn2,1);
            System.out.println(sapogi);
            System.out.println(kolchuga);
            System.out.println(kn2);
            System.out.println();









        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
