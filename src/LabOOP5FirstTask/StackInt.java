package LabOOP5FirstTask;

public class StackInt implements LIFO {
    Integer[] stackList = new Integer[0];

    @Override
    public void push(Integer num) {
        int stackLength = this.stackList.length;
        Integer[] newStackList = new Integer[stackLength + 1];
        for (int n = 0; n < stackList.length; n++) {
            newStackList[n] = stackList[n];
        }
        newStackList[stackLength] = num;
        this.stackList = newStackList;
    }

    @Override
    public Integer pop() {
        int stackLength = this.stackList.length;
        if (stackLength == 0) return null;

        Integer[] newStackList = new Integer[stackLength - 1];
        for (int n = 0; n < newStackList.length; n++) {
            newStackList[n] = stackList[n];
        }
        Integer popNum = this.stackList[stackList.length - 1];
        this.stackList = newStackList;
        return popNum;
    }

    public Integer peek() {
        if (this.stackList.length == 0) {
            return null;
        }
        return this.stackList[stackList.length - 1];
    }
}
