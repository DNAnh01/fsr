package immutable;

public class Ex02Compare {
    public static void main(String[] args) {
        System.out.println("A".equals("B")); // false
        System.out.println("Ab".equals("Ab")); // true
        System.out.println("abc".equals("z")); // false

        System.out.println("\n===============\n");

        /**
         * Phương thức compareTo trong lớp String của Java được sử dụng để so sánh hai
         * chuỗi dựa trên thứ tự từ điển. Phương thức này trả về một số nguyên:
         * 
         * Số dương nếu chuỗi gọi phương thức đứng trước chuỗi được so sánh.
         * Số âm nếu chuỗi gọi phương thức đứng sau chuỗi được so sánh.
         * 0 nếu hai chuỗi là giống nhau.
         */
        System.out.println("A".compareTo("B")); // -1
        System.out.println("Ab".compareTo("Ab")); // 0
        System.out.println("abc".compareTo("z")); // -25
        System.out.println("De".compareTo("A")); // 3
    }
}
