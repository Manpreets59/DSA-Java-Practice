package com.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue =  new CustomQueue(5);
//        queue.insert(5);
//        queue.insert(15);
//        queue.insert(25);
//        queue.insert(35);
//        queue.insert(45);
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(15);
        queue.insert(25);
        queue.insert(35);
        queue.insert(45);
        queue.insert(55);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();
    }
}
