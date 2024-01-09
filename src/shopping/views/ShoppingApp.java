package shopping.views;

import java.time.LocalDate;

import shopping.models.Customer;
import shopping.models.Item;
import shopping.models.ItemGroup;
import shopping.models.Order;
import shopping.utilities.ShoppingUtils;

import static shopping.repository.DataModel.*;

/**
 * Customer: name, phone, gender, address
 * Item: id, name, color, price, itemgroup
 * 
 * --> Initial Shop Data
 * Item[] items = {....}
 * 
 * --> Initial Customer Data
 * Customer[] customers = {....}
 * 
 * --> ItemDetail: item, quantity
 * 
 * Order
 * + Customer
 * + ItemDetail[]
 * + DateTime
 * 
 * ==> shopping(Order)
 * 
 * ===> Loại Hàng ===> ItemGroup
 * ===> Tìm những mặt hàng có giá bán lớn hơn 20000 trong loại hàng điện thoại
 * 
 * ==> ItemGroup: id, name, Item[]
 */
public class ShoppingApp {
    public static void main(String[] args) {
        // B1: Initial Item, Customer Data
        Item[] items = initialItems();
        Customer[] customers = initialCustomers();

        // B2: Do shopping
        Order[] orders = createOrders(items, customers);

        // B3: Do calculation and export bill
        ShoppingUtils.export(orders, LocalDate.of(2022, 5, 5));

        // ===========================================
        // Find items in "Phone" group which have price greater than 20000
        ItemGroup[] itemGroups = initialItemGroups(items);
        for (ItemGroup itemGroup : itemGroups) {
            if (itemGroup.getName().equals("Phone")) {
                Item[] phoneItems = itemGroup.getItems();
                for (Item item : phoneItems) {
                    if (item.getPrice() > 21000) {
                        System.out.println(item);
                    }
                }
            }
        }
    }
}
