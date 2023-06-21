package BT15;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        // fixed
        Student student1 = new Student(1, "Nhung1", 5.5);
        Student student2 = new Student(2, "Nhung2", 8.1);
        Student student3 = new Student(3, "Nhung3", 6.8);
        Student student4 = new Student(4, "Nhung4", 9.3);
        Student student5 = new Student(5, "Nhung5", 9.8);
        Student student6 = new Student(6, "Nhung6", 7.4);
        // add
        studentManagement.add(student1);
        studentManagement.add(student2);
        studentManagement.add(student3);
        studentManagement.add(student4);
        studentManagement.add(student5);
        studentManagement.add(student6);
        // show
        System.out.println("show all");
        studentManagement.showAll();
        // find by id
        System.out.println("find by id");
        System.out.println(studentManagement.findById(2));;
        // remove by id
        System.out.println("remove by id");
        studentManagement.remove(1);
        studentManagement.showAll();
        // average score
        System.out.println("average score");
        System.out.println(studentManagement.getAverageScore());
        // Sort by average score
        studentManagement.sortByScore();
        System.out.println("sort");
        studentManagement.showAll();

    }
}
