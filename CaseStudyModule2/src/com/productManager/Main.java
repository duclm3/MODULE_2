package com.productManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager prm = new ProductManager();
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status){
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẦM-----");
            System.out.println("Chọn chức năng theo số(để tiếp tục)");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tìm sản phẩm có giá đắt nhất");
            System.out.println("7. Đọc từ file");
            System.out.println("8. Ghi vào file");
            System.out.println("9. Xem danh ngày nhập,xuất sản phẩm theo ID.");
            System.out.println("10. Thoát");
            System.out.print("Chọn chức năng:");
            String userChoice = sc.nextLine();
            switch (userChoice) {
                case "1":
                    prm.displayProduct();
                    break;
                case "2":
                    prm.add();
                    break;
                case "3":
                    prm.edit();
                    break;
                case "4":
                    prm.delete();
                    break;
                case "5":
                    prm.sortByPrice();
                    break;
                case "6":
                    prm.findProductMaxPrice();
                    break;
                case "7":
                    prm.readFile();
                    break;
                case "8":
                    prm.writeFile();
                    break;
                case "9":
                    prm.displayImportDate();
                    break;
                case "10":
                    status=false;
                    break;
                default:
                    System.out.println("Không có chức năng này");
                    break;
            }
        }
    }
}
