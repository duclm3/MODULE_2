package com.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSDT {
    public static final String PHONENUMBER_REGEX = "\\d{2}[0]{1}\\d{9}";
    public static void main(String[] args) {
        String testString = "0409119648";
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(testString);
        System.out.println(matcher.matches());
    }
}
