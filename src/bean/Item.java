package bean;

public class Item implements Comparable<Item> {
    private Integer id;
    private String name;
    private Double price;

    public Item() {
    }

    public Item(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    // this.compareTo(o)
    // this: previous
    // o: next
    public int compareTo(Item o) {
        // Ascending by Id
        Item o1 = this;
        Item o2 = o;

        int comparedId = o1.getId() - o2.getId();

        if (comparedId != 0)
            return comparedId;

        // o1 id = o2 id

        // descending by Price
        // return Double.compare(o2.getPrice(), o1.getPrice());

        // ascending by Name
        return o2.getName().compareTo(o1.getName());
    }

    /**
     * Quy tắc trả về:
     * Trả về số âm nếu o1 nên đứng trước o2 trong thứ tự sắp xếp.
     * Trả về 0 nếu hai đối tượng bằng nhau.
     * Trả về số dương nếu o1 nên đứng sau o2 trong thứ tự sắp xếp.
     */
}
