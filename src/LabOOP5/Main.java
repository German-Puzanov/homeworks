package LabOOP5;

public class Main {
    public static void main(String[] args) {
        StackInt stack = new StackInt();
        System.out.println(stack.peek());
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}
