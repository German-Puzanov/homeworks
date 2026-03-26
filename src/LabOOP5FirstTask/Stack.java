package LabOOP5FirstTask;

public class Stack implements LIFO{
    Integer[] stackList = new Integer[0];

    @Override
    public void push(Integer num) {
        int stackLength = this.stackList.length;
        Integer[] newStackList = new Integer[stackLength+1];

        System.arraycopy(this.stackList, 0, newStackList, 0, stackLength);
        newStackList[stackLength] = num;
        this.stackList = newStackList;
    }

    @Override
    public Integer pop() {
        int stackLength = this.stackList.length;
        Integer[] newStackList = new Integer[stackLength-1];

        System.arraycopy(this.stackList, 0, newStackList, 0, newStackList.length);
        Integer popNum = this.stackList[stackList.length - 1];
        this.stackList = newStackList;
        return popNum;
    }

    public Integer peek(){
        if(stackList.length == 0){
            return null;
        }
        return this.stackList[stackList.length - 1];
    }
}
