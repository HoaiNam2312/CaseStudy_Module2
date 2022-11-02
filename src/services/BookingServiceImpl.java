package services;

import com.sun.source.tree.Tree;
import models.Booking;
import models.Contract;
import models.Customer;
import models.Villa;
import utils.ReadAndWrite;
import utils.RegexData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookingServiceImpl implements BookingService, ConTractService {
    public static TreeSet<Booking> bookingList = new TreeSet<>();
    private static Queue<Contract> contractList = new ArrayDeque<>();
    private static Scanner sc = new Scanner(System.in);
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private static final String REGEX_DATE = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String REGEX_NAME_SERVICE = "^[A-Z]\\w+$";
    @Override
    public void display() {
        System.out.println("Danh sách Booking:");
        for (int i = 0; i <97; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|\n", "Mã Booking", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Mã Khách Hàng", "Tên Dịch Vụ", "Loại Dịch Vụ");
        for (int i = 0; i < 97; i++) {
            System.out.print("-");
        }
        System.out.println();
        bookingList = ReadAndWrite.readFileBooking("E:\\CODEGYM\\FuramaResort\\src\\data\\booking.csv");
        for (Booking booking : bookingList) {
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|\n",booking.getMaBooking(),df.format(booking.getNgayBatDau()),df.format(booking.getNgayKetThuc()),booking.getMaKhachHang(),booking.getTenDichVu(),booking.getLoaiDichVu());
        }
        System.out.println();
    }

    @Override
    public void add() throws ParseException {
        System.out.println("Nhập mã Booking:");
        String maBooking = sc.nextLine();
        System.out.println("Nhập ngày bắt đầu thuê:");
        Date ngayBatDau = df.parse(RegexData.regexStr(sc.nextLine(),REGEX_DATE,"Định dạng nhập vào không đúng!!!\nĐịnh dạng đúng cho ngày ngày bắt đầu phải là: dd/MM/yyyy\nVui lòng nhập lại:"));
        System.out.println("Nhập ngày kết thúc thuê:");
        Date ngayKetThuc = df.parse(RegexData.regexStr(sc.nextLine(),REGEX_DATE,"Định dạng nhập vào không đúng!!!\nĐịnh dạng đúng cho ngày ngày kết thúc phải là: dd/MM/yyyy\nVui lòng nhập lại:"));
        System.out.println("Nhập mã khách hàng:");
        String maKhachHang = sc.nextLine();
        System.out.println("Nhập tên dịch vụ:");
        String tenDichVu = RegexData.regexStr(sc.nextLine(),REGEX_NAME_SERVICE,"Bạn đã nhập sai định dạng!!!\nTên dịch vụ phải bắt đầu bằng chữ viết in hoa.\nVui lòng nhập lại:");
        System.out.println("Nhập loại dịch vụ:");
        String loaiDichVu = sc.nextLine();

        Booking newBooking = new Booking(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
        bookingList.add(newBooking);
        ReadAndWrite.writeFileBooking(bookingList,"E:\\CODEGYM\\FuramaResort\\src\\data\\booking.csv");

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
