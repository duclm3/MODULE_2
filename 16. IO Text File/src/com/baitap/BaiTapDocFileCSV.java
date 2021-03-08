package com.baitap;

import java.io.BufferedReader;
import java.io.FileReader;

public class BaiTapDocFileCSV {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("nation.csv"));
            String readline = bf.readLine();
            while(readline!=null){
                String [] nation = readline.split(",");
                System.out.print(nation[nation.length -1] +" ");
                readline = bf.readLine();
            }
            bf.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
