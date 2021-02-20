public class TotalDiagonal2DimenArray {
    public static void main(String[] args) {
        int[][] dimenArr = {
                {9, 11, 9},
                {2,  1,  9},
                {1,  0,  7}
        };
        int total = 0;
        int total1 = 0;
        for (int row = 0; row < dimenArr.length; row++) {
            total += dimenArr[row][row];
            total1+= dimenArr[row][dimenArr.length - 1 - row];
        }
        System.out.println("Tổng đường chéo chính:"+total);
        System.out.println(total1);
    }
}
