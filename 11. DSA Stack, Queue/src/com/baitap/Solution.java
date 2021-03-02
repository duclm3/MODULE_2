package com.baitap;

import java.io.Console;

public class Solution {
    public static void enQueue(Queue q,int x){
        Node temp = new Node();
        temp.data = x;
//        System.out.println("temp.link:"+temp.link);
        if(q.front == null){
            q.front = temp;
            System.out.println("front.link:"+q.front.link );
            System.out.println("temp.link:"+temp.link);
        }else {
            q.rear.link = temp;
        }

        System.out.println("front.link:"+q.front.link );
        q.rear = temp;
        System.out.println("front.link:"+q.front.link );
        q.rear.link = q.front;
        System.out.println("front.link:"+q.front.link );
        System.out.println("temp.link:"+temp.link);
    }
    public static void deQueue(Queue q){
        if(q.front == null){
            System.out.println("Queue is empty");
            return;
        }
        int value = 0;
        if(q.front == q.rear){
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }else {
            Node node = q.front;
            value = q.front.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        System.out.printf("Deleted value = %d",value);
    }
    public static void displayQueue(Queue q){
        Node  temp = q.front;
        System.out.printf("Elements in Circular Queue are: ");
        while (temp.link != q.front)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data );
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a queue and initialize
        // front and rear
        Queue q = new Queue();
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);
        enQueue(q, 6);


        displayQueue(q);
        deQueue(q);
        displayQueue(q);

        // Deleting elements from Circular Queue
//        System.out.println("Deleted value = {0:D}",deQueue(q));
//        Console.Write("Deleted value = {0:D}",deQueue(q));
//
//        // Remaining elements in Circular Queue
//        displayQueue(q);
//
//        enQueue(q, 9);
//        enQueue(q, 20);
    }
}
