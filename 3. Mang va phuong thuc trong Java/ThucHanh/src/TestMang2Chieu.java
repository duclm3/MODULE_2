import java.util.Arrays;

public class TestMang2Chieu {

    static void method(){
        System.out.println(1);
    }

    static void method(int x){
        System.out.println(2);
    }

    static void method(float x){
        System.out.println(3);
    }

    static void method(int x, double y){
        System.out.println(4);
    }
    static void m(int[] x) {
        x[0] = 200;
    }
    static public void f() {}
    public static void main(String[] args) {
//        int a = (int)Math.round(12 * Math.random());
//        System.out.println(a);
//        System.out.println(Math.random());
        int[] a = {50, 100};
        m(a);
        System.out.println(a[0]);
    }
}
