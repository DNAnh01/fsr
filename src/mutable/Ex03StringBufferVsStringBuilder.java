package mutable;

public class Ex03StringBufferVsStringBuilder {
    /**
     * Mục đích chương trình:
     * + Chương trình này minh họa sự khác biệt giữa StringBuilder và StringBuffer
     * trong môi trường đa luồng.
     * 
     * + Cả hai luồng t0 và t1 đều truy cập và sửa đổi cùng một đối tượng mutable.
     * 
     * + Kết quả in ra sẽ cho thấy độ dài chuỗi cuối cùng và có thể giúp đánh giá sự
     * an toàn và hiệu quả của StringBuilder và StringBuffer trong tình huống này.
     * 
     * 
     * 
     * Điểm cần lưu ý:
     * 
     * + StringBuilder không được đồng bộ hóa, nên có thể dẫn đến kết quả không mong
     * muốn trong môi trường đa luồng nếu nhiều luồng truy cập và sửa đổi nó cùng
     * lúc.
     * 
     * + StringBuffer được đồng bộ hóa, đảm bảo an toàn cho luồng nhưng có thể có
     * hiệu suất thấp hơn so với StringBuilder.
     */
    public static void main(String[] args) {
        System.out.println("Thread#main - start");

        MutableTask task = new MutableTask();

        // Tạo hai luồng mới t0 và t1, cả hai đều sử dụng đối tượng task và khởi chạy
        // chúng.
        Thread t0 = new Thread(task, "Thread-0");
        t0.start();

        Thread t1 = new Thread(task, "Thread-1");
        t1.start();

        // Sử dụng t0.join() và t1.join() để đảm bảo luồng chính đợi hai luồng kia hoàn
        // thành trước khi tiếp tục.
        try {
            t0.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("length: " + task.length());
        System.out.println("Thread#main - end");
    }

    // nested class
    private static class MutableTask implements Runnable {
        // mutable thread could access this task with share data
        // share data: StringBuilder || StringBuffer

        private StringBuffer mutable;
        // private StringBuilder mutable;

        private int count = 70000;

        public MutableTask() {
            this.mutable = new StringBuffer();
            // this.mutable = new StringBuilder();
        }

        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                mutable.append("A");
            }
        }

        public int length() {
            return mutable.length();
        }
    }
}
