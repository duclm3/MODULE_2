import java.util.Arrays;

public class InsertElement {

    public static int[] insertElement(int[] a,int x,int index){
        if(index < 0 || index > a.length){
            System.out.println("Không chèn được phần tử vào mảng.");
        }else{
            int[] newarr = new int[a.length+1];
            for (int i = 0; i < a.length; i++) {
                newarr[i] = a[i];
            }
            for (int i = newarr.length-1; i > index ; i--) {
                newarr[i] = newarr[i-1];
            }
            newarr[index] = x;
            return newarr;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,1};
        a = insertElement(a,10,11);
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
