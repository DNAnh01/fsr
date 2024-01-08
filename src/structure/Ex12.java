package structure;

import java.util.Arrays;

import structure.bean.Item;

/**
 * Mảng đối tượng
 */
public class Ex12 {
    public static void main(String[] args) {
        Item[] items = new Item[4];
        Item itemX = new Item(102, 401, "Item 401", 400);
        items[0] = itemX;
        items[2] = new Item(103, 403, "Item 403", 600);
        Item[] result = findItems(items);
        print(result);
    }

    // Viết 1 hàm để tìm "những mặt hàng" có giá > 500
    private static Item[] findItems(Item[] items) {
        Item[] results = new Item[items.length];
        int run = 0;
        for (Item item : items) {
            if (item != null && item.price > 500) {
                results[run++] = item;
            }
        }
        return Arrays.copyOfRange(results, 0, run);
    }

    private static void print(Item[] items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
