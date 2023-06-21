package BT12;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list1 = new MyList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        MyList<String> list2 = list1.clone();
        System.out.println("List1:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Element at index " + i + ": " + list1.get(i));
        }
        System.out.println("List2 (Clone of List1):");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("Element at index " + i + ": " + list2.get(i));
        }
    }
}
