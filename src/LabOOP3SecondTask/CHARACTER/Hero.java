package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ARMOR.Armor;
import LabOOP3SecondTask.ITEM.Item;
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

    public String getUserName() {
        return this.username.trim();
    }

    public int damage(int damage) throws IllegalArgumentException {
        for (Armor armor : this.clothes) {
            if (armor == null || armor.isBroken()) continue;
            damage = armor.protect(damage);
            if (damage == 0) return 0;
        }
        loseHealth(damage);
        return damage;
    }

    public boolean isDied() {
        return this.health <= 0;
    }

    public void recoverHealth(int addedHealth) {
        if (!isDied() && addedHealth > 0) {
            if (this.health + addedHealth > MAX_HEALTH) {
                this.health = MAX_HEALTH;
            } else {
                this.health += addedHealth;
            }
        }
    }

    public void dress(Armor armor) {
        if (!isDied() && armor != null) {
            if (armor.getPosition() >= 0 && armor.getPosition() <= 3){
                this.clothes[armor.getPosition() - 1] = armor;
            }
        }
    }

    public boolean putInto(Item item, int slot) {
        if (isDied() || item == null || slot > ITEM_COUNT || slot < 0) {
            return false;
        } else {
            this.items[slot - 1] = item;
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
        if (slot > 0 && slot <= ITEM_COUNT && items[slot - 1] != null && !isDied() && !items[slot - 1].isUsed()) {
            items[slot - 1].use();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String weapon = "";
        StringBuilder items = new StringBuilder();
        String hp;
        StringBuilder armors = new StringBuilder();
        String[] armorList = new String[]{"BOOTS", "DRESS", "HELMET"};
        if (isDied()) {
            hp = "DEAD";
        } else {
            hp = String.format("%d", this.health);
        }

        for (Item item : this.items) {
            if (item == null) {
                items.append("no ");
            } else {
                items.append(item).append(" ");
            }
        }
        int count = 1;
        for (Armor armor : this.clothes) {
            if (armor == null) {
                armors.append(String.format("[%d]: [%s], no\n", count, armorList[count-1]));
            } else {
                armors.append(String.format("%s\n", armor));
            }
            count++;
        }

        items = new StringBuilder(items.toString().trim());
        if (this.weapon == null) {
            weapon = "no";
        } else {
            weapon += this.weapon;
        }
        return String.format("[%s]: %s, health:[%s] weapon:[%s], inventory:[%s]\n%s", getClass().getSimpleName(), getUserName(), hp, weapon, items, armors);
    }
}
