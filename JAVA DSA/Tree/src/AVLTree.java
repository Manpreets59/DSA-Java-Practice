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

public class AVLTree {
}
