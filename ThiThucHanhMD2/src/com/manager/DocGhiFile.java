package com.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public List<DanhBa> doc(){
        BufferedReader br = null;
        List<DanhBa> listdb = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("data/contacts.csv"));
            String readline = br.readLine();
            while(readline!=null){
                String [] stringProduct = readline.split(",");
                DanhBa db = new DanhBa();
                db.setSdt(stringProduct[0]);
                db.setNhom(stringProduct[1]);
                db.setHoTen(stringProduct[2]);
                db.setGioiTinh(Boolean.parseBoolean(stringProduct[3]));
                db.setDiaChi(stringProduct[4]);
                db.setNgaySinh(stringProduct[5]);
                db.setEmail(stringProduct[6]);
                listdb.add(db);
                readline = br.readLine();
            }
            br.close();
        }catch (Exception e){
            System.out.println("Không thể đọc từ file này!");
        }
        return listdb;
    }

    public void ghi(){
        BufferedWriter bw = null;
        Manager mng = new Manager();
        List<DanhBa> listdb = mng.listDB;
        try {
            bw = new BufferedWriter(new FileWriter("data/contacts.csv"));
            for (int i = 0; i < listdb.size(); i++) {
                bw.write(listdb.get(i).getSdt()+ "," +
                            listdb.get(i).getNhom() + "," +
                            listdb.get(i).getHoTen() + "," +
                            listdb.get(i).getGioiTinh() + ","+
                            listdb.get(i).getDiaChi() + ","+
                            listdb.get(i).getNgaySinh() + ","+
                            listdb.get(i).getEmail() + "\n");
            }
            bw.close();
        }catch (Exception e){
            System.out.println("Không thể ghi từ file này!");
        }
    }
}
