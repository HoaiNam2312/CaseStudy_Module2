package models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking implements Comparable<Booking>, Serializable {
    private String maBooking;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Booking(String maBooking, String s, String s1, String maKhachHang, String tenDichVu, String loaiDichVu) {
    }

    public Booking(String maBooking, Date ngayBatDau, Date ngayKetThuc, String maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public int compareTo(Booking o) {
        if (ngayBatDau.getTime()==o.ngayBatDau.getTime()) {
            return this.ngayKetThuc.compareTo(o.ngayKetThuc);
        }
        return ngayBatDau.compareTo(o.getNgayBatDau());
    }

    @Override
    public String toString() {
        return getMaBooking()+","+df.format(getNgayBatDau())+","+df.format(getNgayKetThuc())+","+getMaKhachHang()+","+getTenDichVu()+","+getLoaiDichVu();
    }
}
