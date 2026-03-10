package LabOOP3SecondTask.CHARACTER;

import LabOOP3SecondTask.ITEM.Item;

public interface Inventory {
    int ITEM_COUNT = 5;

    boolean putInto(Item item,int num);
    boolean useItem(int num);
}
