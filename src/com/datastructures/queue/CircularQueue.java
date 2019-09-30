package com.datastructures.queue;

public class CircularQueue {

    private int[] elements;
    private int front;
    private int back;

    public CircularQueue(int size){
        elements = new int[size];
    }

    public int getSize(){
        if(front < back){
            return (elements.length-back)+front;
        }else{
            return Math.abs(front-back);
        }

    }

    public int enqueue(int value){
        int size = getSize();
        if(size == elements.length){
            int[] newElements = new int[elements.length*2];
            if(front < back){
                System.arraycopy(elements,back,newElements,0,elements.length-back);
                System.arraycopy(elements,0, newElements,elements.length-back,front);
            }else {
                System.arraycopy(elements,back,newElements,0,front);
            }
            elements = newElements;
        }
        if(front == elements.length && size < elements.length-1){
            front = 0;
        }
        elements[front++] = value;
        return value;
    }

    public int dequeue(){
        if (getSize() == 0 && elements[front] == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int elementTodeQueue = elements[back];
        elements[back] = 0;
        if(front <= back){
            if(back == elements.length-1){
                back = 0;
            }else{
                back++;
            }
        }else{
            back++;
        }
        int size = getSize();
        if(size == elements.length/4){
            int[] newElements = new int[elements.length/2];
            if(front < back){
                System.arraycopy(elements,back,newElements,0,elements.length-back);
                System.arraycopy(elements,0,
                        newElements,elements.length-back,front);
                front  = ((elements.length-back)+front+1)/2;
                back = 0;
            }else {
                System.arraycopy(elements,back,newElements,0,front-back);
                front = ((front-back)+1)/2;
                back = 0;
            }
            elements = newElements;
        }
        return elementTodeQueue;
    }

    public void printQueue(){
        System.out.println("Size of the Queue is :" + elements.length);
        if(front <= back){
            for(int i = back;i < elements.length;i++){
                System.out.print(elements[i]+" ");
            }
            for(int i = 0;i < front;i++){
                System.out.print(elements[i]+" ");
            }
        }else{
            for(int i = back;i < front;i++){
                System.out.print(elements[i]+" ");
            }
        }
        System.out.print("\n");

    }


}
