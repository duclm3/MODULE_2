package com.baitap.ArrayList;

import java.util.Scanner;

public class ProductInputAndOuput {
    public static final String CREATE_EDIT_PRO = "CREATE_EDIT_PRO";
    public static final String DELETE_PRO = "DELETE_PRO";
    private Scanner msc;
    public ProductInputAndOuput(){
        msc =  new Scanner(System.in);
    }
    public static boolean isInteger(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public boolean checkNameHaveNumberOrNot(String string){ //Tên không có số
        if(string == null){
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                return true;
            }
        }
        return false;
    }
    public Product inputProduct(String statusInputPro){
        int id; String name; double price; Product product =null;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Id:");
                id = Integer.parseInt(sc.nextLine());
                if(statusInputPro == CREATE_EDIT_PRO){ // CREATE_EDIT_PRO
                    System.out.print("Name:");
                    name = sc.nextLine();
                    if(checkNameHaveNumberOrNot(name)){
                        throw new Exception();//Lỗi tên có số
                    }
                    System.out.print("Price:");
                    price = Double.parseDouble(sc.nextLine());
                    if(!checkNameHaveNumberOrNot(name)){
                        product = new Product(id,name,price);
                        break;
                    }
                }else{ //DELETE_PRO
                    product = new Product(id,null,0);
                    break;
                }
            }catch (Exception e){
                System.out.println("Thông tin nhập chưa đúng mời nhập lại:");
            }
        }while(true);
        return product;
    }
}
