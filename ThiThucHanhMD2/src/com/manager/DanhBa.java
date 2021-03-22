package com.manager;

public class DanhBa {
    private String sdt;
    private String nhom;
    private String hoTen;
    private boolean gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public DanhBa(String sdt, String nhom, String hoTen, boolean gioiTinh, String diaChi, String ngaySinh, String email) {
        this.sdt = sdt;
        this.nhom = nhom;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DanhBa(){}


    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String toString(){
        return "SĐT:" + sdt +"\n" +
                "Nhóm:" + nhom + "\n" +
                "Họ tên:" + hoTen + "\n" +
                "Giới tính:" + gioiTinh + "\n" +
                "Địa chỉ:" + diaChi;
    }
}
