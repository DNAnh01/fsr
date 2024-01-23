package demo;

import java.io.File;
import java.io.IOException;

public class Ex05FileProcessing {

    private static final String path = "src/data.csv";

    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("GO ON");
    }

    private static boolean createFile() throws IOException {
        File file = new File(path);
        return file.createNewFile();
    }
}
