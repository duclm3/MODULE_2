public class MinArray {
    public static void main(String[] args) {
        int[] a = {13,8,2,4,0,10,-1};
        int min = a[0];
        for (int i = 0; i <a.length ; i++) {
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
