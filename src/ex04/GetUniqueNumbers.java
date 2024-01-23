package ex04;

import java.util.ArrayList;
import java.util.Arrays;

public class GetUniqueNumbers {

    /**
     * - Bài 4 (20đ): Cho mảng A gồm n phần tử (2 < n < 20). Ak = [0, 100]
     * Viết hàm liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong mảng. Kết
     * quả
     * trả về được sắp xếp tăng dần.
     * - Input: 3, 15, 21, 0, 15, 17, 21
     * - Output: 0, 3, 17
     * - Method signature: int[] getUniqueNumbers(....)
     * 
     */

    private class Data {
        private int key;
        private int val;

        public Data(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Data [key=" + key + ", val=" + val + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Data) {
                Data other = (Data) obj;
                return this.key == other.key;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return (this.key + "").hashCode();
        }

    }

    private class MyHashMap {
        private final int SIZE = 100;
        private ArrayList<Data>[] myBuckets;

        MyHashMap() {
            this.myBuckets = new ArrayList[SIZE];
            for (int i = 0; i < this.myBuckets.length; i++) {
                myBuckets[i] = new ArrayList<Data>();
            }
        }

        private int hashFunction(int key) {
            return key % 10;
        }

        private boolean put(int key, int value) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Data> bucket = myBuckets[hashValueIndex];
            Data newData = new Data(key, value);
            int keyIndex = bucket.indexOf(newData);

            boolean result = false;
            if (keyIndex >= 0) {
                bucket.get(keyIndex).val = value;
                result = true;
            } else {
                bucket.add(newData);
                result = true;
            }
            return result;
        }

        private boolean remove(int key) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Data> bucket = myBuckets[hashValueIndex];
            Data foundData = new Data(key, 0);
            int keyIndex = bucket.indexOf(foundData);
            if (keyIndex >= 0) {
                return bucket.remove(foundData);
            }
            return false;
        }

        private int get(int key) {
            int hashValueIndex = hashFunction(key);
            ArrayList<Data> bucket = myBuckets[hashValueIndex];
            Data foundData = new Data(key, 0);
            int keyIndex = bucket.indexOf(foundData);
            if (keyIndex >= 0) {
                return bucket.get(keyIndex).val;
            }
            return -1;
        }

        private void display() {
            for (ArrayList<Data> bucket : myBuckets) {
                for (Data data : bucket) {
                    System.out.println(data);
                }
            }
        }

    }

    private static int[] getUniqueNumbers(int[] nums) {
        GetUniqueNumbers getUniqueNumbers = new GetUniqueNumbers();
        GetUniqueNumbers.MyHashMap hashMap = getUniqueNumbers.new MyHashMap();
        for (int i : nums) {
            if (hashMap.get(i) == -1) {
                hashMap.put(i, 1);
            } else {
                hashMap.put(i, hashMap.get(i) + 1);
            }

        }
        hashMap.display();

        int[] result = new int[hashMap.SIZE];
        int count = 0;
        for (ArrayList<Data> bucket : hashMap.myBuckets) {
            for (Data num : bucket) {
                if (num.getVal() == 1) {
                    result[count++] = num.getKey();
                }
            }
        }
        result = Arrays.copyOfRange(result, 0, count);
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 15, 21, 0, 15, 17, 21 };
        System.out.println(Arrays.toString(getUniqueNumbers(nums)));
        ;
    }
}
