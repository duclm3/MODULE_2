package com.ThucHanh;

public class A {
    static public class B {
    }

    public class C {
    }

    public static void main(String[] args) {
        //A.C o = new A.C();

        //A.B o = new A.B();


        A.C o = new A().new C();
    }
}
