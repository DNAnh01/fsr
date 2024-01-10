package inheritance.example;

public class Son implements Father, Mother {
    @Override
    public void coding() {
        System.out.println("Son is coding...");
    }

    @Override
    public void html() {
        System.out.println("Son knows HTML.");
    }

    @Override
    public void css() {
        System.out.println("Son knows CSS.");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.coding(); // select from father || mother
        son.html();
        son.css();
    }
}
