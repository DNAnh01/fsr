package file.content;

import java.io.File;

import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {

    public static void main(String[] args) {
        File file = FileUtils.createNewFile("src/data/" + File.separator + "content.txt");
        FileUtils.writeFile("information customer ex01", DataModel.getCustomers(), file);
        System.out.println("Finished ...");
    }
}
