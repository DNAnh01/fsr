package shopping.repository;

import java.time.LocalDateTime;

import shopping.models.Customer;
import shopping.models.Item;
import shopping.models.ItemGroup;
import shopping.models.Order;
import shopping.models.OrderItem;

public class DataModel {
    private DataModel() {
    }

    public static Order[] createOrders(Item[] items, Customer[] customers) {
        OrderItem[] firstOrderItems = {
                new OrderItem(items[0], 1),
                new OrderItem(items[1], 2)
        };

        OrderItem[] secondOrderItems = { new OrderItem(items[2], 2), new OrderItem(items[3], 3) };

        return new Order[] {
                new Order(customers[0], firstOrderItems, LocalDateTime.of(2022, 5, 5, 10, 10, 20)),
                new Order(customers[1], secondOrderItems, LocalDateTime.now())
        };
    }

    public static ItemGroup[] initialItemGroups(Item[] items) {
        return new ItemGroup[] {
                new ItemGroup(123, "Phone", new Item[] { items[0], items[1] }),
                new ItemGroup(234, "Fridge", new Item[] { items[2] }),
                new ItemGroup(345, "Electric Fan", new Item[] { items[3] })
        };
    }

    public static Item[] initialItems() {
        return new Item[] {
                new Item("SS10+", "SamSung Galaxy S10+", "Black", 20580),
                new Item("Iphone8", "Iphone 8", "Black", 22600),
                new Item("Fridge LG-X12", "Fridge LG-X12 detail", "White", 28000),
                new Item("EFan 7+", "Electric Fan 7", "Black", 1200) };
    }

    public static Customer[] initialCustomers() {
        return new Customer[] { new Customer("John", "034859315", true, "Milan"),
                new Customer("Susan", "090800266", false, "Kiev") };
    }
}
