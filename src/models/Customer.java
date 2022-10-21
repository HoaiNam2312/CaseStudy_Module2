package models;

public class Customer extends PerSon {
    private String maKhachHang;
    private String loaiKhachHang;
    private String diaChi;

    public Customer() {
    }

    public Customer(String maKhachHang, String loaiKhachHang, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email, String maKhachHang, String loaiKhachHang, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

}
