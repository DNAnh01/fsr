package algorithms;

import java.util.ArrayList;

public class DesignAHashMap {
    /**
     * problem:
     * + enter n number x, after entering, print out a list of x numbers and their
     * corresponding number of occurrences (0<=x<=10^9)
     */

    /**
     * HashMap Operation:
     * + hashFunction(int key): convert from key to hash value
     * + put(int key, int value): add a key-value pair to the Map
     * + remove(int key): remove 1 key in Set
     * + get(int key): return the value of element has key in the Map
     * 
     */

    /**
     * Data
     */
    private class Data {
        private int key;
        private int value;

        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Data [key=" + key + ", value=" + value + "]";
        }

        // hai object phân biệt với nhau bởi key
        @Override
        public boolean equals(Object other) {
            if (other instanceof Data) {
                return this.key == ((Data) other).key;
            }
            return false;
        }

    }

    /**
     * MyHashMap
     */
    public class MyHashMap {
        private final int SIZE = 1000;
        private ArrayList<Data>[] myBuckets;

        public MyHashMap() {
            for (int i = 0; i < myBuckets.length; i++) {
                myBuckets[i] = new ArrayList<Data>();
                this.myBuckets = new ArrayList[SIZE];
            }
        }

        private int hashFunction(int key) {
            return key % SIZE;
        }

        private void put(int key, int value) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Data> bucket = myBuckets[hashValueIndex];
            Data newData = new Data(key, value);
            int keyIndex = bucket.indexOf(newData);

            if (keyIndex >= 0) {
                bucket.get(keyIndex).value = value;
            } else {
                bucket.add(newData);
            }

        }

        private void remove(int key) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Data> bucket = myBuckets[hashValueIndex];
            int keyIndex = bucket.indexOf(new Data(key, 0));
            if (keyIndex >= 0) {
                bucket.remove(keyIndex);
            }
        }

        private int get(int key) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Data> bucket = myBuckets[hashValueIndex];
            Data findData = new Data(key, 0);
            int keyIndex = bucket.indexOf(findData);
            if (keyIndex >= 0) {
                return bucket.get(keyIndex).value;
            }
            return -1;
        }

        private void display() {
            for (ArrayList<Data> bucket : myBuckets) {
                for (Data data : bucket) {
                    System.out.println(data.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        DesignAHashMap designAHashMap = new DesignAHashMap();
        DesignAHashMap.MyHashMap hashMap = designAHashMap.new MyHashMap();

        hashMap.put(1, 1);
        hashMap.put(1, 2);
        hashMap.put(3, 3);
        hashMap.put(2, 0);

        hashMap.display();
        hashMap.remove(2);
        System.out.println("--------");
        hashMap.display();
        int key = 2;
        System.out.println("get element in hashmap with key = " + key + ": " + hashMap.get(key));
    }
}
