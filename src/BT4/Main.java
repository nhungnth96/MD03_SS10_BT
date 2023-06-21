package BT4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Tôi thấy hoa vàng trên cỏ xanh";
        List<String> strList = new ArrayList<>();
        String[] convertStr = str.split(" ");
        System.out.println(Arrays.toString(convertStr));
        for (int i = 0; i < convertStr.length; i++) {
            strList.add(convertStr[i]);
        }
        System.out.println(strList);
        for (int i = 0; i < strList.size(); i++) {
            if(strList.get(i).length()>3){
                System.out.println(strList.get(i));
            }
        }

    }
}
