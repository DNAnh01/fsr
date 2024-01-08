package exercises;

public class Ex0707DesignLinkedList {

    public static class SinglyListNode {
        int val;
        SinglyListNode next;

        public SinglyListNode(int val) {
            this.val = val;
        }
    }

    public static class MyLinkedList {
        private SinglyListNode head;

        public MyLinkedList() {
            this.head = null;
        }

        public int get(int index) {
            SinglyListNode currentNode = head;
            int count = 0;
            while (currentNode != null) {
                if (count == index) {
                    return currentNode.val;
                }
                count++;
                currentNode = currentNode.next;
            }
            return -1;
        }

        public void addAtHead(int val) {
            SinglyListNode newNode = new SinglyListNode(val);
            newNode.next = head;
            head = newNode;

        }

        public void addAtTail(int val) {
            SinglyListNode newNode = new SinglyListNode(val);
            if (head == null) {
                head = newNode;
                return;
            }
            SinglyListNode currentNode = head;
            // determine the last position of the node
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
            } else {
                SinglyListNode currentNode = head;
                SinglyListNode newNode = new SinglyListNode(val);
                int count = 0;

                while (currentNode != null) {
                    if (count == index - 1) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        return;
                    }
                    count++;
                    currentNode = currentNode.next;
                }
                if (count == index) {
                    addAtTail(val);
                }
            }
        }

        public void deleteAtIndex(int index) {
            SinglyListNode currentNode = head;
            SinglyListNode prevNode = null;
            int count = 0;

            while (currentNode != null) {
                if (count == index) {
                    if (index == 0) {
                        head = head.next;
                    } else {
                        prevNode.next = currentNode.next;
                        return;
                    }
                }
                count++;
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        public void display() {
            SinglyListNode current = head;
            System.out.printf("List: ");

            while (current != null) {
                System.out.printf("%d ", current.val);
                current = current.next;
                if (current != null) {
                    System.out.printf("-> ");
                }
            }

        }
    }

    public static void main(String[] args) {
        /**
         * Your MyLinkedList object will be instantiated and called as such:
         * MyLinkedList obj = new MyLinkedList();
         * int param_1 = obj.get(index);
         * obj.addAtHead(val);
         * obj.addAtTail(val);
         * obj.addAtIndex(index,val);
         * obj.deleteAtIndex(index);
         */

        // Explanation
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.display();

        myLinkedList.addAtTail(3);
        myLinkedList.display();

        myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
        myLinkedList.display();

        int result = myLinkedList.get(1); // return 2
        System.out.println("result: " + result);

        myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
        myLinkedList.display();

        myLinkedList.get(1); // return 3
    }
}
