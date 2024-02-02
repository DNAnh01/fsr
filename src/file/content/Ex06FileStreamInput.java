package file.content;

import java.io.File;
import java.util.List;

import bean.Student;
import utils.FileUtils;

public class Ex06FileStreamInput {
    public static void main(String[] args) {
        File file = FileUtils.createNewFile("src/data/" + File.separator + "stream.txt");
        List<Student> students = FileUtils.safeReadObject(file);
        students.forEach(System.out::println);
        System.out.println("Finnish ...");
    }
}
