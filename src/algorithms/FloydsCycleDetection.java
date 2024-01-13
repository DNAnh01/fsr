package algorithms;

/**
 * determines the starting pointer of a circle in the data structure singly
 * linked list
 */
public class FloydsCycleDetection {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 
     * @param head
     * @return the cycle starting point
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                // created one cycle
                isCycle = true;
                break;
            }
        }
        if (isCycle) {
            fast = head;
            while (slow != null && fast != null && fast.next != null) {
                if (fast == slow) {
                    return fast;
                }
                fast = fast.next;
                slow = slow.next;
            }
        }
        return null;
    }
}
