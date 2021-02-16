public class TestTamGiac {
    public static void main(String[] args) {
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles:\n"+
                "top-left, top-right, botton-left, botton-right");//Tam giác
        for (int i = 1; i <= 5; i++) { //br
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");//in ra khoảng trắng và khoảng cách "__"
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {//bl
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) { //tl
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {//tr
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) { // cân
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");//in ra khoảng trắng và khoảng cách "__"
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
