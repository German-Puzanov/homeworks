package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ITEM.Food;
import LabOOP3SecondTask.ITEM.HealthPotion;
import LabOOP3SecondTask.ITEM.Item;
import LabOOP3SecondTask.WEAPON.Sword;
import LabOOP3SecondTask.WEAPON.Weapon;

public class Knight extends Hero {
    private int MAX_STRENGTH = 100;
    private int strength;
    private int strengthLost = 1;
    private int forcePower = 1;

    public Knight(String username, int health, int strength) throws IllegalArgumentException {
        super(username, health);
        if (strength > MAX_STRENGTH) throw new IllegalArgumentException("Error: strength over MAX_VALUE");
        if (strength < 0) throw new IllegalArgumentException("Error: strength bellow zero");
        this.strength = strength;
    }

    @Override
    public String getUserName() {
        return this.username.trim();
    }

    @Override
    public boolean fight(Player player, int distance) {
        int range = 1;
        int baseDamage = 1;
        if (this.weapon != null) {
            range = this.weapon.getDistance();
            baseDamage = (int) (baseDamage * this.weapon.getPower() * this.forcePower);
        }
        if (isDied() || player == null || distance > range || this.strength < 1 || strengthLost > this.strength) {
            return false;
        } else {
            this.strength -= strengthLost;
            player.damage(baseDamage);
            return true;
        }
    }

    @Override
    public boolean change(Weapon sword) {
        if (sword instanceof Sword && !isDied()) {
            this.weapon = sword;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean useItem(int slot) {
        if (slot > ITEM_COUNT || slot < 0) {
            return false;
        }

        if (this.items[slot - 1] != null && !isDied() && !this.items[slot - 1].isUsed()) {
            if (this.items[slot - 1] instanceof Food) {
                if (this.strength + items[slot - 1].use() > MAX_STRENGTH) {
                    this.strength = MAX_STRENGTH;
                }
            } else if ((this.items[slot - 1] instanceof HealthPotion)) {
                recoverHealth(this.items[slot - 1].use());
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String weapon = "";
        StringBuilder items = new StringBuilder();
        String hp;
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
        items = new StringBuilder(items.toString().trim());
        if (this.weapon == null) {
            weapon = "no";
        } else {
            weapon += this.weapon;
        }
        return String.format("[%s]: \"%s\", health:[%s], strength:[%d] weapon:[%s], inventory:[%s]", getClass().getSimpleName(), getUsername(), hp, this.strength, weapon, items.toString());
    }
}
