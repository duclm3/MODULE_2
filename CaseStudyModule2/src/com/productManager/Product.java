package com.productManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private double price;
    private int amount;
    private String description;
    private Map<LocalDateTime,Integer> importDate;

    public Map<LocalDateTime, Integer> getImportDate() {
        return importDate;
    }

    public void setImportDate(Map<LocalDateTime, Integer> importDate) {
        this.importDate = importDate;
    }

    public void addImportDate(int amout){
        importDate.put(LocalDateTime.now(),amout);
    }
    public void addFromFileImportDate(LocalDateTime lcd,int amout){
            importDate.put(lcd,amout);
    }

    public Product() {}

    public Product(String id, String name, double price, int amount, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.description = description;
        importDate = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayImportD(){
        for(Map.Entry<LocalDateTime,Integer> entry : importDate.entrySet()){
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formatDateTime = entry.getKey().format(format);
            System.out.println(getId()+"|"+formatDateTime+"|" + entry.getValue());
        }
    }

    @Override
    public String toString(){
        return "Mã sản phẩm:" + id +"\n" +
                "Tên:" + name + "\n" +
                "Giá:" + price + "\n" +
                "Số lượng:" + amount + "\n" +
                "Mô tả:" + description;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(o.getPrice(),this.getPrice());
    }
    static class ProductComparator implements Comparator<Product>{
        @Override
        public int compare(Product p1, Product p2)
        {
            return Double.compare(p1.getPrice(),p2.getPrice());
        }
    }
}
