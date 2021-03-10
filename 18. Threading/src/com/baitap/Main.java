package com.baitap;

public class Main {
    public static void main(String[] args) {
        NumberGenerator trNum = new NumberGenerator();
        Thread th1 = new Thread(trNum);
        Thread th2 = new Thread(trNum);
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();

    }
}
