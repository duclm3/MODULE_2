package com.testNormal;

import java.util.LinkedList;
import java.util.Scanner;

public class TestEveryThing implements Inter {
    class R{
        public  String  toString(){
            return "R";
        }
    }
    class H extends R{
        public  String  toString(){
            return "H";
        }
    }
    interface Fish{}

    class Perch implements Fish {}

    class Walleye extends Perch{ }

    class Bluegill { }
    @Override
    public void add() {

    }

    abstract class Hinh{}

    class Tron extends Hinh{}

    abstract class DaGiac extends Hinh{}

    class TamGiac extends DaGiac{}

    class ChuNhat extends DaGiac{}

    int id;
    String name;
    int age;
    public  TestEveryThing() {

    }
    static {
       
    }
    public TestEveryThing(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void test(){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if(x.isEmpty()){
            System.out.println("emty");
        }
        if(x.equals(null)){
            System.out.println("null");
        }
    }
    public static int  overLoading(){
        return 1;
    }
    public static void overLoading(int a){
        System.out.println("số 1");
    }
    public void main1(String[] a) {
        TestEveryThing pr = new TestEveryThing();
        TestEveryThing pr11 = new TestEveryThing(1,"a",1);
        System.out.println("aaa");
    }

    public static void main(String[] args) {
       LinkedList<Integer> x = new LinkedList<>();
//       x.offer(1);
       x.offer(2);
       x.offer(3);
       int va = x.poll();
        System.out.println(va);
    }
}
