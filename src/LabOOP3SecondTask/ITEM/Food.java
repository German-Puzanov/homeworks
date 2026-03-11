package LabOOP3SecondTask.ITEM;

public class Food extends BaseItem {
    public Food(int count) throws IllegalArgumentException {
        super(count);
    }

    @Override
    public int use() {
        this.isItemUsed = true;
        return 5;
    }

}
