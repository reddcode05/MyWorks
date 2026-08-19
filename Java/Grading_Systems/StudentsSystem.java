package MainPackages;

import java.util.ArrayList;
import java.util.List;

class Student {

    private String name;
    private double finalGrade;
    private static int count;

    public Student(String name, double finalGrade) {
        this.name = name;
        this.finalGrade = finalGrade;
        count++;
    }

    public String getName() {
        return name;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student name: " + name + "\t" + "Final Grade: " + finalGrade;
    }
}

class TopStudent {

    private List<Student> students = new ArrayList();

    public void addStudent(Student stu) {
        students.add(stu);
    }

    public void allStudents() {
        for (Student student : students) {
            if (student.getFinalGrade() < 0 || student.getFinalGrade() > 100) {
                System.out.println("Error");
            } else if (student.getFinalGrade() >= 90) {
                System.out.println(student.toString() + "\t - \tTOP Student!");
            } else if (student.getFinalGrade() >= 75) {
                System.out.println(student.toString() + "\t - \tPasser!");
            } else {
                System.out.println(student.toString() + "\t - \tNot Passer!");
            }
        }
    }

    public void sort() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getFinalGrade() < students.get(j + 1).getFinalGrade()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        TopStudent ts = new TopStudent();

        ts.addStudent(new Student("Tony", 91.99));
        ts.addStudent(new Student("Bruce", 92.99));
        ts.addStudent(new Student("Peter", 93.99));
        ts.addStudent(new Student("Kart", 89.99));
        ts.addStudent(new Student("Jimmy", 69.99));
        ts.addStudent(new Student("John", 65.99));
        ts.addStudent(new Student("Joseph", 67.99));

        System.out.println("Student Count: " + Student.getCount());

        ts.sort();

        ts.allStudents();
    }
}
