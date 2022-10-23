package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    static Map<Villa, Integer> villaList = new LinkedHashMap<>();
    static Map<House, Integer> houseList = new LinkedHashMap<>();
    static Map<Room, Integer> roomList = new LinkedHashMap<>();
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void displayListFacilityMaintenance() {
        if (villaList.size() >= 5 || houseList.size() >= 5 || roomList.size() >= 5) {
            if (villaList.size() >= 5) {
                facilityList.putAll(villaList);
            }
            if (houseList.size() >= 5) {
                facilityList.putAll(houseList);
            }
            if (roomList.size() >= 5) {
                facilityList.putAll(roomList);
            }
        }
        System.out.printf("|%-10s|%-5s|\n", "Dịch vụ cần bão trì", "Số lần sử dụng");
        Set<Map.Entry<Facility, Integer>> listFacilityMaintenance = facilityList.entrySet();
        for (Map.Entry<Facility, Integer> element : listFacilityMaintenance) {
            System.out.printf("|%-10s|%-5d|\n", element.getKey().getTenDichVu(), element.getValue());
        }
    }

    @Override
    public void display() {

        System.out.println("Danh sách villa cho thuê:");
        for (int i = 0; i < 160; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-20s|%-16s|%-18s|%-13s|%-20s|%-20s|%-12s|%-16s|\n", "Tên dịch vụ", "Diện tích sử dụng", "Chi phí thuê", "Số người tối đa", "Kiểu thuê", "Tiểu chuẩn phòng", "Diện tích hồ bơi", "Số tầng", "Số lần sử dụng");
        for (int i = 0; i < 160; i++) {
            System.out.print("-");
        }
        System.out.println();
        Set<Map.Entry<Villa, Integer>> villas = villaList.entrySet();
        for (Map.Entry<Villa, Integer> villa : villas) {
            System.out.printf("|%-15s|%-20f|%-16d|%-18d|%-13s|%-20s|%-20f|%-12d|%-16d|\n", villa.getKey().getTenDichVu(), villa.getKey().getDienTichSuDung(), villa.getKey().getChiPhiThue(), villa.getKey().getSoLuongNguoiToiDa(), villa.getKey().getKieuThue(), villa.getKey().getTieuChuanPhong(), villa.getKey().getDienTichHoBoi(), villa.getKey().getSoTang(), villa.getValue());
        }
        System.out.println();


        System.out.println("Danh sách house cho thuê:");
        for (int i = 0; i < 139; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-20s|%-16s|%-18s|%-13s|%-20s|%-12s|%-16s|\n", "Tên dịch vụ", "Diện tích sử dụng", "Chi phí thuê", "Số người tối đa", "Kiểu thuê", "Tiểu chuẩn phòng", "Số tầng", "Số lần sử dụng");
        for (int i = 0; i < 139; i++) {
            System.out.print("-");
        }
        System.out.println();
        Set<Map.Entry<House, Integer>> houses = houseList.entrySet();
        for (Map.Entry<House, Integer> house : houses) {
            System.out.printf("|%-15s|%-20f|%-16d|%-18d|%-13s|%-20s|%-12d|%-16d|\n", house.getKey().getTenDichVu(), house.getKey().getDienTichSuDung(), house.getKey().getChiPhiThue(), house.getKey().getSoLuongNguoiToiDa(), house.getKey().getKieuThue(), house.getKey().getTieuChuanPhong(), house.getKey().getSoTang(), house.getValue());
        }
        System.out.println();

        System.out.println("Danh sách room cho thuê:");
        for (int i = 0; i < 126; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-20s|%-16s|%-18s|%-13s|%-20s|%-16s|\n", "Tên dịch vụ", "Diện tích sử dụng", "Chi phí thuê", "Số người tối đa", "Kiểu thuê", "Dịch vụ miễn phí", "Số lần sử dụng");
        for (int i = 0; i < 126; i++) {
            System.out.print("-");
        }
        System.out.println();
        Set<Map.Entry<Room, Integer>> rooms = roomList.entrySet();
        for (Map.Entry<Room, Integer> room : rooms) {
            System.out.printf("|%-15s|%-20f|%-16d|%-18d|%-13s|%-20s|%-16d|\n", room.getKey().getTenDichVu(), room.getKey().getDienTichSuDung(), room.getKey().getChiPhiThue(), room.getKey().getSoLuongNguoiToiDa(), room.getKey().getKieuThue(), room.getKey().getDichVuMienPhiDiKem(), room.getValue());
        }
        System.out.println();
    }

    @Override
    public void add() {
        int luaChon = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("---ADD NEW VILLA---");
                    addNewVilla();
                    break;
                case 2:
                    System.out.println("---ADD NEW HOUSE---");
                    addNewHouse();
                    break;
                case 3:
                    System.out.println("---ADD NEW ROOM---");
                    addNewRoom();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Vui lòng chỉ chọn số từ 1 đến 4");
            }
        } while (luaChon < 1 || luaChon > 4);
    }

    public void addNewHouse() {
        System.out.println("Nhập tên dịch vụ:");
        String tenDichVu = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double dienTichSuDung = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chi phi thuê:");
        int chiPhiThue = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        int soLuongNguoiToiDa = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn kiểu cho thuê:");
        String kieuThue = "";
        int luaChon;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    kieuThue = "Năm";
                    break;
                case 2:
                    kieuThue = "Tháng";
                    break;
                case 3:
                    kieuThue = "Ngày";
                    break;
                case 4:
                    kieuThue = "Giờ";
                    break;
                default:
                    System.out.println("Vui lòng chỉ chọn số từ 1 đến 4");
            }
        } while (luaChon < 1 || luaChon > 4);

        System.out.println("Nhập tiêu chuẩn phòng:");
        String tieuChuanPhong = sc.nextLine();
        System.out.println("Nhập số tầng:");
        int soTang = Integer.parseInt(sc.nextLine());
        House newHouse = new House(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);

        houseList.put(newHouse, houseList.size() + 1);

    }

    public void addNewRoom() {
        System.out.println("Nhập tên dịch vụ:");
        String tenDichVu = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double dienTichSuDung = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chi phi thuê:");
        int chiPhiThue = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        int soLuongNguoiToiDa = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn kiểu cho thuê:");
        String kieuThue = "";
        int luaChon;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    kieuThue = "Năm";
                    break;
                case 2:
                    kieuThue = "Tháng";
                    break;
                case 3:
                    kieuThue = "Ngày";
                    break;
                case 4:
                    kieuThue = "Giờ";
                    break;
                default:
                    System.out.println("Vui lòng chỉ chọn số từ 1 đến 4");
            }
        } while (luaChon < 1 || luaChon > 4);

        System.out.println("Nhập dịch vụ miễn phí đi kèm:");
        String dichVuMienPhiDiKem = sc.nextLine();
        Room newRoom = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhiDiKem);

        roomList.put(newRoom, roomList.size() + 1);


    }

    public void addNewVilla() {
        System.out.println("Nhập tên dịch vụ:");
        String tenDichVu = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double dienTichSuDung = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chi phi thuê:");
        int chiPhiThue = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        int soLuongNguoiToiDa = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn kiểu cho thuê:");
        String kieuThue = "";
        int luaChon;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    kieuThue = "Năm";
                    break;
                case 2:
                    kieuThue = "Tháng";
                    break;
                case 3:
                    kieuThue = "Ngày";
                    break;
                case 4:
                    kieuThue = "Giờ";
                    break;
                default:
                    System.out.println("Vui lòng chỉ chọn số từ 1 đến 4");
            }
        } while (luaChon < 1 || luaChon > 4);

        System.out.println("Nhập tiêu chuẩn phòng:");
        String tieuChuanPhong = sc.nextLine();
        System.out.println("Nhập diện tích hồ bơi:");
        double dienTichHoBoi = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tầng:");
        int soTang = Integer.parseInt(sc.nextLine());
        Villa newVilla = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);


        villaList.put(newVilla, villaList.size() + 1);

    }
}
