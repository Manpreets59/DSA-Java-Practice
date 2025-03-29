import java.util.*;  // Import for Scanner (if needed)

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LeetCode {

    // linked List cycle Questions
    // we use the idea that we have two pointer slow pointer and fast pointer, the slow pointer will move
    // by 1 unit and the fast pointer will move by 2 unit If fast and slow meat each other mean the cycle
    // is present otherwise the cycle is not present.

    // public class Solution {
    //     public boolean hasCycle(ListNode head) {
    //         ListNode fast = head;
    //         ListNode slow = head;
    //
    //         while(fast != null && fast.next != null){
    //             fast = fast.next.next;
    //             slow = slow.next;
    //             if(fast == slow){
    //                 return true;
    //             }
    //         }
    //         return false;
    //     }
    // }


    // LinkedList Cycle Part2
    // if length is zero no cycle exist
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        // If no cycle found, return null
        if (length == 0) {
            return null;
        }

        // Find the start
        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }

        // Keep moving both forward until they meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }

    // Helper function to calculate the length of the cycle
    private int lengthCycle(ListNode slow) {
        ListNode temp = slow;
        int length = 0;

        do {
            temp = temp.next;
            length++;
        } while (temp != slow);

        return length;
    }

    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            findSquare(slow);
            fast = findSquare(2);
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number = number/10;
        }
        return ans;
    }

    // Main function to test the code
    public static void main(String[] args) {
        LeetCode solution = new LeetCode();

        // Creating a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creating a cycle

        // Detect cycle and find the starting node of the cycle
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
