package models;

import java.io.Serializable;

public class House extends Facility implements Serializable {
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String id,String tenDichVu, double dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, int soTang) {
        super(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return this.getId() + "," + this.getTenDichVu() + "," + this.getDienTichSuDung() + "," + getChiPhiThue() + "," + getSoLuongNguoiToiDa() + "," + getKieuThue() + "," + tieuChuanPhong + "," + soTang + ",";
    }
}
