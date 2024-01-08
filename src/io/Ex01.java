package io;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        try (Scanner ip = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");
            String firstName = ip.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = ip.nextLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(ip.nextLine());
            System.out.println("Age: " + age);
            
            System.out.print("Enter something: ");
            String emptyText = ip.nextLine();
            
            System.out.println("Fullname: " + (firstName + lastName));
            System.out.println("emptyText |||" + emptyText + "|||");
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
