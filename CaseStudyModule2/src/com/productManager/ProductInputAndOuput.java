package com.productManager;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ProductInputAndOuput {
    public Scanner msc;
    public static final String VIETNAM_REGEX = "^[a-zA-Z0-9ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s|_]+$";
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

    public String inputId(){
        System.out.print("Mã sản phẩm:");
        String input = msc.nextLine() ;int inputInteger;
        if(input.isEmpty())//Nếu người dùng ấn enter return lại ""
            return "";
        try {
           inputInteger = Integer.parseInt(input);//Ép kiểu để kt xem input có phải số nguyên
        }catch (Exception e){
            return "ERROR";//Nếu ép kiểu sai
        }
        return input;
    }

    public int inputAmout(){
        int inputamout =0;
        do {
            System.out.print("Nhập số lượng:");
            try {
                inputamout = Integer.parseInt(msc.nextLine());
                if(inputamout <=0){throw new Exception();}
                break;
            }catch (Exception e){
                System.out.println("Số lượng sản phẩm phải là số nguyên dương > 0.");
            }
        }while (true);
        return inputamout;
    }

    public Product inputProduct(String status){
        int id = 0; String name; double price; int amount;String description;
        Product product = null;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                if(!status.equals("EDIT")){
                    System.out.print("Mã sản phẩm:");
                    id = Integer.parseInt(sc.nextLine());
                }
                System.out.print("Tên:");
                name = sc.nextLine();
                if(name.trim().length() <=0 || !Pattern.matches(VIETNAM_REGEX,name)) {throw new Exception();}
                name.replaceAll("\\s{2,}"," ").trim();
                System.out.print("Giá:");
                price = Double.parseDouble(sc.nextLine());
                System.out.print("Số lượng:");
                amount = Integer.parseInt(sc.nextLine());
                System.out.print("Mô tả:");
                description = sc.nextLine();
                if(description.trim().length() <=0|| !Pattern.matches(VIETNAM_REGEX,description)) {throw new Exception();}
                description.replaceAll("\\s{2,}"," ").trim();
                product = new Product(Integer.toString(id),name,price,amount,description);
                break;
            }catch (Exception e){
                System.out.println("-------------------------------------");
                System.out.println("Thông tin nhập chưa đúng hoặc bạn đã bỏ chống,mời nhập lại:");
            }
        }while(true);
        return product;
    }


}
