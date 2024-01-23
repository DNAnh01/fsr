package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05CompileException {
    public static void main(String[] args) {
        try {
            createFile("src/data.txt");
            System.out.println("Tạo file thành cônng !");
        } catch (IOException e) {
            System.out.println("Fail 01");
            e.printStackTrace();
        }
        System.out.println("Kết thúc");
    }

    private static boolean createFile(String path) throws IOException {
        if (path == null || path.isEmpty()) {
            throw new FileNotFoundException(path + " is not existed !");
        }
        return new File(path).createNewFile(); // IOException
    }
}
