package models;

import java.io.Serializable;

public class Employee extends PerSon implements Serializable {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private int luong;

    public Employee(String hoTen, double v, String gioiTinh, int soCMND, String soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, int luong) {
    }

    public Employee(String maNhanVien, double v, int i, int parseInt, String trinhDo, String viTri, double parseDouble, int luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String hoTen, String ngaySinh, String gioiTinh, int soCMND, String soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, int luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String toString() {
        return this.getHoTen()+","+this.getNgaySinh()+","+this.getGioiTinh()+","+this.getSoCMND()+","+this.getSoDienThoai()+","+this.getEmail()+","+this.maNhanVien+","+this.trinhDo+","+this.viTri+","+this.luong;
    }
}
