package BT12;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> fruitList = new MyList<>(2);
        fruitList.add(0,"Orange");
        fruitList.add(1,"Banana");
        fruitList.add(1,"Apple");
        fruitList.add(2,"Mango");
        fruitList.add(2,"Lemon");
        fruitList.remove(2);
        System.out.println(fruitList.contains("Lemon"));
        fruitList.ensureCapacity(10);
        fruitList.clear();
        System.out.println(fruitList);

    }
}
