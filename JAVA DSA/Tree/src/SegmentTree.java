// https://www.hackerearth.com/practice/data-structures/advanced-data-structures/segment-trees/tutorial/
// Performing query on a range sum,max, avg, min , prod, etc. of number in specific range then we use segment tree as it perform operation in O(logN) time
// for update the complexity is same as O(logN)
// Segment tree is a binary tree which has info about interval and operation we are performing
// It is full binary tree as every node except root node has two children.

// Cases
// 1> Node Interval is inside the query interval then return the value
// 2> Node interval is completely outside the query interval (node start index) > (query end index) or (node end index) < (query start index) return the default value of the query . In this case =0
// 3> OverLapping :

// How to update in O(logN) Time
// check index lies in interval
// if yes, then check child nodes if child range is out , no change in val , just return
// in the end, you will reach the leaf update leaf as recursion will update the leaf.

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -1, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();

        tree.display();
        System.out.println("Query [0, 2] = " + tree.query(0, 2));

        tree.update(2, 10); // Updating index 2 (was 6) to 10
        System.out.println("After update:");
        tree.display();
        System.out.println("Query [0, 2] = " + tree.query(0, 2));
    }

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str += "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data:" + node.left.data + " => ";
        } else {
            str += "No left child => ";
        }

        str += "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data:" + node.data + " => ";

        if (node.right != null) {
            str += "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data:" + node.right.data;
        } else {
            str += "No right child";
        }

        System.out.println(str);

        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    // QUERY
    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        } else if (node.endInterval < qsi || node.startInterval > qei) {
            return 0;
        } else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }

    // UPDATE
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index < node.startInterval || index > node.endInterval) {
            return node.data; // index out of this node's range
        }

        if (node.startInterval == node.endInterval) {
            node.data = value;
            return node.data;
        }

        int leftAns = update(node.left, index, value);
        int rightAns = update(node.right, index, value);

        node.data = leftAns + rightAns;
        return node.data;
    }
}
