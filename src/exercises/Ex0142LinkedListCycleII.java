package exercises;

public class Ex0142LinkedListCycleII {

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
     * @param currentNode
     * @return -1: dose not create 1 cycle
     *         0: forms a cycle, but not the starting point
     *         1: forms a cycle and coincides with the starting point
     */
    public int checkNode(ListNode currentNode) {
        if (currentNode == null)
            return -1;
        ListNode slow = currentNode;
        ListNode fast = currentNode;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                if (fast == currentNode)
                    return 1;
                return 0;
            }
        }
        return -1;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            int result = checkNode(currentNode);
            if (result == -1)
                return null;
            else if (result == 1)
                return currentNode;
            else
                currentNode = currentNode.next;
        }
        return null;
    }
}
