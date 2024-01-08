package algorithms;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // thêm một code vào cuối danh sách
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // hiển thị các phần tử của danh sách
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // tìm kiếm một phần tử trong danh sách
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    // cập nhật giá trị của một phần tử trong danh sách
    public void update(int oldData, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == oldData) {
                current.data = newData;
                return;
            }
            current = current.next;
        }
    }

    // xóa một phần tử khỏi danh sách
    public void delete(int key) {
        Node current = head;
        Node prev = null;

        // nếu phần tử cần xóa là phần tử đầu tiên
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // tìm phần tử cần xóa và giữ lại liên kết trước nó
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // nếu phần tử không tồn tại
        if (current == null) {
            return;
        }

        // cập nhật lại liên kết
        prev.next = current.next;
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);

        System.out.println("Danh sách liên kết ban đầu:");
        list.display();

        int searchKey = 2;
        System.out.println("Tìm kiếm " + searchKey + ": " + list.search(searchKey));

        int updateOldData = 2;
        int updateNewData = 4;
        list.update(updateOldData, updateNewData);
        System.out.println("Danh sách sau khi cập nhật:");
        list.display();

        int deleteKey = 1;
        list.delete(deleteKey);
        System.out.println("Danh sách sau khi xóa " + deleteKey + ":");
        list.display();

        /**
         * đặc điểm của Singly Linked List
         * 
         * 1. chỉ cần lưu node đầu tiên (head) là có thể truy xuất cả mảng
         * 2. khả năng truy xuất đến một phần tử của mảng là O(n)
         * 3. khả năng thêm và xóa 1 phần tử là O(1)* còn nếu chưa biết thì
         * phải duyệt từ đầu đến cuối thì độ phức tạp là O(n)
         * (*: vị trí đó phải biết trước)
         */
    }
}
