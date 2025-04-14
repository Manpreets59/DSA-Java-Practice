// Self-balancing binary tree and one of those is AVL
// For every Node height(left) - height(right) can be equal to -1,+1,0 and that is called balanced Tree.
// Algorithm
// Insert normally node n
// start from node n and find the node that make the tree unbalanced bottom up
// using one of the four rule , rotate
//   rules .
// Left Rotate it follow property of binary search tree that small are on left of node and greater are on right of node

// Time Complexity
// O(log(n)) as tree is balanced
// time complexity of rotation O(1)
//  complexity = O(log(n)) + O(1) = O(log(n))

class AVL {
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

    public AVL(){

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
        return rotate(node);
    }

    private Node rotate (Node node){
        if(height(node.left) - height(node.right) > 1){
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            // right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                //right-right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right left case
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }

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
