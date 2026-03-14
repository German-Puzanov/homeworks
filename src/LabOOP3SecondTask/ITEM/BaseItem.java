package LabOOP3SecondTask.ITEM;


public abstract class BaseItem implements Item{
    protected int count;
    boolean isItemUsed = false;

    public BaseItem(int count) throws IllegalArgumentException{
        if (count < MIN_VALUE) {
            throw new IllegalArgumentException("Error: Count below MIN_VALUE");
        }
        if (count > MAX_VALUE) {
            throw new IllegalArgumentException("Error: Count over MAX_VALUE");
        }
        this.count = count;
    }

    @Override
    public int use() {
        return 0;
    }
    @Override
    public boolean isUsed() {
        return count == 0;
    }

    @Override
    public String toString(){
        return String.format("[%s], count: [%d], isUsed: [%b]",getClass().getSimpleName(), count, isUsed());
    }
}
