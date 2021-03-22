package com.productManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileIOProduct {
    public List<Product> readFileProduct(){
        BufferedReader br = null;
        List<Product> listPro = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("data/product.csv"));
            String readline = br.readLine();
            while(readline!=null){
                String [] stringProduct = readline.split(",");
                Product product = new Product();
                product.setId(stringProduct[0]);
                product.setName(stringProduct[1]);
                product.setPrice(Double.parseDouble(stringProduct[2]));
                product.setAmount(Integer.parseInt(stringProduct[3]));
                product.setDescription(stringProduct[4]);
                listPro.add(product);
                readline = br.readLine();
            }
            br.close();
        }catch (Exception e){
            System.out.println("Không thể đọc từ file này!");
        }
        return listPro;
    }

    public void writeToFileProduct(){
        BufferedWriter bw = null;
        ProductManager prm = new ProductManager();
        List<Product> listPro = prm.productList;
        try {
            bw = new BufferedWriter(new FileWriter("data/product.csv"));
            for (int i = 0; i < listPro.size(); i++) {
                bw.write(listPro.get(i).getId()+ "," +
                             listPro.get(i).getName() + "," +
                             listPro.get(i).getPrice() + "," +
                             listPro.get(i).getAmount() + ","+
                             listPro.get(i).getDescription() + "\n");
            }
            bw.close();
        }catch (Exception e){
            System.out.println("Không thể ghi từ file này!");
        }
    }

    public void writeFileImportDate(){
        BufferedWriter bw = null;
        ProductManager prm = new ProductManager();
        List<Product> listPro = prm.productList;
        try {
            bw = new BufferedWriter(new FileWriter("data/importDate.csv",true));
            for (int i = 0; i < listPro.size(); i++) {
                for(Map.Entry<LocalDateTime,Integer> entry : listPro.get(i).getImportDate().entrySet()){
                    bw.write(listPro.get(i).getId() +"," +entry.getKey() + "," + entry.getValue()+"\n");
                }
            }
            bw.close();
        }catch (Exception e){
            System.out.println("Không thể ghi từ file này!");
        }
    }

    public void readFileImportDate(){
        BufferedReader br = null;
        //Khởi tại lại importDate  ứng với mỗi sản phẩm
        for (int i = 0; i < ProductManager.productList.size(); i++) {
            ProductManager.productList.get(i).setImportDate(new HashMap<>());
        }
        try {
            br = new BufferedReader(new FileReader("data/importDate.csv"));
            //Duyệt qua mảng productlist
            for (int i = 0; i < ProductManager.productList.size(); i++) {
                String readline = br.readLine();
                while(readline!=null){ //Tại thằng thứ i product đọc từ đầu đến cuối ,rồi lại chuyển sang thằng tiếp theo cũng lại đọc từ đầu đến cuối
                    String [] stringProduct = readline.split(",");
                    if(stringProduct[0].equals(ProductManager.productList.get(i).getId())){ //Đọc từ file thấy id ứng với thằng id nào thì thêm mới thằng importDate đó
                       LocalDateTime dateTime = LocalDateTime.parse(stringProduct[1]);
                       ProductManager.productList.get(i).addFromFileImportDate(dateTime,Integer.parseInt(stringProduct[2]));
                    }
                    readline = br.readLine();
                }
                br = new BufferedReader(new FileReader("data/importDate.csv"));
            }
            br.close();
        }catch (Exception e){
            System.out.println("Không thể đọc từ file này!");
        }
    }
}
