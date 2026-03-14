package LabOOP3SecondTask.ITEM;

public class HealthPotion extends Potions{
    public HealthPotion(int count) throws IllegalArgumentException {
        super(count);
    }

    @Override
    public int use(){
        count -= 1;
        return 10;
    }

}
