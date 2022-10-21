package controllers;

import models.Booking;
import models.Customer;
import services.BookingServiceImpl;
import services.CustomerService;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static services.BookingServiceImpl.bookingList;

public class test {
    public static void main(String[] args) throws ParseException {
//        CustomerService customer = new CustomerServiceImpl();
//        customer.add();
//        customer.display();
        BookingServiceImpl bookingList = new BookingServiceImpl();
        bookingList.add();
        bookingList.add();
        bookingList.add();
        bookingList.display();
    }
}
