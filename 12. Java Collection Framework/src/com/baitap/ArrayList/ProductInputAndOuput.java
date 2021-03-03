package com.baitap.ArrayList;

import java.util.Scanner;

public class ProductInputAndOuput {
    public static final String CREATE_EDIT_PRO = "CREATE_EDIT_PRO";
    public static final String DELETE_PRO = "DELETE_PRO";
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
    public boolean checkNameHaveNumberOrNot(String string){
        if(string == null){
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                return false;
            }
        }
        return true;

    }
    public Product inputProduct(String statusInputPro) {
        Scanner sc = new Scanner(System.in);
        String id = "",name = "",price = "";
        Product product;
        do {
            System.out.println("Id:");
            id = sc.nextLine();
            if(statusInputPro == CREATE_EDIT_PRO){
                System.out.println("Name:");
                name = sc.nextLine();
                System.out.println("Price:");
                price = sc.nextLine();
                if(isInteger(id) && isNumber(price) && checkNameHaveNumberOrNot(name)){
                    product = new Product(Integer.parseInt(id),name,Double.parseDouble(price));
                    break;
                }else{
                    System.out.println("Các thông tin nhập chưa đúng mời nhập lại:");
                }
            }else{ //DELETE_PRO
                if(isInteger(id)){
                    product = new Product(Integer.parseInt(id),"",0);
                    break;
                }else{
                    System.out.println("Các thông tin nhập chưa đúng mời nhập lại:");
                }
            }

        }while(true);
        return product;
    }

    public static void main(String[] args) {
        ProductInputAndOuput pr = new ProductInputAndOuput();
        System.out.println(pr.checkNameHaveNumberOrNot(""));
    }

}
