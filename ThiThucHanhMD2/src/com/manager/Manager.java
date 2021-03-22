package com.manager;

import javax.activation.DataHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static final int NOT_FOUND = -1;
    static List<DanhBa> listDB;
    static NhapXuatDB nhapXuatDB;
    static DocGhiFile docGhiFile;
    static {
        listDB = new ArrayList<>();
        nhapXuatDB = new NhapXuatDB();
        docGhiFile = new DocGhiFile();
        listDB.add(new DanhBa("0123456789","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456788","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456787","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456786","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456785","0","0",true,"0","0","0"));

        listDB.add(new DanhBa("0123456799","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456798","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456797","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456796","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456795","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456794","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456793","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456792","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456782","0","0",true,"0","0","0"));
        listDB.add(new DanhBa("0123456784","0","0",true,"0","0","0"));

    }
    public Manager(){};
    public int timKiemSDT(String sdt) {
        for (int i = 0; i < listDB.size(); i++) {
            if(listDB.get(i).getSdt().equals(sdt)){
                return i;
            }
        }
        return -1;
    }
    public void xemDanhSach() {
        Scanner sc = new Scanner(System.in);
        int count  = 0;
        for (int i = 0; i < listDB.size(); i++,count++) {
            if(count <= 4){
                System.out.println("---------------------");
                System.out.println("Thông tin danh bạn thứ "+(i+1));
                System.out.println(listDB.get(i));
            }else{
                String enter = sc.nextLine();
                if(enter.isEmpty()){
                    count = 0;
                }else{
                    return;
                }
            }
        }
    }
    public void themDanhBa(){
        DanhBa db = nhapXuatDB.nhapDB("THEM");
        if(timKiemSDT(db.getSdt())== NOT_FOUND){
            listDB.add(db);
            return;
        }else{
            System.out.println("Số điện thoại này đã tồn tại");
        }
    }
    public void suaDanhBa(){
        String sdt = nhapXuatDB.nhapSDT();
        sdt = lapLaiVaKTSDT(sdt);
        if(sdt.isEmpty()){
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
            return;
        }
        System.out.println("-----Đã tìm thấy sản phẩm,hãy cập nhật sp-----");
        DanhBa db = nhapXuatDB.nhapDB("SUA");
        int index = timKiemSDT(sdt);
        listDB.get(index).setNhom(db.getNhom());
        listDB.get(index).setHoTen(db.getHoTen());
        listDB.get(index).setGioiTinh(db.getGioiTinh());
        listDB.get(index).setDiaChi(db.getDiaChi());
        listDB.get(index).setNgaySinh(db.getNgaySinh());
        listDB.get(index).setEmail(db.getEmail());
    }
    public String lapLaiVaKTSDT(String sdt){
        Scanner sc= new Scanner(System.in);
        while (timKiemSDT(sdt) == NOT_FOUND){
            System.out.println("Không tìm được danh bạ với số điện thoại trên!");
            System.out.print("Nhập lại(nhấn enter để thoát)");
            sdt = nhapXuatDB.nhapSDT();
            if(sdt.isEmpty()){
                return "";
            }
        }
        return sdt;
    }
    public void xoaDanhBa(){
        String sdt = nhapXuatDB.nhapSDT();
        sdt = lapLaiVaKTSDT(sdt);
        if(sdt.equals("")){
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
            return;
        }
        if(timKiemSDT(sdt)!= NOT_FOUND){
            System.out.print("Bạn có xác nhận muốn xoá(Nhấn Y để xác nhận):");
            String checkConfirm = nhapXuatDB.msc.nextLine();
            if(checkConfirm.equals("Y")){
                listDB.remove(timKiemSDT(sdt));
                System.out.println("Xoá thành công.");
                return;
            }
        }
    }
    public void timKiemSDT(){
        System.out.print("Nhập số điện thoại cần tìm kiếm hoặc họ tên:");
        String sdt= nhapXuatDB.msc.nextLine();
        for (DanhBa db : listDB){
            if(db.getSdt().contains(sdt)){
                System.out.println(db);
            }else if(db.getHoTen().contains(sdt)){
                System.out.println(db);
            }

        }
    }
    public void docDanhBa(){
        System.out.print("Bạn có chắc chặn muốn đọc từ file và xoá dữ liệu bộ nhớ đệm(Y để đồng ý)");
        String choice = nhapXuatDB.msc.nextLine();
        if(choice.equals("Y")){
            docGhiFile.doc();
        }
        return;
    }
    public void ghiDanhBa(){
        System.out.print("Bạn có chắc chặn muốn cập nhật lại file(Y để đồng ý)");
        String choice = nhapXuatDB.msc.nextLine();
        if(choice.equals("Y")){
            docGhiFile.ghi();
        }
        return;
    }
}
