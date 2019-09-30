package com.datastructures.stack;

import java.util.EmptyStackException;


public class Stack {

    private int[] elements;

    private int top;

    public Stack(int size) {
        elements = new int[size];
    }

    public int push(int value) {

        if (top == elements.length) {
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[top++] = value;
        return value;
    }

    public int pop() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        int itemToPop = elements[--top];
        if (top == elements.length / 4) {
            int[] newElements = new int[elements.length / 2];
            System.arraycopy(elements, 0, newElements, 0, top + 1);
            elements = newElements;
        }
        return itemToPop;
    }

    public int pick() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        int itemToPick = elements[top-1];
        return itemToPick;
    }

    public void printStack(){

        System.out.println("Capacity of Stack is :" + elements.length);
        if(top == 0){
            System.out.println("Stack is Empty");
        }
        for(int i = 0; i<top;i++){
            System.out.print(elements[i] +" ");
        }
        System.out.println("\n");
    }

}
