package com.BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(5,"red",6);
        System.out.println(cy.volume());

        System.out.println(cy.toString());
        Point2D p2 = new Point2D(10,1);
        System.out.println(p2);
        Point2D p3 = new Point3D(4,5,6);
        System.out.println(p3);
        System.out.println(p3.getXY()[1]);
        Point3D p4 =  new Point3D(1,2,3);
        System.out.println(p4);
        System.out.println(p4.getXYZ()[2]);

        MoveablePoint mv = new MoveablePoint(4,5,6,7);
        System.out.println(mv);
        mv.move();
        System.out.println(mv);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào màu và độ dài 3 cạnh của tam giác:");

        Triangle triangle = new Triangle(sc.nextLine(),true,sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println(triangle);
    }
}

