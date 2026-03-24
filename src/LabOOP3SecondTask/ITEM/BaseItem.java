package LabOOP3SecondTask.ITEM;


public abstract class BaseItem implements Item{
    protected int count;

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
        if (isUsed()){
            return 0;
        } else {
            int value = this.count;
            this.count = 0;
            return value;
        }
    }
    @Override
    public boolean isUsed() {
        return count <= 0;
    }

    @Override
    public String toString(){
        return String.format("[%s], count: [%d], isUsed: [%b]",getClass().getSimpleName(), count, isUsed());
    }
}
