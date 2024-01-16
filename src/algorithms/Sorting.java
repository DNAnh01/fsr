package algorithms;

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
     * 
     * 
     */

    public static void main(String[] args) {
        int[] a = { 5, 3, 2, 7, 8, 1, 2 };
        // System.out.println("bubble sort");
        // bubbleSort(a);
        // System.out.println("insertion sort");
        // insertionSort(a);
        System.out.println("selection sort");
        selectionSort(a);

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
