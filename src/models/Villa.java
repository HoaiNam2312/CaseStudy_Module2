package models;

import java.io.Serializable;

public class Villa extends Facility implements Serializable {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;

    public Villa(String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String id,String tenDichVu, double dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa() {
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
       return this.getId()+","+this.getTenDichVu()+","+this.getDienTichSuDung()+","+this.getChiPhiThue()+","+this.getSoLuongNguoiToiDa()+","+this.getKieuThue()+","+tieuChuanPhong+","+dienTichHoBoi+","+soTang+",";
    }

}
