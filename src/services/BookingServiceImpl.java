package services;

import models.Booking;
import models.Contract;
import models.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookingServiceImpl implements BookingService, ConTractService {
    public static Set<Booking> bookingList = new TreeSet<>();
    public static Set<Contract> contractList = new TreeSet<>();
    public static Scanner sc = new Scanner(System.in);
    public static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void display() {
        for (Booking booking : bookingList) {
            System.out.println("Ngày bắt đầu: "+df.format(booking.getNgayBatDau())+"| Ngày kết thúc: "+df.format(booking.getNgayKetThuc()));
        }
    }

    @Override
    public void add() throws ParseException {
        System.out.println("Nhập mã Booking:");
        String maBooking = sc.nextLine();
        System.out.println("Nhập ngày bắt đầu thuê:");
        Date ngayBatDau = df.parse(sc.nextLine());
        System.out.println("Nhập ngày kết thúc thuê:");
        Date ngayKetThuc = df.parse(sc.nextLine());
        System.out.println("Nhập mã khách hàng:");
        String maKhachHang = sc.nextLine();
        System.out.println("Nhập tên dịch vụ:");
        String tenDichVu = sc.nextLine();
        System.out.println("Nhập loại dịch vụ:");
        String loaiDichVu = sc.nextLine();

        Booking newBooking = new Booking(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
        bookingList.add(newBooking);

    }

    @Override
    public void createNewContracts() {

    }

    @Override
    public void displayListConTracts() {

    }

    @Override
    public void editConTracts() {

    }
}
