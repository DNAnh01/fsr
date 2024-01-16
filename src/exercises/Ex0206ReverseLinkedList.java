package exercises;

public class Ex0206ReverseLinkedList {
    /**
     * tính chất đệ quy trong linked list là một node luôn trỏ vào 1 node
     * khác
     * 
     */

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static ListNode reverseList(ListNode head) {

        // basic problem
        if (head == null) {
            return null;
        }

        ListNode nextNode = head.next;
        if (nextNode == null) {
            return head;
        }

        // general problem
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLinkedList(n1);
        reverseList(n1);
        printLinkedList(n5);
    }
}
