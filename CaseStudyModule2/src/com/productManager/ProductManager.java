package com.productManager;

import com.Interface.IManagerProduct;

import java.util.*;

public class ProductManager implements IManagerProduct<Product> {
    public static final int NOT_FOUND_PRO = -1;
    static List<Product> productList ;
    static ProductInputAndOuput proIO;
    static FileIOProduct fileIO;
    public static void withStatic(){
        System.out.println("a");
    }
    static{
        fileIO = new FileIOProduct();
        productList = new ArrayList<Product>();
        proIO = new ProductInputAndOuput();
        productList.add(new Product("1","Product1",10,100,"This is product1 "));
        productList.add(new Product("2","Product2",11,100,"This is product2 "));
        productList.add(new Product("3","Product3",0,100,"This is product3 "));
        productList.add(new Product("4","Product4",9,100,"This is product4 "));
        productList.add(new Product("5","Product5",15,100,"This is product5 "));
        productList.add(new Product("6","Product1",3,100,"This is product1 "));
        productList.add(new Product("7","Product2",2,100,"This is product2 "));
        productList.add(new Product("8","Product3",4,100,"This is product3 "));
        productList.add(new Product("9","Product4",20,100,"This is product4 "));
        productList.add(new Product("10","Product5",11,100,"This is product5 "));
    }

    public ProductManager(){ }

    public int searchById(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        Product product = proIO.inputProduct("ADD");
        if(searchById(product.getId())== NOT_FOUND_PRO){ //Nếu chưa tồn tại thì thêm mới và thoát
            product.addImportDate(product.getAmount());
            productList.add(product);
            return;
        }
        if (searchById(product.getId())!= NOT_FOUND_PRO){ //Nếu tồn tại rồi thì tăng số sl nếu muốn
            System.out.print("Sản phẩm này đã tồn tại, bạn có muốn thêm số lượng(Gõ Y để đồng ý):");
            String userChoice = sc.nextLine();
            if(userChoice.equals("Y")){
                int newAmout = proIO.inputAmout();
                int oldAmout = productList.get(searchById(product.getId())).getAmount();
                productList.get(searchById(product.getId())).setAmount(oldAmout+newAmout);//Cập nhật số lượng mới
                productList.get(searchById(product.getId())).addImportDate(newAmout); //Thêm ngày mới và sl nhập mới
                System.out.println("Cập nhật số lượng thành công.");
            }else {
                return;
            }
        }
    }

    public void edit() {
        String inputid = proIO.inputId();//Nhập mã sản phẩm đề tìm kiếm
        inputid = checkIdAndContinueOrNot(inputid);
        if(inputid.equals(null)){return;}
        System.out.println("-----Đã tìm thấy sản phẩm,hãy cập nhật sp-----");
        Product pro = proIO.inputProduct("EDIT");
        int index = searchById(inputid);
        String amountChoice = importExportChoice();
        if(amountChoice.equals("2")){ /*Người dùng chọn xuất*/
            if( pro.getAmount() >  productList.get(index).getAmount() ){ /*Số lượng xuất > số lượng có sẵn*/
                System.out.println("Số lượng xuất không được lớn hơn số lượng có sẵn.");
                return;
            }
            productList.get(index).addImportDate(- pro.getAmount());
            pro.setAmount(pro.getAmount()*(-1));
        }else if(amountChoice.equals("1")){ /*Người dùng chọn nhập*/
            productList.get(index).addImportDate(pro.getAmount());
        }else {return;}
        productList.get(index).setName(pro.getName());
        productList.get(index).setPrice(pro.getPrice());
        productList.get(index).setAmount(pro.getAmount() +  productList.get(index).getAmount());
        productList.get(index).setDescription(pro.getDescription());
        System.out.println("Cập nhật thành công.");
    }

    public void delete() {
        String inputid = proIO.inputId();//Nhập mã sản phẩm đề tìm kiếm
        inputid = checkIdAndContinueOrNot(inputid);
        if(inputid.equals(null)){return;}
        if(searchById(inputid)!= NOT_FOUND_PRO){
            System.out.print("Bạn có xác nhận muốn xoá(Nhấn Y để xác nhận):");
            String checkConfirm = proIO.msc.nextLine();
            if(checkConfirm.equals("Y")){
                productList.remove(searchById(inputid));
                System.out.println("Xoá thành công.");
                return;
            }
        }
    }

    public void displayProduct() {
        Scanner sc = new Scanner(System.in);
        int count  = 0;
        for (int i = 0; i < productList.size(); i++,count++) {
            if(count <= 4){
                System.out.println("---------------------");
                System.out.println("Sản phẩm thứ "+(i+1));
                System.out.println(productList.get(i));
            }else{
                String enter = sc.nextLine();
                if(enter.isEmpty()){
                    count = 0;
                }else{
                    return;
                }
            }
        }
    }

    public void displayImportDate(){
        String inputid = proIO.inputId();//Nhập mã sản phẩm đề tìm kiếm
        inputid = checkIdAndContinueOrNot(inputid);
        if(inputid.equals(null)){return;}
        System.out.println("* Danh sách ngày nhập của sản phẩm:");
        System.out.println("Id|Ngày nhập          |Số lượng nhập,xuất(-)");
        productList.get(searchById(inputid)).displayImportD();
    }

    public void sortByPrice(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1: Sắp xếp giảm dần.");
            System.out.println("2: Sắp xếp tăng dần.");
            System.out.println("3: Quay về menu chính.");
            System.out.print("Lựa chọn của bạn:");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    Collections.sort(productList);
                    displayProduct();
                    break;
                case "2":
                    Collections.sort(productList,new Product.ProductComparator());
                    displayProduct();
                    break;
                default:
                    return;
            }
        }
    }

    public void findProductMaxPrice(){
        Collections.sort(productList,new Product.ProductComparator());
        System.out.println("Sản phẩm có giá lớn nhất:");
        System.out.println(productList.get(productList.size()-1));
    }

    public void readFile(){
        productList.clear();
        productList = fileIO.readFileProduct();
        fileIO.readFileImportDate();
    }

    public void writeFile(){
        fileIO.writeToFileProduct();
        fileIO.writeFileImportDate();
    }

    /*Người dùng chọn nhập hay xuất trả về kí tự (1)nhập hoặc (2)xuất*/
    public String importExportChoice(){
        String userChoice;
        System.out.print("Chọn (1) để nhập số lượng xản phẩm,(2) để xuất,(chọn cái khác)để thoát:");
        userChoice = proIO.msc.nextLine();
        if(userChoice.equals("1")){
            return "1";
        }else if(userChoice.equals("2")){
            return "2";
        }else {return null;}
    }

    /*Lăp lại việc yêu cầu người dùng nhập đúng id để tìm kiếm,dừng khi ấn enter*/
    public String checkIdAndContinueOrNot(String inputid){
        while (searchById(inputid) == NOT_FOUND_PRO){ //Nếu không tìm thấy
            System.out.println("Không tìm được sản phẩm với mã sản phẩm trên!");
            System.out.print("Nhập lại(nhấn enter để thoát)");
            inputid = proIO.inputId();//Nhập lại id sản phẩm
            if(inputid.isEmpty()){ // Ấn enter thì dừng
                return null;
            }
        }
        return inputid;
    }
}
