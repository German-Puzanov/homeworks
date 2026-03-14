package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ARMOR.Armor;
import LabOOP3SecondTask.ITEM.Food;
import LabOOP3SecondTask.ITEM.Item;
import LabOOP3SecondTask.WEAPON.Sword;
import LabOOP3SecondTask.WEAPON.Weapon;

public abstract class Hero implements Player, Healthy, Equipment, Inventory {
    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes = new Armor[CLOTHES_COUNT];
    protected Item[] items = new Item[ITEM_COUNT];

    public Hero(String username, int health) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Error: Invalid username");
        }
        if (health > MAX_HEALTH || health < 1) {
            throw new IllegalArgumentException("Error: Invalid player's health");
        }
        this.username = username;
        this.health = health;
    }

    private void loseHealth(int lostHealth) {
        this.health -= lostHealth;
    }

    public String getUsername() {
        return this.username.trim();
    }

    public int damage(int damage) throws IllegalArgumentException {
        for (Armor armor : this.clothes) {
            if (armor == null || armor.isBroken()) continue;
            if (armor.protect(damage) > 0) {
                damage -= armor.protect(damage);
            } else {
                return 0;
            }
        }
        loseHealth(damage);
        return damage;
    }

    public boolean isDied() {
        return this.health <= 0;
    }

    public void recoverHealth(int addedHealth) {
        if (!isDied()) {
            if (addedHealth > MAX_HEALTH) {
                this.health = MAX_HEALTH;
            } else {
                this.health += addedHealth;
            }
        }
    }

    public void dress(Armor armor) {
        if (!isDied() || armor != null) {
            this.clothes[armor.getPosition() - 1] = armor;
        }
    }

    public boolean putInto(Item item, int slot) {
        if (isDied() || item == null) {
            return false;
        } else {
            this.items[slot] = item;
            return true;
        }
    }

    public boolean fight(Player player, int distance) {
        int range = 1;
        int baseDamage = 1;
        if (this.weapon != null) {
            range = weapon.getDistance();
            baseDamage = (int) (baseDamage * weapon.getPower());
        }
        if (isDied() || player == null || distance > range) {
            return false;
        } else {
            player.damage(baseDamage);
            return true;
        }
    }

    public boolean change(Weapon changeWeapon) {
        if (isDied() || changeWeapon == null) {
            return false;
        } else {
            this.weapon = changeWeapon;
            return true;
        }
    }

    public boolean useItem(int slot) {
        if (items[slot] != null && !isDied() && !items[slot].isUsed()) {
            items[slot].use();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String weapon = "";
        String items = "";
        String hp;
        if (isDied()) {
            hp = "DEAD";
        } else {
            hp = String.format("%d", this.health);
        }

        for (Item item : this.items) {
            if (item == null) {
                items += "no ";
            } else {
                items += item + " ";
            }
        }
        items = items.trim();
        if (this.weapon == null) {
            weapon = "no";
        } else {
            weapon += this.weapon;
        }

        return String.format("[%s]: %s, health:[%s] weapon:[%s], inventory:[%s]", getClass().getSimpleName(), getUsername(), hp, weapon, items);
    }

    public abstract boolean change(Sword sword);
}
