public class Test {
    public static void main(String[] args) {
       int[] x = new int[10];
        System.out.println(x[9]);

        int[] k = {};
        System.out.println(k);
        add(1,"1");
        add1(1,"1");
    }
    public static void add(int i,String k){
        System.out.println("1");
    }
    public static void add(int i,int k){
        System.out.println("2");
    }

    public static void add1(int i,String k){
        System.out.println("add1");
    }

}
