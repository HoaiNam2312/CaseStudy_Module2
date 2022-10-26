package utils;

import models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerFile {
    public static void writeToFile(List<Customer> customerList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
