package LabOOP3SecondTask.ITEM;

public abstract class BaseItem implements Item{
    protected int count;

    public BaseItem(int count) throws IllegalArgumentException{
        if (count < MIN_VALUE) {
            throw new IllegalArgumentException("Error: Power below MIN_VALUE");
        }
        if (count > MAX_VALUE) {
            throw new IllegalArgumentException("Error: Power over MAX_VALUE");
        }
        this.count = count;
    }

    @Override
    public int use() {
        return 0;
    }

    @Override
    public boolean isUsed() {
        return false;
    }
}
