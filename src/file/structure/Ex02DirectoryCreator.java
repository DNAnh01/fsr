package file.structure;

import java.io.File;

public class Ex02DirectoryCreator {
    private static final String pathName = "src/data/testDir";

    public static void main(String[] args) {
        File dir = new File(pathName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        System.out.println("finished ... ");
    }
}
