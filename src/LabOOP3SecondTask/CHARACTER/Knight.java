package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ITEM.Food;
import LabOOP3SecondTask.ITEM.HealthPotion;
import LabOOP3SecondTask.WEAPON.Sword;
import LabOOP3SecondTask.WEAPON.Weapon;

public class Knight extends Hero {
    private static final int MAX_STRENGTH = 100;
    private int strength;
    private static final int strengthLost = 1;
    private static final int forcePower = 1;

    public Knight(String username, int health, int strength) throws IllegalArgumentException {
        super(username, health);
        if (strength > MAX_STRENGTH) throw new IllegalArgumentException("Error: strength over MAX_VALUE");
        if (strength <= 0) throw new IllegalArgumentException("Error: strength bellow zero");
        this.strength = strength;
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
                int foodValue = items[slot - 1].use();
                if (this.strength + foodValue > MAX_STRENGTH) {
                    this.strength = MAX_STRENGTH;
                } else {
                    this.strength += foodValue;
                }
                return true;
            } else if ((this.items[slot - 1] instanceof HealthPotion)) {
                recoverHealth(this.items[slot - 1].use());
                return true;
            }
        }
        return false;
    }
}
