package structure;

import java.util.ArrayList;
import java.util.List;

public class Ex14ListAndArrayList {
    public static void main(String[] args) {
        // bản chất ArrayList được quản lý bên trong nó là 1 cái mảng
        // và cứ mỗi lần mà ta add vào một phần tử mà làm size của array bên
        // trong ArrayList đó tăng lên

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.remove(12); // O(n)
        // mặc dù ta chỉ gọi một câu lệnh nhưng nó làm rất nhiều điều trong
        // đó

        // có nghĩa là khi ta remove phần tử đầu tiên thì từ vị trí tiếp theo
        // đến n-1 sẽ dịch lên phía trước
        arr.clear();
        arr.contains(1); // O(n)
    }
}
