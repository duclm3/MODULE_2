package com.BaiTap;

public class InterfaceColorableTest {
    public static void main(String[] args) {
        Shape[] re = {new Circle(2.5),new Rectangle(3,4),new Square(5)};
        for (int i = 0; i < re.length; i++) {
            if(re[i] instanceof Square){
                ((Square)re[i]).howToColor();
            }
        }
    }
}
