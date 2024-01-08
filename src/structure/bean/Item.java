package structure.bean;

// custom data type: storeId, itemId, name, price
// object type is a wrapper
// default extend Object
// using Object's methods
public class Item {
    // attribute
    // info, values of each object
    // Giá trị của mỗi đối tượng
    public int storeId;
    public int itemId;
    public String name;
    public double price;

    // constructor
    // be called via 'new' keyword
    // init an object contains (storeId, itemId, name, price) and store in heap
    // Item itemA = new Item(101, 22, 'IPhone X', 1000);
    public Item(int ipStoreId, int ipItemId, String ipName, double ipPrice) {
        storeId = ipStoreId;
        itemId = ipItemId;
        name = ipName;
        price = ipPrice;
    }

    // itemA.show() >> this = itemA
    // itemB.show() >> this = itemB
    // this: special object to know who is calling this method
    public void show() {
        System.out.println(this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price);
    }

    @Override
    public String toString() {
        return this.storeId + ", " + this.itemId + ", " + this.name + ", " + this.price;
    }
}
