//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//
//public class ReverseLinkedListReverser {
//    public ListNode reverseList(ListNode current) {
//        // Base case: empty list or single node
//        if (current == null || current.next == null) {
//            return current;
//        }
//
//        // Recursive step: reverse the rest of the list
//        ListNode reversedHead = reverseList(current.next);
//
//        // Fix the current node's pointer
//        current.next.next = current;
//        current.next = null;
//
//        return reversedHead;
//    }
//}
