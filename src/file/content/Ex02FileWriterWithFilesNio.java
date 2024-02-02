package file.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterWithFilesNio {
    public static void main(String[] args) {
        File file = FileUtils.createNewFile("src/data/" + File.separator + "content.txt");
        List<Customer> customers = DataModel.getCustomers();
        List<String> lines = customers.stream()
                .map(customer -> customer.toLine())
                .collect(Collectors.toList());
        lines.add(0, "information customer ex02");
        lines.add(1, "--------------------------");
        try {
            Files.write(file.toPath(), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finished ...");
    }

}
