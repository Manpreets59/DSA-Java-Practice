import java.util.Scanner;

public class Binary {
    private int value;
    private Node root;

    public void BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;
    }
    public void Node(int value){
        this.value = value;
    }

    // insert elements

    public void populate(Scanner scanner){
        System.out.println("Enter the rootNode value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of  " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of  " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
    }
}
