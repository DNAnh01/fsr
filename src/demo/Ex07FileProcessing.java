package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FileProcessing {
    // Write data into file
    // Write 1000 lines into data.txt file

    public static void main(String[] args) {
        File file = new File("src/data.csv");

        if (!file.exists()) {
            System.out.println("file is not existed");
            return;
        }

        FileWriter fw = null;
        try {
            // Open and connect to file
            fw = new FileWriter(file);

            // Write file
            fw.write("Line 001 .... \n");
            fw.write("Line 002 .... \n");
            fw.write("Line 003 .... \n");
            fw.write("Line 004 .... \n");
            fw.write("Line 005 .... \n");
            fw.write("Line 900 .... \n");

            fw.write("Line k .... \n");

            fw.write("Calculated data: " + calculatedData() + " \n");

            fw.write("Line k + 1 .... \n");

            fw.write("Line 1000 .... \n");

            // invalid
        } catch (ArithmeticException | IOException e) {
            // invalid
            e.printStackTrace();

        } finally {
            // always immediately execute after try/[catch]
            // save and close file
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        // System.out.println(Integer.parseInt("abc"));

        System.out.println("Finished .......");
    }

    private static int calculatedData() {
        return 8 / 0;
    }
}
