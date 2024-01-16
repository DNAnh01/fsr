#### Data structure and algorithms

##### Exercises on leet code

##### BigO

1. Làm thế nào để đánh giá một chương trình có tốt / hiệu quả hay không ?

-   bộ nhớ | space complexity
-   thời gian | time complexity

2. Big O notation

-   Định nghĩa: g(n) được gọi là O của f(n) nếu tồn tại C (>0, không phụ thuộc vào n) và n0 sao cho với mọi n >n0, ta luôn có: f(n) <= C.g(n)

3. Big O example

-   Big O là một cách đo lường hiệu suất của thuật toán, tập trung vào cách thời gian thực hiện và tài nguyên sử dụng (chủ yếu là bộ nhớ) tăng lên khi kích thước đầu vào tăng. Dưới đây là một số định nghĩa cơ bản của Big O:

    -   2.1 O(1) - Constant Time: Thời gian thực hiện không thay đổi với kích thước đầu vào.

    ```java
    public void printFirstElement(int[] array) {
        System.out.println(array[0]);
    }
    ```

    -   2.2 O(n) - Linear Time: Thời gian thực hiện tăng theo tỷ lệ tuyến tính với kích thước đầu vào.

    ```java
    public void printAllElements(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
    ```

    -   2.3 O(log n) - Logarithmic Time: Thời gian thực hiện tăng theo hàm logarit của kích thước đầu vào.

    ```java
    public int binarySearch(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = sortedArray[mid];

            if (midValue == target) {
                return mid; // Target found
            } else if (midValue < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
    ```

    -   2.4 O(n log n) - Linearithmic Time: Thời gian thực hiện tăng theo tích của kích thước đầu vào và logarit của kích thước đầu vào.

    ```java
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            // Recursive calls to sort the sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (put the pivot element
        // in its correct position)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    ```

    -   2.5 O(n^2) - Quadratic Time: Thời gian thực hiện tăng bậc hai so với kích thước đầu vào.

    ```java
    public void printAllPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    ```
