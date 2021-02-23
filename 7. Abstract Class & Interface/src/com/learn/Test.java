package com.learn;
abstract class Hinh{}

class Tron extends Hinh{}

abstract class DaGiac extends Hinh{}

class TamGiac extends DaGiac{}

class ChuNhat extends DaGiac{}
abstract class Parent{
    protected abstract void method1();
    //private abstract void method(); //private sai vì nếu đã private không cho truy cập nên ko được phép tồn tại
    public abstract void method2();
}
public class Test {
    public static void main(String[] args) {
        //Đa hình dùng kiểu dữ liệu tra để chỏ đến thằng con
        //Đa hình áp dụng khi 1 class con có 1 class cha
        Hinh h1 = new Tron();

        Hinh h2 = new TamGiac();

        Hinh h3 = new ChuNhat();

        Hinh h5 = h1;

        h2 = h3;

        Tron h6 = (Tron)h1;
    }
}
