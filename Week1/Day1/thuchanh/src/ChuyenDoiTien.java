import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn muốn chuyển đổi:");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("Giá trị VND: "+quyDoi);
    }
}
