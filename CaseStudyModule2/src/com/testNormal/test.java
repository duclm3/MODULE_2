package com.testNormal;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static final String VIETNAM_REGEX = "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s|_]+$";
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("I am a string 5959");
        boolean b = m.find();
        if(Pattern.matches(VIETNAM_REGEX,"Lwaaw 032322")){
            System.out.println("Đúng");
        }
//        if (b)
//            System.out.println("There is a special character in my string");
//        if(!Pattern.matches("^[a-zA-Z0-9 ]*$","")){
//            System.out.println("aaa");
//        }else{
//            System.out.println("Loi");
//        }
//        String a = "     sdasd          asdasdas           đâs     ";
//        System.out.println(a.replaceAll("\\s{2,}"," "));
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        // 1. using Iterator
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        // 2. For-each Loop
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

    }
}
