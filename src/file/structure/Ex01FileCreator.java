package file.structure;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
    private static final String pathName = "src/data/structure.txt";

    public static void main(String[] args) {
        File file = new File(pathName);
        // when only the file name is right, the generated file will be located in the
        // project folder.

        File parent = file.getParentFile();
        if (!parent.exists()) {
            parent.mkdirs();
        }
        if (!file.exists()) {
            try {
                boolean isSuccess = file.createNewFile();
                System.out.println("File " + file.getName() + " is created " + (isSuccess ? "successful" : "failure"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("\u001B[34m" + "finished ... " + "\u001b[0m");
    }
}
