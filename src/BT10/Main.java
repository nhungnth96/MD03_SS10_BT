package BT10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random()*100);
            numberList.add(i,number);
        }
        System.out.println(numberList);

        int sum = 0;
        for(Integer number:numberList){
           sum+= number;
        }
        System.out.println(sum);
    }
    }

