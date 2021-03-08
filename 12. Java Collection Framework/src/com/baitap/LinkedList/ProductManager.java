package com.baitap.LinkedList;

import com.baitap.Interface.Manager;

import java.util.*;


public class ProductManager implements Manager<Product> {
    private List<Product> listPro;
    private ProductInputAndOuput proIO;

    public ProductManager() {
        proIO = new ProductInputAndOuput();
        this.listPro = new LinkedList<>();
    }

    @Override
    public  boolean add() {
        Product product = proIO.inputProduct("CREATE_EDIT_PRO");
        if(searchById(product.getId())==-1){
            listPro.add(product);
            return true;
        }
        System.out.println("Không thể thêm mới sp này");
        return false;
    }

    @Override
    public boolean edit() {
        Product pro = proIO.inputProduct("CREATE_EDIT_PRO");
        if(searchById(pro.getId())!=-1){
            listPro.get(pro.getId()).setName(pro.getName());
            listPro.get(pro.getId()).setPrice(pro.getPrice());
            return true;
        }
        System.out.println("Không thể chỉnh sửa sp này!");
        return false;
    }
    @Override
    public boolean delete() {
        Product pro = proIO.inputProduct("DELETE_PRO");
        if(searchById(pro.getId())!=-1){
            listPro.remove(searchById(pro.getId()));
            return true;
        }
        System.out.println("Không thể xoá sp này");
        return false;
    }
    @Override
    public int searchById(int id) {
        for (int i = 0; i < listPro.size(); i++) {
            if(listPro.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        Collections.sort(listPro);
    }

    @Override
    public void searchByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm:");
        String name = sc.nextLine();
        List<Product> myList =  new ArrayList<>();
        for (int i = 0; i < listPro.size(); i++) {
            if(listPro.get(i).getName().contains(name)){
                myList.add(listPro.get(i));
            }
        }
        for (Product pro : myList){
            System.out.println(pro);
        }
    }

    @Override
    public Product getById(int id) {
        if(searchById(id)!=-1){
            return listPro.get(searchById(id));
        }
        return null;
    }
    @Override
    public void display() {
        for (Product pro : listPro){
            System.out.println(pro);
        }
    }
}
