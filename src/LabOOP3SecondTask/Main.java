package LabOOP3SecondTask;

import LabOOP3SecondTask.ARMOR.Boots;
import LabOOP3SecondTask.ARMOR.Dress;
import LabOOP3SecondTask.ARMOR.Helmet;
import LabOOP3SecondTask.WEAPON.Sword;

public class Main {
    public static void main(String[] args) {
        try {
            var boots = new Boots(10);
            var helmet = new Helmet(10);
            var dress = new Dress(10);
            var sword = new Sword(1);

            boots.protect(1);
            dress.protect(11);
            helmet.protect(9);

            System.out.println(boots);
            System.out.println(dress);
            System.out.println(helmet);
            System.out.println(sword);

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
