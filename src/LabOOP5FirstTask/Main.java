package LabOOP5FirstTask;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.push(10);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());


    }
}
