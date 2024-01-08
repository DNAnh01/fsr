package structure;

import structure.bean.Item;

/**
 * Giải thích từ khóa final
 * >> Hằng số: const
 * 
 * >> Variable: STACK
 * >> Primitive: VALUE STACK
 * >> Không thể cập nhật giá trị
 * 
 * >> Object: VALUE HEAP
 * >>
 * 
 * >> modifiable
 * 
 * >> final >> Hoạt động ở STACK
 * - Không thể cập nhật giá trị của biến ở STACK
 * - Không thể gán lại giá trị dùng toán tử '=' khi biến là final
 * 
 * >> CÓ THỂ CẬP NHẬT GIÁ TRỊ Ở HEAP
 */
public class Ex07 {
    public static void main(String[] args) {
        int tmp = 99;
        final int number = 20;
        // number = 40; error
        // number = tmp; error
        System.out.println("number: " + number);

        System.out.println("=================");
        final Integer digit = 20;
        // digit = 40;
        System.out.println("digit: " + digit);

        System.out.println("=================");
        final Item itemA = new Item(1, 1, "Device X", 50);
        // itemA = new Item(1, 2, "Device Y", 100); REASSIGN ADDRESS IN STACK
        itemA.price = 99;
        System.out.println("itemA: " + itemA);

        // Best practice with final
        final Item itemX = new Item(1, 1, "Device X", 11); // H2
        final Item itemY = new Item(2, 2, "Device Y", 22); // H2
        // itemX = itemY;
        itemX.storeId = 10;
        itemX.itemId = 20;

        // daemon thread >> clean all unused objects
        // garbage collector

    }
}
