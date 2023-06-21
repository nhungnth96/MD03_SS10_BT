package BT2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random()*100);
            numberList.add(i,number);
        }
        System.out.println("Original list: "+numberList);
        List<Integer> reverseList = new ArrayList<>();
        for (int i = numberList.size()-1; i >= 0 ; i--) {
            reverseList.add(numberList.get(i));
        }
        System.out.println("Reverse list: "+reverseList);
    }
}
