import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int so = sc.nextInt();
        String[] soThanhChu = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "" +
                "Chín"};
        if (so < 10) {
            System.out.println(soThanhChu[so]);
        } else if (so < 100) {
            int hangChuc = so / 10;
            int hangDonVi = so % 10;
            if (hangChuc == 1) {
                if (hangDonVi == 0) {
                    System.out.println("Mười");
                } else if (hangDonVi == 5) {
                    System.out.println("Mười Lăm");
                } else {
                    System.out.println("Mười " + soThanhChu[hangDonVi]);
                }
            } else {
                if (hangDonVi == 0) {
                    System.out.println(soThanhChu[hangChuc] + " mươi");
                }else if(hangDonVi == 1){
                    System.out.println(soThanhChu[hangChuc] + "mốt");
                }else if (hangDonVi == 5){
                    System.out.println(soThanhChu[hangChuc] + "lăm");
                }else {
                    System.out.println(soThanhChu[hangChuc] + " mươi " + soThanhChu[hangDonVi]);
                }
            }
        }else if(so - 100 >=0){
            int hangTram = so / 100;
            int hangChuc = so % 100 / 10;
            int hangDonVi = so % 100 % 10;
            System.out.println("Hàng trăm:"+hangTram );
            System.out.println("Hàng chục:"+hangChuc );
            System.out.println("Hàng đơn vị:"+hangDonVi );
            if (hangChuc == 1) {
                if (hangDonVi == 0) {
                    System.out.println(soThanhChu[hangTram] + " Trăm Mười");
                } else if (hangDonVi == 5) {
                    System.out.println(soThanhChu[hangTram] + "Trăm Mười Lăm");
                } else {
                    System.out.println(soThanhChu[hangTram] + "Trăm Mười " + soThanhChu[hangDonVi]);
                }
            }else if(hangChuc == 0 && hangDonVi == 0){
                System.out.println(soThanhChu[hangTram] + "Trăm");
            }else if(hangChuc == 0){
                System.out.println(soThanhChu[hangTram] + "Trăm Linh"+ soThanhChu[hangDonVi]);
            }else {

                if (hangDonVi == 0) {
                    System.out.println(soThanhChu[hangTram] + " Trăm" + soThanhChu[hangChuc] + " mươi");
                }else if(hangDonVi == 1){
                    System.out.println(soThanhChu[hangTram] + " Trăm" + soThanhChu[hangChuc] + "mốt");
                }else if (hangDonVi == 5){
                    System.out.println(soThanhChu[hangTram] + " Trăm" + soThanhChu[hangChuc] + "lăm");
                }else {
                    System.out.println(soThanhChu[hangTram] + " Trăm" + soThanhChu[hangChuc] + " mươi " + soThanhChu[hangDonVi]);
                }
            }
        }
    }

}
