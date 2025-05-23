public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    private Node root;

    public BST(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void insert (int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    public void populate(int[] nums){
        for(int i = 0; i<nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end) /2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
    // complexity nlog(n) as it insert n element and each element take log(n) complexity.

    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root, "root Node: ");
    }

    public void display(Node node, String details){
        if(node == null){
            return ;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Left Right of " + node.value + " : ");
    }
}

// Tree traversals, Inorder, postorder, preorder
//   node, left, right used for evaluation maths expression or making a copy
// Inorder   left, node, right  print node in sorted manner for binary search tree
// postorder left, right, node when delete the binary tree , bottom up calculation .

// BFS & DFS  or BFT & DFT
// .