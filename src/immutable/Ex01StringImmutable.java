package immutable;

import static utils.StringUtils.*;

public class Ex01StringImmutable {
    public static void main(String[] args) {
        String s1 = "become";
        String s2 = "welcome";
        String s3 = "become";
        String s4 = new String("welcome");

        s1.concat("123");
        s2.concat("123");
        s3.concat("123");
        s4.concat("123");

        System.out.println((s2.equals(s4))); // true
        System.out.println((s2 == s4)); // false

        hash("s1", s1);
        hash("s2", s2);
        hash("s3", s3);
        hash("s4", s4);

        s3 = "tobe";
        hash("s3", s3);

        System.out.println("=============");

        String o1 = new String("hello");
        String o2 = new String("merci");
        String o3 = new String("hello");
        String o4 = new String("welcome");

        hash("o1", o1);
        hash("o2", o2);
        hash("o3", o3);
        /**
         * intern() là một phương thức trong lớp String của Java được sử dụng để giảm bộ
         * nhớ bằng cách thực hiện "pooling" các chuỗi. Nó trả về một phiên bản của
         * chuỗi đó từ String pool, nếu nó đã tồn tại. Nếu không, nó thêm chuỗi đó vào
         * String pool và trả về đối tượng chuỗi mới.
         */
        hash("o4", o4.intern());

        System.out.println("(o4 == s2): " + (o4.intern() == s2));

    }
}
