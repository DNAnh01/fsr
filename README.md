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

##### Hash Table

1. Định nghĩa

-   Bài toán: Ta có một tập tên người và số điện thoại. Làm sao để từ tên người ta có thể tra ra số điện thoại nhanh nhất

<img src="data:image/png;base64,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" width="860px" height="">
