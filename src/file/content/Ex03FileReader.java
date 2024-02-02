package file.content;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import utils.FileUtils;

public class Ex03FileReader {
    public static void main(String[] args) {
        File file = FileUtils.createNewFile("src/data/" + File.separator + "content.txt");
        List<String> lines = FileUtils.readFile(file);
        lines.forEach(System.out::println);

        System.out.println("address = Hoa Khanh");

        List<Customer> customers = lines
                .subList(2, lines.size())
                .stream()
                .map(Customer::new)
                .filter(customer -> "Hoa Khanh".equals(customer.getAddress()))
                .collect(Collectors.toList());

        customers.forEach(System.out::println);
        System.out.println("Finished ... ");
    }
}
