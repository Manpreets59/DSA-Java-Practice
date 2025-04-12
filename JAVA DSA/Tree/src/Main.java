import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Binary tree = new Binary();
        tree.populate(scanner);
//        tree.display();
        tree.preetyDisplay();
    }
}

//why tree?
// insert item in tree, remove item and find item and traverse in tree with O(N) time complexity
// cost-efficient , ordered storage do not need to restructure after adding element
// Where is it used ?
// filesystem , nodes, databases, network routing , Maths, DTs, compression of files , future data structure heap and graph

// Terminologies
// Node : int val, Node left, Node right.

//Properties
// Size = total number of nodes
// child , siblings Edge ,
// height :max number of edges between two nodes and max number of nodes between the leaf node and node fom where we start
// Leaf node
// Level: The difference of height between two node the root node and the height of node
// ancestor , descendant
// degree is no of edges or no of children it can be (0,1,2) 0 in case of leafnode

// Types
// complete binary tree all levels are full and last level full from left ot right
// full / strict binary tree: Each node has either zero children or two children used in compression, segment tree
// perfect binary tree: all the internal node have two children or zero childrean and all leafnode is at same level
// Height balance Binary tree Average height of P(logn)
// Skeded binary tree Every node has only one child
// ordered binary tree every node have some properties  example binary search tree

// properties that help you in some question
// perfect binary tree
//  tree height=h
// total nodes = 2^(h+1) -1
// if height is h then total no of leafnode is 2^h
// all the nodes without leafnode = 2^(h+1) -1 - 2^h = 2^h -1
// if n = number of leavenode then we have log n+1 level atleast
// if we have n number of nodes then the minimum height levels is log n+1

// Strict binary tree
// leafnode = n then inter node except leafnode is n - 1
// no of leafnode = no of internal node +1
// understand by creating tree or through induction proof
// no of leafnode = 1 + no of internal node with two children apart from the root node


// implementation
// Linked representation using pointer and same as linked list
// sequential  using an array -> define the size of the array , not very efficient in terms of defining an array as many node of the node have memory allocated, but we are not using that

// complexity : 1 + 2 + 2^2 + 2^3 + 2^4 + 2^5 + 2^h this of strict binary tree
// N = 2^h
// log n = h log2
// h = (log n ) base 2

// .