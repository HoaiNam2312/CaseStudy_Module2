package models;

import java.io.Serializable;

public class Room extends Facility implements Serializable {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(String id,String tenDichVu, double dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return getId() + "," + getTenDichVu() + "," + getDienTichSuDung() + "," + getChiPhiThue() + "," + getSoLuongNguoiToiDa() + "," + getKieuThue() + "," + dichVuMienPhiDiKem + ",";
    }
}
