package exercises;

public class Ex0141LinkedListCircle {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static boolean hasCircle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        int STEP_MAX = 2;
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null) {
            int count = 0;
            while (fast != null) {
                if (slow == fast) {
                    return true;
                }
                fast = fast.next;
                count++;
                if (count == STEP_MAX) {
                    break;
                }
            }
            slow = slow.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
