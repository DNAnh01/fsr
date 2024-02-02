package file.structure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import utils.FileUtils;

public class Ex04FileUploadWithPath {
    public static void main(String[] args) throws IOException {
        // B1: Select from file
        Path source = Paths.get("src/data/structure.txt");
        // B2: Upload Folder
        Path uploadDirectory = FileUtils.createNewDirectoryAsPath("src/data/testDir");

        Path targetPath = Files.copy(source, uploadDirectory.resolve(FileUtils.rename(source.getFileName())));
        System.out.println(targetPath.toString());
    }
}
