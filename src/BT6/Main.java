package BT6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numberList = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
//        System.out.println(numberList);

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.round(Math.random() * 100);
            numberList.add(i, number);
        }
        System.out.println(numberList);
        int size = numberList.size();
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (numberList.get(j)> numberList.get(j+1)) {
                    // swap arr[j+1] và arr[i]
                    int temp = numberList.get(j);
                    numberList.set(j,numberList.get(j+1));
                    numberList.set(j+1,temp);
                }
        System.out.println(numberList);
    }
}


