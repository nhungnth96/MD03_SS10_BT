package BT15;

import java.util.*;

public class StudentManagement {
    private List<Student> studentList = new ArrayList<>();
    public void showAll(){
       if(studentList.isEmpty()){
           // isEmpty() nếu rỗng trả về true
           System.out.println("Danh sách học viên trống");
       } else {
           for (Student student:studentList) {
               System.out.println("ID: " + student.getStudentId() +
                       " | Name: " + student.getName() +
                       " | Average Score: " + student.getAverageScore());
           }

       }
    }
    public void add(Student student){
        studentList.add(student);
    }
    public Student findById(int id) {
        for (Student student:studentList){
            if(student!=null&&student.getStudentId()==id){
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên");
        return null;
    }
    public void remove(int id) {
        // có thể remove = 2 cách
        // remove(Object = đối tượng - phần tử trong danh sách)
        // remove (Id = index - vị trí của phần tử)
        if (findById(id) == null) {
            System.out.println("Không tìm thấy sinh viên");
        }
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student != null && student.getStudentId() == id) {
                iterator.remove();
                System.out.println("Xóa sinh viên có id " + id +" thành công");
                return;
            }
        }

    }
    public double getAverageScore(){
        double averageScore = 0;
        for (Student student : studentList) {
            averageScore += student.getAverageScore()/studentList.size();
        }
        return averageScore;
    }
    public void sortByScore(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getAverageScore(), s2.getAverageScore());
            }
        });
    }
}
