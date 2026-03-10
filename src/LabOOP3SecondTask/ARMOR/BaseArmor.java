package LabOOP3SecondTask.ARMOR;

public abstract class BaseArmor implements Armor {
    protected int durability;

    public BaseArmor(int durability) throws IllegalArgumentException {
        if (durability < MIN_VALUE) {
            throw new IllegalArgumentException("Error: Durability below MIN_VALUE");
        }
        if (durability > MAX_VALUE) {
            throw new IllegalArgumentException("Error: Durability over MIN_VALUE");
        }
        this.durability = durability;
    }

    @Override
    public boolean isBroken() {
        return durability == 0;
    }

    @Override
    public int protect(int damage) {
        if (this.durability - damage < 0) {
            this.durability = 0;
        } else {
            this.durability -= damage;
        }
        return this.durability;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("[%d]: [%S], durability: [%d], isBroken: [%b]",getPosition(),getClass().getSimpleName(),durability,isBroken());
    }

}
