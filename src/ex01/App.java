package ex01;

import static ex01.Point.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        for (Student student : getStudents()) {
            System.out.println(student.toString());
        }
        System.out.println("Get list of students achieving A grade in 2021");
        System.out.println(Arrays.toString(getStudentHaveAPoint(getStudents())));

        System.out.println("List of students retaking the Data Structures course in 2021.");
        System.out.println(Arrays.toString(getStudentHaveFPoint(getStudents())));
    }

    private static Student[] getStudentHaveAPoint(Student[] students) {
        Student[] result = new Student[students.length];
        int count = 0;
        for (Student student : students) {
            if (student.getPoint().equals(A)) {
                result[count++] = student;
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }

    private static Student[] getStudentHaveFPoint(Student[] students) {
        Student[] result = new Student[students.length];
        int count = 0;
        for (Student student : students) {
            if (student.getPoint().equals(F)) {
                result[count++] = student;
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }

    private static Student[] getStudents() {
        return new Student[] {
                new Student(102, "Nam", C),
                new Student(103, "Bảo", F),
                new Student(104, "Hoàng", D),
                new Student(105, "Nguyên", B),
                new Student(107, "Vũ", F),
                new Student(109, "Lan", A),
                new Student(202, "Đạt", C),
                new Student(103, "Bảo", F),
                new Student(107, "Vũ", C),
                new Student(104, "Hoàng", B)
        };
    }
}
