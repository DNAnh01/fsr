package exercises;

// you can build using array or linked list
public class Ex0020ValidParentheses {
    /**
     * MyStack
     */
    static class MyStack {
        /**
         * Node
         */
        public class Node {
            Node next;
            char val;

            Node(char v) {
                next = null;
                val = v;
            }
        }

        Node topNode;

        MyStack() {
            topNode = null;
        }

        public void display() {
            Node currentNode = topNode;
            while (currentNode != null) {
                System.out.println(currentNode.val);
                currentNode = currentNode.next;
            }
        }

        public void push(char value) {
            Node newNode = new Node(value);
            if (!isEmpty())
                newNode.next = topNode;
            topNode = newNode;
        }

        public char pop() {
            char value = topNode.val;
            topNode = topNode.next;
            return value;
        }

        public boolean isEmpty() {
            return topNode == null;
        }
    }

    public static boolean isValid(String s) {
        MyStack stack = new MyStack();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);

            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char prevChar = stack.pop();
                if ((prevChar == '(' && currentChar == ')')
                        || (prevChar == '[' && currentChar == ']')
                        || (prevChar == '{' && currentChar == '}')) {
                    // oke
                    // System.out.println("prevChar: " + prevChar);
                    // System.out.println("currentChar: " + currentChar);
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{()}{}";
        System.out.println(isValid(s));
    }
}
