package shopping.utilities;

import java.time.LocalDate;

import shopping.models.Item;
import shopping.models.Order;
import shopping.models.OrderItem;

public class ShoppingUtils {
    private ShoppingUtils() {

    }

    public static void export(Order[] orders, LocalDate promotionDate) {
        for (Order order : orders) {
            System.out.println("\n\nCustomer: " + order.getCustomer().getName());
            OrderItem[] itemDetails = order.getOrderItems();
            if (itemDetails.length > 0) {
                double totalOfMoney = 0;
                System.out.println("=================");
                for (OrderItem itemDetail : itemDetails) {
                    Item item = itemDetail.getItem();
                    int quantity = itemDetail.getQuantity();

                    System.out.println(item.getName() + ", " + item.getPrice() + ", " + quantity);

                    double actualPrice = item.getPrice() * quantity;
                    if (order.getDateCreated().toLocalDate().isEqual(promotionDate) && item.getPrice() > 590) {
                        actualPrice *= 0.9;
                    }

                    totalOfMoney += actualPrice;
                }
                order.setTotalOfMoney(totalOfMoney);
                System.out.println("=================");
                System.out.println("Total of money: " + totalOfMoney);
            }
        }
    }
}
