package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class DesignAHashSet {

    /**
     * problem:
     * + enter n number x, at each operation, check to see if number x is correct
     * appeared before or not (0<=x<=10^9)
     */

    /**
     * HashSet Operation:
     * + hashFunction(int key): convert from key to hash value
     * + add(int key): add 1 key to Set
     * + remove(int key): remove 1 key in Set
     * + contains(int key): check to see if there is that key in Set or not
     */

    /**
     * MyHashSet
     */
    public class MyHashSet {
        private static final int SIZE = 1000;
        private ArrayList<Integer>[] myBuckets;

        @SuppressWarnings("unchecked")
        public MyHashSet() {
            myBuckets = new ArrayList[SIZE];
            for (int i = 0; i < myBuckets.length; i++) {
                myBuckets[i] = new ArrayList<>();
            }
        }

        /**
         * 
         * @param key
         * @return hash value is the index of the bucket
         */
        private int hashFunction(int key) {
            return key % SIZE;
        }

        private boolean add(int key) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Integer> bucket = myBuckets[hashValueIndex];
            int keyIndex = bucket.indexOf(key);
            // when the index key exited in the set, do not add it
            if (keyIndex < 0) {
                bucket.add(key);
                return true;
            }
            return false;
        }

        private boolean remove(int key) {
            // convert from key to hash value
            int hashValueIndex = hashFunction(key);
            ArrayList<Integer> bucket = myBuckets[hashValueIndex];
            int keyIndex = bucket.indexOf(key);

            // key is a value
            // key index is the index in the bucket

            if (keyIndex >= 0) {
                bucket.remove(keyIndex);
                return true;
            }
            return false;
        }

        private boolean contains(int key) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Integer> bucket = myBuckets[hashValueIndex];
            int keyIndex = bucket.indexOf(key);
            if (keyIndex >= 0) {
                return true;
            }
            return false;
        }

        private void display() {
            for (ArrayList<Integer> bucket : myBuckets) {
                for (Integer key : bucket) {
                    System.out.println("key: " + key);
                }
            }
        }

    }

    public static void main(String[] args) {
        DesignAHashSet designAHashSet = new DesignAHashSet();
        DesignAHashSet.MyHashSet hashSet = designAHashSet.new MyHashSet();

        hashSet.display();

        try (Scanner ip = new Scanner(System.in)) {

            while (true) {
                int number = Integer.parseInt(ip.nextLine());
                boolean result = hashSet.add(number);
                StringBuilder message = new StringBuilder();

                if (result) {
                    message.append("Successfully added key to Set");
                    System.out.println(message.toString());
                } else {
                    message.append("Adding key to Set failed");
                    System.out.println(message.toString());
                }

                hashSet.display();
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

}
