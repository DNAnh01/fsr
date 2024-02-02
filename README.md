### File

##### - File Types:

- Text-Readable Files:

  - These files are typically used for storing plain text data, such as configuration files, logs, or human-readable data

  - Example: textFile.txt

- Serializable-Unreadable Files:

  - These files store serialized data, often binary, and might not be human-readable. They are useful for saving and restoring complex object structures.

  - Example: serializedData.dat

##### - File Operations

```java
import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        // Example usage for Text-Readable file
        File textFile = new File("textFile.txt");

        // Example usage for Serializable-Unreadable file
        File serializableFile = new File("serializedData.dat");

        // File operations
        System.out.println("File Name: " + textFile.getName());
        System.out.println("File Path: " + textFile.getPath());
        System.out.println("Absolute Path: " + textFile.getAbsolutePath());
        System.out.println("Canonical Path: " + textFile.getCanonicalPath());
        System.out.println("Parent Directory: " + textFile.getParent());

        // Rename the file
        boolean renamed = textFile.renameTo(new File("newTextFile.txt"));
        System.out.println("File Renamed: " + renamed);

        // Other file operations
        System.out.println("Last Modified: " + textFile.lastModified());
        System.out.println("File Length: " + textFile.length());
        System.out.println("File Exists: " + textFile.exists());
        System.out.println("Can Write: " + textFile.canWrite());
        System.out.println("Can Read: " + textFile.canRead());

        // Delete the file
        boolean deleted = textFile.delete();
        System.out.println("File Deleted: " + deleted);
    }
}

```
