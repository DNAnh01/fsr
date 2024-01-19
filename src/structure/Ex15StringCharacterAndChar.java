package structure;

public class Ex15StringCharacterAndChar {

    /**
     * https://www.youtube.com/watch?v=BW7vFK4Rmi8&list=PLqLksqdSk4b2ely12ZuwQcujGOYAUlPKz&index=12
     * 2:25:35
     * + String được tạo thành từ các characters
     * + char là kiểu nguyên thủy của Character
     * + char mặc định mà mã ascii và có thể biểu diễn hằng số vì vậy
     * ta cũng có thể sủ dụng các toán tử so sánh của số như bình
     * thường
     * 
     * + String pool
     * 
     * + equals -> bản chất là so sánh nội dung trong Object
     * 
     * 
     * + StringBuilder: sinh ra với mục đích làm tăng tốc độ sử lý của
     * String
     */
    public static void main(String[] args) {
        String s1 = "hEllo wOrld";
        String s2 = new String(s1);
        String s3 = "hEllo wOrld";

        System.out.println("s: " + s1 + "-> " + System.identityHashCode(s1)); // s: hEllo wOrld-> 971848845
        System.out.println("s: " + s2 + "-> " + System.identityHashCode(s2)); // s: hEllo wOrld-> 184966243
        System.out.println("s: " + s3 + "-> " + System.identityHashCode(s3)); // s: hEllo wOrld-> 971848845

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s3); // true

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s1.equals(s3)); // true

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(c + " ");
            }
        }
        char a = 'A';
        System.out.println("\n" + a + " has Ascii code: " + (int) a);

    }
}
