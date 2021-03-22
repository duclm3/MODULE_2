package com.manager;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NhapXuatDB {
    public static final String REGEX_EMAIL  = "[^@]+@[^\\.]+\\..+";
    public static final String REGEX_PHONE = "[0-9]{10}";
    public Scanner msc;
    public NhapXuatDB(){
        msc =  new Scanner(System.in);
    }
    public String nhapSDT(){
        String sdt ="";
        System.out.print("Số điện thoại:");
        try {
            sdt =  msc.nextLine();
        }catch (Exception e){
            sdt = "";
        }
        return sdt;
    }
    public DanhBa nhapDB(String status){
        String sdt = "";String nhom = "";String hotTen ="";
        boolean gioiTinh = true;String diaChi ="";String ngaySinh = "";String email = "";
        DanhBa db = null;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                if(!status.equals("SUA")){
                    System.out.print("Số điện thoại:");
                    sdt = sc.nextLine();
                    if(!Pattern.matches(REGEX_PHONE,sdt)){throw new Exception();}
                }
                System.out.print("Nhóm:");
                nhom = sc.nextLine();
                System.out.print("Họ tên:");
                hotTen = sc.nextLine();
                System.out.print("Giới tính(Nam 'true'/ Nữ 'false'):");
                gioiTinh = Boolean.parseBoolean(sc.nextLine()) ;
                System.out.print("Địa chỉ:");
                diaChi = sc.nextLine();
                System.out.print("Ngày sinh(dd/MM/yyyy):");
                ngaySinh = sc.nextLine();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
                df.parse(ngaySinh);
                System.out.print("Email:");
                email = sc.nextLine();
                if(!Pattern.matches(REGEX_EMAIL,email)){throw new Exception();};
                db = new DanhBa(sdt,nhom,hotTen,gioiTinh,diaChi,ngaySinh,email);
                break;

            }catch (Exception e){
                System.out.println("-------------------------------------");
                System.out.println("Thông tin nhập chưa đúng hoặc bạn đã bỏ chống,mời nhập lại:");
            }
        }while(true);
        return db;
    }

    public static void main(String[] args) {
        NhapXuatDB nx = new NhapXuatDB();
        nx.nhapDB("Nhap");
    }
}
