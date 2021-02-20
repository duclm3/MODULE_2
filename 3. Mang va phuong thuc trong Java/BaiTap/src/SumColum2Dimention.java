public class SumColum2Dimention {
    public static void sumOfEachColum(int[][] a){
        int maxColum = 0;
        for (int i = 0; i < a.length; i++) {
            if(maxColum < a[i].length){
                maxColum = a[i].length;
            }
        }
        for (int colum = 0; colum < maxColum; colum++) {
            int total = 0;
            for (int row = 0; row < a.length; row++) {
                try {
                    total += a[row][colum];
                }catch (Exception e){
                    continue;
                }
            }
            System.out.println(total);
        }
    }
    public static void sumCollumX(int[][] a,int x){
        int total = 0;
        for (int row = 0; row < a.length; row++) {
            try {
                total += a[row][x];
            }catch (Exception e){
                continue;
            }
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int[][] dimenArr = {
                {9, 11, 10},
                {2,  0,  9,  1},
                {1,  0,  7, 10},
                {0,  1}
        };
        sumOfEachColum(dimenArr);
        sumCollumX(dimenArr,1);
    }
}
