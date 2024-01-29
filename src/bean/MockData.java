package bean;

public class MockData {
    private MockData() {
    }

    public static Item[] mockData() {
        return new Item[] {
                new Item(null, "Item A", 100d),
                new Item(174, "Item B", 180d),
                new Item(130, "Item C1", 120d),
                new Item(null, "Item C2", 180d),
                new Item(130, "Item C3", 140d),
                new Item(108, "Item D", 220d),
                new Item(108, null, 220d),
        };
    }
}
