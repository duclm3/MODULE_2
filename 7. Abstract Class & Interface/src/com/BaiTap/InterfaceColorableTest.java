package com.BaiTap;

public class InterfaceColorableTest {
    public static void main(String[] args) {
        Shape[] re = {new Circle(2.5),new Rectangle(3,4),new Square(5)};
        Shape[] shape =  new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Square();
        shape[2] = new Rectangle();
        for (int i = 0; i < re.length; i++) {
            if(re[i] instanceof Square){
                ((Square)re[i]).howToColor();
            }
        }
    }
}
