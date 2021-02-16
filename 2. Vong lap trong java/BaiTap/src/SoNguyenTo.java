import java.util.Scanner;

public class SoNguyenTo {
    public static boolean kTSNT(int a){
        double sqrtNumber = Math.sqrt(a);
        for (int i = 2; i <= sqrtNumber; i++) {
            if(a % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int numbers ;
        int count = 0;
        int N = 2;
        Scanner sc = new Scanner(System.in);
        numbers = sc.nextInt();
        while(count < numbers){
            if(kTSNT(N)){
                System.out.print(N+ " ");
                count++;
            }
            N++;
        }
    }
}
