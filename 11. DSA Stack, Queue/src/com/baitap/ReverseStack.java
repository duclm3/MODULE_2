package com.baitap;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stackInterger =  new Stack<>();
        for (int i = 0; i < 5 ; i++) {
            stackInterger.push(10);
        }

        Stack<String> wStack  =  new Stack<>();
        String mWord = "Lê Minh Đức";
        String[] words = mWord.split("");
        String newWord = "";
        for (int i = 0; i < words.length; i++) {
            wStack.push(words[i]);
        }

        for (int i = 0; i < words.length; i++) {
            newWord += wStack.pop();
        }
        System.out.println(newWord);
    }
}
