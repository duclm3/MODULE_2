package com.test;

public  class learn {
    static public int X = 2;
    static public int Y = 2;

    static {
        X = 1;
    }

    static public void method() {
        X = 5;
    }

    public static void main(String[] args) {
        learn o = new learn();
        learn.method();
        learn.X = 10;
        System.out.printf("x=%d, y=%d", o.X, learn.X);
    }
}
