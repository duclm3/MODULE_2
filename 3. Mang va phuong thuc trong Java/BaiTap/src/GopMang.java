import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] Array1 = new int[]{00,10,20,30,40,50};
        int[] Array2 = new int[]{60,70,80,90,100};
        int[] concate = new int[Array1.length + Array2.length];
        //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        /*
        src là mảng bạn muốn sao chép
        srcPos là vị trí bắt đầu (chỉ số) trong mảng src
        dest là mảng cần được sao chép
        destPos là vị trí bắt đầu (chỉ số) trong  mảng dest
        length là số phần tử cần sao chép ở src
        */
        System.arraycopy(Array1, 0, concate, 0, Array1.length);
        System.arraycopy(Array2, 0, concate, Array1.length,Array2.length);
        System.out.println("Array1: " + Arrays.toString(Array1));
        System.out.println("Array2: " + Arrays.toString(Array2));
        System.out.println("Concatenated Array: " + Arrays.toString(concate));
    }
}
