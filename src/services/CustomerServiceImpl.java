package services;

import models.Customer;
import models.Employee;
import utils.ReadAndWrite;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> danhSachKhachHang = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);
    @Override
    public void edit() throws IOException {
        System.out.println("Nhập mã khách hàng cần kiểm tra:");
        String maKiemTra = sc.nextLine();
        int index = 0;
        boolean coHayKhong = false;
        for (int i = 0; i < danhSachKhachHang.size(); i++) {
            if (maKiemTra.equals(danhSachKhachHang.get(i).getMaKhachHang())) {
                coHayKhong = true;
                index = i;
            }
        }
        if (coHayKhong) {
            System.out.println("Nhập họ và tên:");
            String hoVaTen = sc.nextLine();
            System.out.println("Nhập ngày sinh:");
            String ngaySinh = sc.nextLine();
            System.out.println("Nhập gới tính:");
            String gioiTinh = sc.nextLine();
            System.out.println("Nhập số CMND:");
            int soCMND = Integer.parseInt(sc.nextLine());
            sc.nextLine();
            System.out.println("Nhập số điện thoại:");
            int soDienThoai = Integer.parseInt(sc.nextLine());
            sc.nextLine();
            System.out.println("Nhập email khách hàng:");
            String email = sc.nextLine();
            System.out.println("Nhập mã khách hàng:");
            String maNhanVien = sc.nextLine();
            int luaChon=0;
            String loaiKhachHang="";
            do {
                System.out.println("Chọn loại khách:\n" +
                        "1.\tDiamond\n" +
                        "2.\tPlatinium\n" +
                        "3.\tGold\n" +
                        "4.\tSilver\n" +
                        "5.\tMember\n");
                System.out.println("Vui lòng nhập số tương ứng với mỗi loại khách hàng:");
                try {
                    luaChon = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
                }
                switch (luaChon) {
                    case 1:
                        loaiKhachHang = "Diamond";
                        break;
                    case 2:
                        loaiKhachHang = "Platinium";
                        break;
                    case 3:
                        loaiKhachHang = "Gold";
                        break;
                    case 4:
                        loaiKhachHang = "Silver";
                        break;
                    case 5:
                        loaiKhachHang = "Member";
                        break;
                    default:
                        System.out.println("Chỉ chọn số từ 1 đến 5. Vui lòng chọn lại!");
                }
            }while (luaChon<1 ||luaChon >5);
            System.out.println("Nhập địa chỉ khách hàng: ");
            String diaChi= sc.nextLine();

            Customer khachHang = new Customer(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, loaiKhachHang, diaChi);
            danhSachKhachHang = (List<Customer>) ReadAndWrite.readFromFile("E:\\CODEGYM\\FuramaResort\\src\\data\\customer.csv");
            danhSachKhachHang.set(index, khachHang);
            ReadAndWrite.writeToFile(danhSachKhachHang,"E:\\CODEGYM\\FuramaResort\\src\\data\\customer.csv");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < 169; i++) {
            System.out.print("_");
        }
        System.out.println();
        System.out.printf("|%-16s|%-16s|%-15s|%-16s|%-16s|%-30s|%-15s|%-20s|%-16s|\n","Họ và tên","Ngày sinh","Giới tính","Số CMND","Số điện thoại","Email khách hàng","Mã khách hàng","Loại khách hàng","Địa chỉ");
        for (int i = 0; i < 169; i++) {
            System.out.print("_");
        }
        System.out.println();
        danhSachKhachHang = (List<Customer>) ReadAndWrite.readFromFile("ReadAndWrite.writeToFile(danhSachKhachHang,\"E:\\CODEGYM\\FuramaResort\\src\\data\\customer.csv");
        for (Customer customer : danhSachKhachHang) {
            System.out.printf("|%-16s|%-16s|%-15s|%-16d|%-16d|%-30s|%-15s|%-20s|%-16s|\n",customer.getHoTen(),customer.getNgaySinh(),customer.getGioiTinh(),customer.getSoCMND(),customer.getSoDienThoai(),customer.getEmail(),customer.getMaKhachHang(),customer.getLoaiKhachHang(),customer.getDiaChi());
        }

    }

    @Override
    public void add() throws IOException {
        System.out.println("Nhập họ và tên:");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        String ngaySinh = sc.nextLine();
        System.out.println("Nhập gới tính:");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhập số CMND:");
        int soCMND = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        int soDienThoai = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhập email khách hàng:");
        String email = sc.nextLine();
        System.out.println("Nhập mã khách hàng:");
        String maNhanVien = sc.nextLine();
        int luaChon=0;
        String loaiKhachHang="";
        do {
            System.out.println("Chọn loại khách hàng:\n" +
                    "1.\tDiamond\n" +
                    "2.\tPlatinium\n" +
                    "3.\tGold\n" +
                    "4.\tSilver\n" +
                    "5.\tMember\n");
            System.out.println("Vui lòng nhập số tương ứng với mỗi loại khách hàng:");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (luaChon) {
                case 1:
                    loaiKhachHang = "Diamond";
                    break;
                case 2:
                    loaiKhachHang = "Platinium";
                    break;
                case 3:
                    loaiKhachHang = "Gold";
                    break;
                case 4:
                    loaiKhachHang = "Silver";
                    break;
                case 5:
                    loaiKhachHang = "Member";
                    break;
                default:
                    System.out.println("Chỉ chọn số từ 1 đến 5. Vui lòng chọn lại!");
            }
        }while (luaChon<1 ||luaChon >5);
        System.out.println("Nhập địa chỉ khách hàng: ");
        String diaChi= sc.nextLine();

        Customer khachHang = new Customer(hoVaTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maNhanVien,loaiKhachHang,diaChi);
        danhSachKhachHang.add(khachHang);
        ReadAndWrite.writeToFile(danhSachKhachHang,"E:\\CODEGYM\\FuramaResort\\src\\data\\customer.csv");
    }
}
