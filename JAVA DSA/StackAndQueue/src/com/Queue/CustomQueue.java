package com.Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;// pointer is at last index
    }

    public boolean isEmpty(){
        return end == 0; // pointer is at -1 index no element exist
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int removed  = data[0];
        //Shift the elements to left here
        for(int i = 1; i<end;i++){
            data[i-1] = data[i];
            end--;
        }
        return removed;
    }


}
