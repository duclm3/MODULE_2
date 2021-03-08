package com.thuchanh;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(0,-9,1);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}
