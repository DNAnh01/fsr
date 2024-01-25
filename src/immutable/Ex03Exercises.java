package immutable;

public class Ex03Exercises {
    public static void main(String[] args) {
        /*
         * Tính chiều dài của chuỗi s ==> s.length
         * Nối chuỗi s1 vào chuỗi s ==> s = s.concat(s1) || s = s + s1
         * Lấy một ký tự tại vị trí index(3) trong chuỗi s ==> s.chartAt(3)
         * Duyệt từng phần tử trong chuỗi forindex, foreach(char c: s)
         * Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
         */

        String s = "apple"; // start: 0 end:0
        System.out.println("start: " + s.indexOf('a'));
        System.out.println("end: " + s.lastIndexOf('a'));

        String s1 = "alibaba"; // start: 0 end: 6
        System.out.println("start: " + s1.indexOf('a'));
        System.out.println("end: " + s1.lastIndexOf('a'));

        /*
         * Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
         * + startsWidth, endsWidth
         * 
         * Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
         * Loại bỏ các khoảng trắng thừa của chuỗi s3
         * Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
         * Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không ==> contains
         */

        String s2 = "hello baba";
        System.out.println("startsWidth: " + s2.startsWith("hello"));
        System.out.println("endsWidth: " + s2.endsWith("baba"));

        s2 = s2.replace("baba", "mama");
        System.out.println("s2: " + s2);

        String s3 = "   welcome   to    our  class    ";
        System.out.println("trim|" + s3.trim() + "|");
        System.out.println("strip|" + s3.strip() + "|");
        System.out.println("strip Leading|" + s3.stripLeading() + "|");
        System.out.println("string Trailing|" + s3.stripTrailing() + "|");

        s3 = s3.trim().replaceAll("\\s+", " ");
        System.out.println("s3: " + s3);

        System.out.println("sub 2-5: " + s3.substring(2, 5));

        System.out.println("contains: " + s3.contains("zy"));
    }
}
