package com.manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager mng = new Manager();
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status){
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẦM-----");
            System.out.println("Chọn chức năng theo số(để tiếp tục)");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng:");
            String userChoice = sc.nextLine();
            switch (userChoice) {
                case "1":
                    mng.xemDanhSach();
                    break;
                case "2":
                    mng.themDanhBa();
                    break;
                case "3":
                    mng.suaDanhBa();
                    break;
                case "4":
                    mng.xoaDanhBa();
                    break;
                case "5":
                    mng.timKiemSDT();
                    break;
                case "6":
                    mng.docDanhBa();
                    break;
                case "7":
                    mng.ghiDanhBa();
                    break;
                case "8":
                    status=false;
                    break;
                default:
                    System.out.println("Không có chức năng này");
                    break;
            }
        }
    }
}
