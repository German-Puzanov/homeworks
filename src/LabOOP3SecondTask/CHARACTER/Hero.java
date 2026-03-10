package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ARMOR.Armor;
import LabOOP3SecondTask.ITEM.Item;
import LabOOP3SecondTask.WEAPON.Weapon;

public abstract class Hero implements Player,Healthy,Equipment,Inventory{
    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes;
    protected Item[] items;

    public Hero(String username, int health) {
        this.username = username;
        this.health = health;
    }

    private void loseHealth(int damage){
        this.health -= damage;
    }

    public String getUsername() {
        return username;
    }

    public int damage(int damage){
        return 0;
    }
}
