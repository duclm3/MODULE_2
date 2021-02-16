public class SNTNhoHon100 {
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
        for (int i = 2; i < 100 ; i++) {
            if(kTSNT(i)){
                System.out.print(i + " ");
            }
        }
    }
}
