package com.baitap;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        FileWriter target = null;
        try {
            File fileSource = new File("source.txt");
            File fileTarget = new File("target.txt");
            if(!fileSource.exists()){
                System.out.println("Chưa tồn tại file source.");
            }
            if(fileTarget.exists()){
                System.out.println("File target đã tồn tại.");
            }
            target = new FileWriter(fileTarget,true);
            BufferedReader bfSource = new BufferedReader(new FileReader(fileSource));
            String writeLine = bfSource.readLine();//đọc dòng đầu
            while(writeLine!=null){
                target.write(writeLine + "\n");
                writeLine = bfSource.readLine();
            }
            bfSource.close();
            target.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
