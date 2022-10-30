package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import utils.ReadAndWrite;
import utils.RegexData;

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
    private static final String REGEX_NAME_SERVICE = "^[A-Z]\\w+$";
    private static final String REGEX_STANDARD = "^[A-Z]\\w+$";
    private static final String REGEX_AREA = "^([3-9][1-9]\\d*)|([1-9][0-9]\\d+)$";
    private static final String REGEX_COST = "^(\\d)([,]|[.]|\\d+)+$";
    private static final String REGEX_MAXIMUN_PEOPLE = "^[1-9]|([1][0-9])$";
    private static final String REGEX_FLOOR = "^\\d+$";
    private static final String REGEX_ID_VILLA = "^(SVVL)-\\d{4}$";
    private static final String REGEX_ID_HOUSE = "^(SVHO)-\\d{4}$";
    private static final String REGEX_ID_ROOM = "^(SVRO)-\\d{4}$";
    private static final String REGEX_DATE_OF_BIRTH = "^(SVRO)-\\d{4}$";
    private static int countVilla =0;
    private static int countHouse =0;
    private static int countRoom =0;
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

        System.out.println("Danh sách Villa cho thuê:");
        for (int i = 0; i < 170; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-10s|%-15s|%-20s|%-16s|%-18s|%-13s|%-20s|%-20s|%-12s|%-16s|\n", "ID","Tên dịch vụ", "Diện tích sử dụng", "Chi phí thuê", "Số người tối đa", "Kiểu thuê", "Tiểu chuẩn phòng", "Diện tích hồ bơi", "Số tầng", "Số lần sử dụng");
        for (int i = 0; i < 170; i++) {
            System.out.print("-");
        }
        System.out.println();
        villaList = ReadAndWrite.readFileVilla("E:\\CODEGYM\\FuramaResort\\src\\data\\villa.csv");
        Set<Map.Entry<Villa, Integer>> villas = villaList.entrySet();
        for (Map.Entry<Villa, Integer> villa : villas) {
            System.out.printf("|%-10s|%-15s|%-20f|%-16d|%-18d|%-13s|%-20s|%-20f|%-12d|%-16d|\n", villa.getKey().getId(),villa.getKey().getTenDichVu(), villa.getKey().getDienTichSuDung(), villa.getKey().getChiPhiThue(), villa.getKey().getSoLuongNguoiToiDa(), villa.getKey().getKieuThue(), villa.getKey().getTieuChuanPhong(), villa.getKey().getDienTichHoBoi(), villa.getKey().getSoTang(), villa.getValue());
        }
        System.out.println();


        System.out.println("Danh sách House cho thuê:");
        for (int i = 0; i < 149; i++) {
            System.out.print("-");
        }
        System.out.println();
        houseList = ReadAndWrite.readFileHouse("E:\\CODEGYM\\FuramaResort\\src\\data\\house.csv");
        System.out.printf("|%-10s|%-15s|%-20s|%-16s|%-18s|%-13s|%-20s|%-12s|%-16s|\n", "ID","Tên dịch vụ", "Diện tích sử dụng", "Chi phí thuê", "Số người tối đa", "Kiểu thuê", "Tiểu chuẩn phòng", "Số tầng", "Số lần sử dụng");
        for (int i = 0; i < 149; i++) {
            System.out.print("-");
        }
        System.out.println();
        Set<Map.Entry<House, Integer>> houses = houseList.entrySet();
        for (Map.Entry<House, Integer> house : houses) {
            System.out.printf("|%-10s|%-15s|%-20f|%-16d|%-18d|%-13s|%-20s|%-12d|%-16d|\n", house.getKey().getId(),house.getKey().getTenDichVu(), house.getKey().getDienTichSuDung(), house.getKey().getChiPhiThue(), house.getKey().getSoLuongNguoiToiDa(), house.getKey().getKieuThue(), house.getKey().getTieuChuanPhong(), house.getKey().getSoTang(), house.getValue());
        }
        System.out.println();

        System.out.println("Danh sách Room cho thuê:");
        for (int i = 0; i < 136; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-10s|%-15s|%-20s|%-16s|%-18s|%-13s|%-20s|%-16s|\n", "ID","Tên dịch vụ", "Diện tích sử dụng", "Chi phí thuê", "Số người tối đa", "Kiểu thuê", "Dịch vụ miễn phí", "Số lần sử dụng");
        for (int i = 0; i < 136; i++) {
            System.out.print("-");
        }
        System.out.println();
        roomList = ReadAndWrite.readFileRoom("E:\\CODEGYM\\FuramaResort\\src\\data\\room.csv");
        Set<Map.Entry<Room, Integer>> rooms = roomList.entrySet();
        for (Map.Entry<Room, Integer> room : rooms) {
            System.out.printf("|%-10s|%-15s|%-20f|%-16d|%-18d|%-13s|%-20s|%-16d|\n", room.getKey().getId(),room.getKey().getTenDichVu(), room.getKey().getDienTichSuDung(), room.getKey().getChiPhiThue(), room.getKey().getSoLuongNguoiToiDa(), room.getKey().getKieuThue(), room.getKey().getDichVuMienPhiDiKem(), room.getValue());
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
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
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

    private String inputName() {
        System.out.println("Vui lòng nhập tên dịch vụ:");
        return RegexData.regexStr(sc.nextLine(), REGEX_NAME_SERVICE,"Bạn đã nhập sai định dạng!!!\nTên dịch vụ phải bắt đầu bằng chữ viết in hoa.\nVui lòng nhập lại:");
    }

    private String inputStandard() {
        System.out.println("Vui lòng nhập tiêu chuẩn phòng:");
        return RegexData.regexStr(sc.nextLine(), REGEX_STANDARD, "Bạn đã nhập sai định dạng!!!\nTên tiêu chuẩn phòng phải được viết hoa chữ cái đầu.\nVui lòng nhập lại:");
    }
    private String inputArea(String name) {
        System.out.println("Vui lòng nhập "+name+": ");
        return RegexData.regexStr(sc.nextLine(),REGEX_AREA,"Bạn đã nhập sai định dạng!!!\nDiện tích phải là số thực lớn hơn 30 mét vuông.\nVui lòng nhập lại:");
    }
    private String inputCost() {
        System.out.println("Vui lòng nhập chi phí thuê:");
        return RegexData.regexStr(sc.nextLine(),REGEX_COST,"Bạn đã nhập sai định dạng!!!\nChi phí thuê phải là số dương.\nVui lòng nhập lại:");
    }
    private String inputFloor() {
        System.out.println("Vui lòng nhập số tầng:");
        return RegexData.regexStr(sc.nextLine(),REGEX_FLOOR,"Bạn đã nhập sai định dạng!!!\nDiện tích phải là số thực lớn hơn 30 mét vuông.\nVui lòng nhập lại!");
    }

    private String inputID(String name) {
        if (name == "villa") {
            System.out.println("Vui lòng nhập ID Villa:");
            return RegexData.regexStr(sc.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng!!!\nMã dịch vụ Villa phải có dạng: SVVL-XXXX (với X là các số từ 0-9).\nVui lòng nhập lại:");
        } else if (name == "house") {
            System.out.println("Vui lòng nhập ID House:");
            return RegexData.regexStr(sc.nextLine(), REGEX_ID_HOUSE, "Bạn đã nhập sai định dạng!!!\nMã dịch vụ House phải có dạng: SVHO-XXXX (với X là các số từ 0-9).\nVui lòng nhập lại:");
        }else {
            System.out.println("Vui lòng nhập ID Room:");
            return RegexData.regexStr(sc.nextLine(), REGEX_ID_ROOM, "Bạn đã nhập sai định dạng!!!\nMã dịch vụ Room phải có dạng: SVRO-XXXX (với X là các số từ 0-9).\nVui lòng nhập lại:");
        }
    }

    private String inputPeople() {
        System.out.println("Vui lòng nhập số lượng người tối đa:");
        return RegexData.regexStr(sc.nextLine(),REGEX_MAXIMUN_PEOPLE,"Bạn đã nhập sai định dạng!!!\nSố lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20 người.\nVui lòng nhập lại!");
    }

    public void addNewHouse() {
        countHouse++;
        String id = inputID("house");

        String tenDichVu = inputName();

        double dienTichSuDung = Double.parseDouble(inputArea("diện tích sử dụng"));

        int chiPhiThue = Integer.parseInt(inputCost());

        int soLuongNguoiToiDa = Integer.parseInt(inputPeople());
        System.out.println("Chọn kiểu cho thuê:");
        String kieuThue = "";
        int luaChon =0;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
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


        String tieuChuanPhong = inputStandard();

        int soTang = Integer.parseInt(inputFloor());
        House newHouse = new House(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);

        houseList.put(newHouse, houseList.size() + 1);
        ReadAndWrite.writeFileHouse(houseList,"E:\\CODEGYM\\FuramaResort\\src\\data\\house.csv");
    }

    public void addNewRoom() {
        String id = inputID("room");
        String tenDichVu = inputName();

        double dienTichSuDung = Double.parseDouble(inputArea("diện tích sử dụng"));

        int chiPhiThue = Integer.parseInt(inputCost());

        int soLuongNguoiToiDa = Integer.parseInt(inputPeople());
        System.out.println("Chọn kiểu cho thuê:");
        String kieuThue = "";
        int luaChon=0;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
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
        Room newRoom = new Room(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhiDiKem);

        roomList.put(newRoom, roomList.size() + 1);
        ReadAndWrite.writeFileRoom(roomList,"E:\\CODEGYM\\FuramaResort\\src\\data\\room.csv");

    }

    public void addNewVilla() {
        countVilla++;
        String id = inputID("villa");
        String tenDichVu = inputName();

        double dienTichSuDung = Double.parseDouble(inputArea("diện tích sử dụng"));

        int chiPhiThue = Integer.parseInt(inputCost());

        int soLuongNguoiToiDa = Integer.parseInt(inputPeople());
        System.out.println("Chọn kiểu cho thuê:");
        String kieuThue = "";
        int luaChon=0;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
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


        String tieuChuanPhong = inputStandard();

        double dienTichHoBoi = Double.parseDouble(inputArea("diện tích hồ bơi"));

        int soTang = Integer.parseInt(inputFloor());
        Villa newVilla = new Villa(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
//        villaList = ReadAndWrite.readFileVilla("E:\\CODEGYM\\FuramaResort\\src\\data\\villa.csv");
        villaList.put(newVilla, countVilla);
        ReadAndWrite.writeFileVilla(villaList,"E:\\CODEGYM\\FuramaResort\\src\\data\\villa.csv");
    }
}
