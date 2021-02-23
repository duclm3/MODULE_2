package com.BaiTap;

public class test {
    public static void main(String[] args) {
        double code = (double) Math.floor((Math.random() * 100)) + 1;
        System.out.println(code);
        int i= 0;
        while(i<=50){
            code = (double) Math.floor((Math.random() * 100)) + 1;
            System.out.println(code);
            i++;
        }
//        System.out.println(code);
//        System.out.println(Math.random());
    }
}
