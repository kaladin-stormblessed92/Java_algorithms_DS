package com.datastructures.stack;

public class Main {


    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.push(6);
        System.out.println( "Picked element : "+ stack.pick());
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
    }
}
