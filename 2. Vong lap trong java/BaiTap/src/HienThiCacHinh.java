import java.util.Scanner;


public class HienThiCacHinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle"); //hcn
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles:\n"+
                               "\t \t \t \t"+"top-left, top-right, botton-left, botton-right)");//Tam giác
        System.out.println("3. Print isosceles triangle"); //Tam giác cân
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        while(choice!= 0) {
            switch (choice) {
                case 1: //Hình chữ nhật
                    for (int i = 1; i <=3 ; i++) {
                        for (int j = 1; j <=7 ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    choice = input.nextInt();
                    break;
                case 2: //Tam giác
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
                    choice = input.nextInt();
                    break;
                case 3://Tam giác cân
                    for (int i = 1; i <= 5; i++) { // cân
                        for (int j = i; j <= 4; j++) {
                            System.out.print("  ");//in ra khoảng trắng và khoảng cách "__"
                        }
                        for (int j = 1; j <= 2*i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    choice = input.nextInt();
                    break;
                case 4://Thoát
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    choice = input.nextInt();
            }
        }

    }
}
