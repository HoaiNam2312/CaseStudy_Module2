package services;

import models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public  ArrayList<Employee> danhSachNhanVien = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public void edit() {
        System.out.println("Nhập tên nhân viên cần kiểm tra:");
        String name = sc.nextLine();
        int index = 0;
        boolean coHayKhong = false;
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            if (name.equals(danhSachNhanVien.get(i).getHoTen())) {
                coHayKhong = true;
                index = i;
            }
        }
        if (coHayKhong) {
            System.out.println("Nhập họ và tên:");
            String hoVaTen = sc.nextLine();
            System.out.println("Nhập ngày sinh:");
            String ngaySinh = sc.nextLine();
            System.out.println("Nhập giới tính:");
            String gioiTinh = sc.nextLine();
            System.out.println("Nhập số CMND:");
            int soCMND = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số điện thoại:");
            int soDienThoai = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập email cá nhân:");
            String email = sc.nextLine();
            System.out.println("Nhập mã nhân viên:");
            String maNhanVien = sc.nextLine();
            System.out.println("Nhập trình độ:\n" +
                    "1.\tTrung cấp\n" +
                    "2.\tCao đẳng\n" +
                    "3.\tĐại học\n" +
                    "4.\tSau đại học\n");
            String trinhDo = sc.nextLine();
            boolean trinhDoKhongDung = trinhDo != "Trung cấp" && trinhDo != "Cao đẳng" && trinhDo != "Đại học" && trinhDo != "Sau đại học";
            while (trinhDoKhongDung) {
                System.out.println("Vui lòng nhập lại vị trí trong 4 vị trí sau:\n" +
                        "1.\tTrung cấp\n" +
                        "2.\tCao đẳng\n" +
                        "3.\tĐại học\n" +
                        "4.\tSau đại học\n");
                trinhDo = sc.nextLine();
                trinhDoKhongDung = trinhDo != "Trung cấp" && trinhDo != "Cao đẳng" && trinhDo != "Đại học" && trinhDo != "Sau đại học";
            }

            System.out.println("Nhập vị trí:\n" +
                    "1.\tLễ tân\n" +
                    "2.\tPhục vụ\n" +
                    "3.\tChuyên viên\n" +
                    "4.\tGiám sát\n" +
                    "5.\tQuản lý\n" +
                    "6.\tGiám đốc\n");
            String viTri = sc.nextLine();
            boolean viTriKhongDung = viTri != "Trung cấp" && viTri != "Cao đẳng" && viTri != "Đại học" && viTri != "Sau đại học";
            while (viTriKhongDung) {
                System.out.println("Nhập vị trí:\n" +
                        "1.\tLễ tân\n" +
                        "2.\tPhục vụ\n" +
                        "3.\tChuyên viên\n" +
                        "4.\tGiám sát\n" +
                        "5.\tQuản lý\n" +
                        "6.\tGiám đốc\n");
                viTri = sc.nextLine();
                viTriKhongDung = viTri != "Lễ tân" && viTri != "Phục vụ" && viTri != "Chuyên viên" && viTri != "Giám sát" && viTri != "Quản lý" && viTri != "Giám đốc";
            }
            System.out.println("Nhập luong:");
            int luong = Integer.parseInt(sc.nextLine());
            Employee nhanVien = new Employee(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
            danhSachNhanVien.set(index, nhanVien);
        } else {
            System.out.println("Tên nhân viên không có trong danh sách!");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < 172; i++) {
            System.out.print("_");
        }
        System.out.println();
        System.out.printf("|%-16s|%-16s|%-15s|%-16s|%-16s|%-30s|%-15s|%-12s|%-16s|%-10s|\n", "Họ và tên", "Ngày sinh", "Giới tính", "Số CMND", "Số điện thoại", "Email cá nhân", "Mã nhân viên", "Trình độ", "Vị trí", "Lương");
        for (int i = 0; i < 172; i++) {
            System.out.print("_");
        }
        System.out.println();
        for (int i = 0; i < danhSachNhanVien.size(); i++) {
            System.out.printf("|%-16s|%-16s|%-15s|%-16d|%-16d|%-30s|%-15s|%-12s|%-16s|%-10d|\n", danhSachNhanVien.get(i).getHoTen(), danhSachNhanVien.get(i).getNgaySinh(), danhSachNhanVien.get(i).getGioiTinh(), danhSachNhanVien.get(i).getSoCMND(), danhSachNhanVien.get(i).getSoDienThoai(), danhSachNhanVien.get(i).getEmail(), danhSachNhanVien.get(i).getMaNhanVien(), danhSachNhanVien.get(i).getTrinhDo(), danhSachNhanVien.get(i).getViTri(), danhSachNhanVien.get(i).getLuong());
            System.out.println();
        }
    }

    @Override
    public void add() {
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
        System.out.println("Nhập email cá nhân:");
        String email = sc.nextLine();
        System.out.println("Nhập mã nhân viên:");
        String maNhanVien = sc.nextLine();
        int luaChon;
        String trinhDo = "";
        do {
            System.out.println("Nhập trình độ:\n" +
                    "1.\tTrung cấp\n" +
                    "2.\tCao đẳng\n" +
                    "3.\tĐại học\n" +
                    "4.\tSau đại học\n");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    trinhDo = "Trung cấp";
                    break;
                case 2:
                    trinhDo = "Cao đẳng";
                    break;
                case 3:
                    trinhDo = "Đại học";
                    break;
                case 4:
                    trinhDo = "Sau đại học";
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 4");
            }
        } while (luaChon < 1 || luaChon > 4);

        String viTri = "";
        do {
            System.out.println("Nhập vị trí:\n" +
                    "1.\tLễ tân\n" +
                    "2.\tPhục vụ\n" +
                    "3.\tChuyên Viên\n" +
                    "4.\tGiám sát\n" +
                    "5.\tQuản lý\n" +
                    "6.\tGiám đóc\n");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    viTri = "Lễ tân";
                    break;
                case 2:
                    viTri = "Phục vụ";
                    break;
                case 3:
                    viTri = "Chuyên Viên";
                    break;
                case 4:
                    viTri = "Giám sát";
                    break;
                case 5:
                    viTri = "Quản lý";
                    break;
                case 6:
                    viTri = "Giám đốc";
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 6");
            }
        }
        while (luaChon < 1 || luaChon > 6);

        System.out.println("Nhập lương:");
        int luong = sc.nextInt();
        Employee nhanVien = new Employee(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
        danhSachNhanVien.add(nhanVien);
    }
}

