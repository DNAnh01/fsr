package algorithms;

import java.util.Arrays;

public class Sorting {

    private static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    /**
     * 1. bubble sort: sắp xếp nổi bọt
     * nguyên lý:
     * + chạy từ đầu đến cuối mảng.
     * + nếu phần tử đứng trước lớn hơn phần tử đứng sau thì đổi chỗ.
     * + sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới.
     */
    private static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                // xét hai phần tử j và j+1, do j+1 < n
                // và sau mỗi một vòng lặp thứ i thì ta lại giảm đi 1 phần tử do đó
                // j+1 < n-i => j < n - i - 1
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            if (isSorted) {
                break;
            }
            printArray(i, a);
        }
    }

    /**
     * 2. insertion sort: sắp xếp chèn
     * nguyên lý:
     * + chạy từ đầu đến cuối mảng.
     * + tại vòng lặp i, coi như dãy từ [0,i-1] (bên trái) đã được sắp
     * xếp, chèn phần tử a[i] vào vị trí thích hợp.
     * + sau vòng lặp thứ i thì dãy [0,i] đã được sắp xếp.
     */
    private static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // chèn a[i] vào dãy từ [0,i-1]
            int currentElement = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > currentElement) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = currentElement;
            printArray(i, a);
        }
    }

    /**
     * 3. selection sort: sắp xếp chọn
     * nguyên lý:
     * + chạy từ đầu đến cuối mảng.
     * + tại vòng lặp thứ i, tìm phần tử nhỏ nhất từ [i+1, n-1], nếu nhỏ
     * hơn a[i] thì đổi chỗ cho a[i].
     * + sau vòng lặp thứ i, thì dãy [0, i] đã được sắp xếp.
     */

    private static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(i, a);
        }
    }

    /**
     * 4. Merge sort: sắp xếp trộn
     * nguyên lý:
     * + chia ra
     * > chia ra đến khi mỗi mảng con chỉ gồm một phần tử, rồi bắt đầu
     * gộp lại
     * + trộn vào
     * 
     */

    private static int[] mergeSort(int[] array) {
        return merge(array, 0, array.length - 1);
    }

    private static int[] merge(int[] array, int left, int right) {
        if (left == right) {
            int[] singleElementArray = { array[left] };
            return singleElementArray;
        }

        int middle = (left + right) / 2;

        int[] leftSubarray = merge(array, left, middle);
        int[] rightSubarray = merge(array, middle + 1, right);

        int mergedSize = leftSubarray.length + rightSubarray.length;

        int[] mergedResult = new int[mergedSize];

        int mergedIndex = 0, leftIndex = 0, rightIndex = 0;

        while (mergedIndex < mergedSize) {
            if (leftIndex < leftSubarray.length && rightIndex < rightSubarray.length) {
                if (leftSubarray[leftIndex] < rightSubarray[rightIndex]) {
                    mergedResult[mergedIndex] = leftSubarray[leftIndex];
                    mergedIndex++;
                    leftIndex++;
                } else {
                    mergedResult[mergedIndex] = rightSubarray[rightIndex];
                    mergedIndex++;
                    rightIndex++;
                }
            } else {
                /**
                 * Nếu một trong hai mảng con đã được xử lý hết, nhưng mảng kia còn phần tử chưa
                 * được xử lý, chương trình sẽ chọn phần tử từ mảng còn lại và đặt vào mảng kết
                 * quả.
                 */
                if (leftIndex < leftSubarray.length) {
                    mergedResult[mergedIndex] = leftSubarray[leftIndex];
                    mergedIndex++;
                    leftIndex++;
                } else if (rightIndex < rightSubarray.length) {
                    mergedResult[mergedIndex] = rightSubarray[rightIndex];
                    mergedIndex++;
                    rightIndex++;
                }
            }
        }

        return mergedResult;
    }

    /**
     * 5. Quick Sort: Sắp xếp nhanh
     * nguyên lý:
     * 
     * + chọn một phần tử bất kỳ trong mảng để làm khóa, thông thường sẽ
     * chọn phần tử ở giữa mảng
     * 
     * + phân bố lại mảng theo khóa (1 phần nhỏ hơn khóa và một phần lớn
     * hơn khóa)
     * 
     * + chia mảng ra theo hai phân bố
     * 
     * + lặp lại các bước trên cho từng mảng con
     * 
     */

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        // B1: chọn khóa
        int key = array[(left + right) / 2];
        // B2: phân bố lại mảng theo khóa
        int k = partition(array, left, right, key);
        // B3: chia đôi mảng -> lặp lại toàn bộ chu trình
        System.out.println("left=" + left + " right=" + right + " key=" + key + " (pivot)k=" + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, left, right + 1)));
        System.out.println("----------------------");
        quickSort(array, left, k - 1);
        quickSort(array, k, right);
    }

    // return pivot value
    private static int partition(int[] array, int left, int right, int key) {
        int iL = left;
        int iR = right;

        while (iL <= iR) {
            // với iL đi tìm phần tử >= key để đổi chỗ
            while (array[iL] < key) {
                iL++;
            }
            // với iR đi tìm phần tử <= key để đổi chỗ
            while (array[iR] > key) {
                iR--;
            }

            // swap two elements that are not in the correct position
            if (iL <= iR) {
                int temp = array[iL];
                array[iL] = array[iR];
                array[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = { 5, 3, 2, 7, 8, 1, 2, 9 };
        // System.out.println("bubble sort");
        // bubbleSort(a);
        // System.out.println("insertion sort");
        // insertionSort(a);
        // System.out.println("selection sort");
        // selectionSort(a);

        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

        /**
         * insertion sort khác với selection sort
         * + insertion sort ở vòng lặp thứ i thì mảng từ [0, i] đã được sắp
         * xếp nhưng nó không hoàn toàn chính xác bởi vì còn các phần tử
         * phía sau có thể nhỏ hơn mà chúng ta cần chèn vào phía trước của
         * cái mảng đã sắp xếp đó.
         * 
         * + selection sort ở vòng lặp thứ i thì chúng ta chắc chắn là cái
         * mảng từ [0, i] của mảng ban đầu đã được xắp sếp chính xác do
         * chúng ta đã chọn những phần tử nhỏ nhất chèn vào phía trước.
         */
    }
}
