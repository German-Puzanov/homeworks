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
        if (username == null || username.isBlank()){
            throw new IllegalArgumentException("Error: Invalid username");
        }
        if (health > MAX_HEALTH || health < 1){
            throw new IllegalArgumentException("Error: Invalid player's health");
        }
        this.username = username;
        this.health = health;
    }

    private void loseHealth(int lostHealth){
        this.health -= lostHealth;
    }

    public String getUsername() {
        return username;
    }

    public int damage(int damage) throws IllegalArgumentException{
        if (damage < 0) throw new IllegalArgumentException("Error: Negative damage");
        return 0;

    }

    public boolean isDied(){
        return this.health <= 0;
    }

    public void recoverHealth(int addedHealth){
        this.health += addedHealth;
        if (this.health > MAX_HEALTH) this.health = MAX_HEALTH;
    }

    public void dress(Armor armor){
        if (!isDied()){
            this.clothes[armor.getPosition()] = armor;
        }
    }

    public boolean putInto(Item item, int num){
        return this.items[num] == item;
    }

    public boolean fight(Player player, int distance){
        return false;
    }

    public boolean change(Weapon changeWeapon){
        return this.weapon == changeWeapon;
    }

    public boolean useItem(int count){
        return this.items[count].isUsed();
    }

}
