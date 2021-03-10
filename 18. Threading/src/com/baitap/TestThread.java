package com.baitap;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread o = new OddThread();
        EvenThread e = new EvenThread();
        Thread tho = new Thread(o);
        Thread the = new Thread(e);
        tho.start();
        tho.join();
        the.start();
    }
}
