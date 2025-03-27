public class LeetCode {
    public static void main(String[] args) {

    }

    // linked List cycle Questions
    // we use the idea that we have two pointer slow pointer and fast pointer, the slow pointer will move
    // by 1 unit and the fast pointer will move by 2 unit If fast and slow meat each other mean teh cycle
    // is present otherwise teh cycle is not present.

//    public class Solution {
//        public boolean hasCycle(ListNode head) {
//            ListNode fast = head;
//            ListNode slow = head;
//
//            while(fast != null && fast.next != null){
//                fast = fast.next.next;
//                slow = slow.next;
//                if(fast == slow){
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
}
