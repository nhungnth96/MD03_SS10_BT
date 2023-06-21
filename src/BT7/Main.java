package BT7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random()*100);
            numberList.add(i,number);
        }
        System.out.println(numberList);
        for (Integer number:numberList){
            if (number%2!=0){
                oddList.add(number);
            }
        }
        System.out.println(oddList);
    }
}
