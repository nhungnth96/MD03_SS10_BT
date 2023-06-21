package BT11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random()*100);
            numberList.add(i,number);
        }
        System.out.println(numberList);
        int min = Collections.min(numberList);
        System.out.println(min);
    }
}
