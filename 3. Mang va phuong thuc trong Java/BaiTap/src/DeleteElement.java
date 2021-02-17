import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static int[] deleteElement(int[] n,int X){
        int i ;
        int leng = n.length;
        for (i = 0; i < n.length; i++) {
            while (X == n[i]){
                for (int j = i; j < n.length-1; j++) {
                    n[j] = n[j+1];
                }
                n = Arrays.copyOf(n, n.length - 1);
                if(n[n.length-1]==X){
                    n = Arrays.copyOf(n, n.length - 1);
                    break;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,1,2,1,3,10,1,10,1,1,1};
        a = deleteElement(a,1);
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
