package com.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLopHoc {
    public static final String CLASS_REGEX = "[ACP][0-9]{4}[GHIKLM]";
    public static void main(String[] args) {
        String testString = "C0318G4";
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(testString);
        System.out.println(matcher.matches());
    }
}

