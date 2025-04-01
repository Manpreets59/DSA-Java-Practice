package com.stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5);
//        stack.push(35);
//        stack.push(45);
//        stack.push(75);
//        stack.push(70);
//        stack.push(24);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
////        System.out.println(stack.pop());

        CustomStack stack = new DynamicStack(5);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        stack.push(75);
        stack.push(85);
        stack.push(95);
        stack.push(25);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
