package BT15;

public class Student {
    private int studentId;
    private String name;
    private double averageScore;

    public Student() {
    }

    public Student(int studentId, String name, double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return
                "ID: " + studentId +
                        " | Name: " + name +
                        " | Average Score: " + averageScore;
    }
}
