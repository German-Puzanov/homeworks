package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ITEM.Item;
import LabOOP3SecondTask.WEAPON.Sword;

public class Knight extends Hero {
    private int MAX_STRENGTH = 100;
    private int strength;
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
        if (isDied() || player == null || distance > range || this.strength < 1) {
            return false;
        } else {
            this.strength -= 1;
            player.damage(baseDamage);
            return true;
        }
    }

    @Override
    public boolean change(Sword sword) {
        if (isDied() || sword == null) {
            return false;
        } else {
            this.weapon = sword;
            return true;
        }
    }

    @Override
    public boolean useItem(int slot) {
        if (slot > ITEM_COUNT || slot < 0) return false;

        if (this.items[slot] != null && !isDied() && !this.items[slot].isUsed()) {
            if (this.items[slot].getClass().getSimpleName().equals("Food"))
                this.strength += this.items[slot].use();
                if (this.strength > MAX_STRENGTH) {
                    this.strength = MAX_STRENGTH;
                }
            else if ((this.items[slot].getClass().getSimpleName().equals("HealthPotion"))) {
                this.health += this.items[slot].use();
            }
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

        return String.format("[%s]: \"%s\", health:[%s], strength:[%d] weapon:[%s], inventory:[%s]", getClass().getSimpleName(), getUsername(), hp, this.strength, weapon, items);
    }
}
