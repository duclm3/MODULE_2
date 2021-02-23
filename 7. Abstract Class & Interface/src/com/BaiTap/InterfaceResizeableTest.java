package com.BaiTap;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Shape[] re = {new Circle(2.5),new Rectangle(3,4),new Square(5)};
        for (int i = 0; i < re.length; i++) {
            ((Resizeable)re[i]).resize(Math.floor((Math.random() * 100)) + 1);
        }
    }
}
