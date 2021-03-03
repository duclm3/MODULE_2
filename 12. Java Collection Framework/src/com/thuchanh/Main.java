package com.thuchanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        //Phương thức entrySet( ) được khai báo bởi Map Interface trả về một Set chứa các Map Entry.
        //Một cặp (K,V) là một đối tượng trong set
        // Mỗi phần tử Set này là một đối tượng Map.Entry trong Java.
        //Một Entry bao gồm K và V
        System.out.println(studentMap);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        //Các điểm quan trọng về lớp HashSet trong java là:
        //HashSet chỉ chứa các phần tử duy nhất.
        //HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm (hash table).
        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }

    }
}
