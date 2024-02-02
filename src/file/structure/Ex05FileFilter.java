package file.structure;

import java.io.File;
import java.util.Arrays;

public class Ex05FileFilter {
    public static void main(String[] args) {
        File dir = new File("src/data");
        // list all available files in upload folder
        File[] files = dir.listFiles();

        Arrays.stream(files).forEach(System.out::println);
        System.out.println("=====================");
        File[] txtFiles = dir.listFiles(file -> file.isFile() && file.getName().endsWith("txt"));
        Arrays.stream(txtFiles).forEach(System.out::println);
    }
}
