package BT14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrCol = new ArrayList<>(); // cột dọc
        int size = (int) Math.round(Math.random() * 10); // kích thước cột dọc ngẫu nhiên từ 1-10
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> arrRow = new ArrayList<>(); // hàng ngang
            // kích thước hàng ngang = cột dọc ( vì là hình vuông )
            for (int j = 0; j < size; j++) {
                int randomNum = (int) Math.round(Math.random() * 100);
                arrRow.add(randomNum); // thêm phần tử ngẫu nhiên vào hàng ngang
            }
            arrCol.add(arrRow); // thêm hàng ngang vào cột dọc
        }
        for (ArrayList<Integer> row : arrCol) {
            System.out.println(row); // hiển thị hàng ngang
        }
    }
}



