package exercises;

// you can build using array or linked list
public class Ex0622DesignCircularQueue {

    public static class MyCircularQueue {
        int[] array;
        int SIZE;
        int headIndex;
        int tailIndex;
        int count; // current numbers of elements

        public MyCircularQueue(int k) {
            SIZE = k;
            array = new int[SIZE];
            headIndex = tailIndex = -1;
            count = 0;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            tailIndex++;
            if (tailIndex == SIZE) {
                tailIndex = 0;
            }
            if (isEmpty()) {
                headIndex = tailIndex;
            }
            array[tailIndex] = value;
            count++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            headIndex++;
            if (headIndex == SIZE) {
                headIndex = 0;
            }
            count--;
            return true;
        }

        public int Front() {
            return isEmpty() ? -1 : array[headIndex];
        }

        public int Rear() {
            return isEmpty() ? -1 : array[tailIndex];
        }

        public boolean isEmpty() {
            return count <= 0;
        }

        public boolean isFull() {
            return count >= SIZE;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1)); // return True
        System.out.println(myCircularQueue.enQueue(2)); // return True
        System.out.println(myCircularQueue.enQueue(3)); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return False
        System.out.println(myCircularQueue.Rear()); // return 3
        System.out.println(myCircularQueue.isFull()); // return True
        System.out.println(myCircularQueue.deQueue()); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return True
        System.out.println(myCircularQueue.Rear()); // return 4
    }
}
