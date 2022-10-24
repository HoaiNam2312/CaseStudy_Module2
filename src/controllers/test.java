package controllers;

import models.Booking;
import models.Customer;
import services.BookingServiceImpl;
import services.CustomerService;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import utils.ReadAndWrite;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static services.BookingServiceImpl.bookingList;

public class test {
    public static void main(String[] args) throws ParseException, IOException {
//        CustomerService customer = new CustomerServiceImpl();
//        customer.add();
//        customer.display();
//        BookingServiceImpl bookingList = new BookingServiceImpl();
//        bookingList.add();
//        bookingList.add();
//        bookingList.add();
//        bookingList.display();
        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(new Booking("1","23/12/2001","29/12/2000","1","1","1"));
        ReadAndWrite.writeToFile(bookingList,"test.csv");
    }
}
