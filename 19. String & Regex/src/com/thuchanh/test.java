package com.thuchanh;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        System.out.println(content);
    }
}
