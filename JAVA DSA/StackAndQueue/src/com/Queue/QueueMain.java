package com.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue =  new CustomQueue(5);
        queue.insert(5);
        queue.insert(15);
        queue.insert(25);
        queue.insert(35);
        queue.insert(45);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
