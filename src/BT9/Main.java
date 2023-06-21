package BT9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        List<Integer> nonDuplicateList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random()*100);
            numberList.add(i,number);
        }
        System.out.println(numberList);
        for(Integer number:numberList){
            if(!nonDuplicateList.contains(number)){
                nonDuplicateList.add(number);
            }
        }
        System.out.println(nonDuplicateList);

    }
}
