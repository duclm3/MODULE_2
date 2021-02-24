package com.ThucHanh;


public class A {
    static int u = 1;
    static public class B {
    }

    public class C {
    }

    public static void main(String[] args) {

        A.B o1 = new A.B();

        A.u = 2;
        A.C o2 = new A().new C();
    }
}