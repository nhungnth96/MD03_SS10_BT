package BT5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Tôi thấy 1 hoa vàng trên cỏ xanh";
        List<String> strList = new ArrayList<>();
        String[] convertStr = str.split(" ");
        for (int i = 0; i < convertStr.length; i++) {
            strList.add(convertStr[i]);
        }
        System.out.println(strList);
        String min = strList.get(0);
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.length() < min.length()) {
                min = element;
                System.out.println(element);
            }
        }

    }
}

