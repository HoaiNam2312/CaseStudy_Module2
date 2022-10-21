package models;

public class Contract {
    private int soHopDong;
    private String maBooking;
    private int soTienCocTruoc;
    private int tongSoTienThanhToan;
    private String maKhachHang;

    public Contract() {
    }

    public Contract(int soHopDong, String maBooking, int soTienCocTruoc, int tongSoTienThanhToan, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public int getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(int soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public int getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(int tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}
