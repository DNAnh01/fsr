package file.content;

import java.io.File;
import java.util.List;

import bean.Student;
import model.DataModel;
import utils.FileUtils;

public class Ex05FileStreamOutput {
    public static void main(String[] args) {

        File file = FileUtils.createNewFile("src/data/" + File.separator + "stream.txt");
        List<Student> students = DataModel.getStudents();
        FileUtils.writeObject(file, students);
        System.out.println("Finished ... ");
    }
}
