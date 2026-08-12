package OOP;

import java.util.ArrayList;

class Student {

    private int ID;
    private String name;
    private String section;
    private String course;
    private boolean isEnroll;

    Student(String name, String section, String course, int ID, boolean isEnroll) {
        this.name = name;
        this.section = section;
        this.course = course;
        this.ID = ID;
        this.isEnroll = isEnroll;
    }

    String getName() {
        return name;
    }

    String getSection() {
        return section;
    }

    String getCourse() {
        return course;
    }

    int getID() {
        return ID;
    }

    boolean getIsStudent() {
        return isEnroll;
    }

    @Override
    public String toString() {
        return " Name: " + this.name + "\n Section: " + section + "\n Course: " + course + "\n ID: " + ID + "\n Enroll: " + (isEnroll ? "Yes" : "No");
    }
}

class School {

    private ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
    }

    void enrollStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                if (student.getIsStudent() == true) {
                    System.out.println(" " + student.getName() + " are already enroll!\n");
                } else {
                    System.out.println(" " + student.getName() + " are Not fully enroll!\n");
                }
                return;
            }
        }
        System.out.println(" " + name + " is Not found in the system!\n");
    }

    void findStudentById(int id) {

        for (Student s : students) {
            if (s.getID() == id) {
                if (s.getIsStudent() == true) {
                    System.out.println(" " + s.getName() + " are student!\n");
                } else {
                    System.out.println(" " + s.getName() + " are Not student!\n");
                }
                return;
            }
        }
        System.out.println(" The " + id + " is not found in the system!\n");
    }

    void listAllStudentIsEnroll() {
        System.out.println("All Student are Enroll: \n");
        for (Student s : students) {
            if (s.getIsStudent()) {
                System.out.println(s.toString() + "\n");
            }
        }
    }

    void listOverallStudent() {
        System.out.println("All Student: \n");
        for (Student s : students) {
            System.out.println(s.toString() + "\n");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("Garp D. Monkey", "301A", "BSCS", 50, true));
        school.addStudent(new Student("Luffy D. Monkey", "302B", "BSCS", 56, false));
        school.addStudent(new Student("Dragon D. Monkey", "303C", "BSIS", 88, true));

        System.out.println("====================================================");
        System.out.println("=                                                  =");
        System.out.println("=                     START                        =");
        System.out.println("=                                                  =");
        System.out.println("====================================================");

        System.out.println("====================================================");
        System.out.println("Find the student if enroll or not: \n");
        school.enrollStudent("Garp D. Monkey");
        school.enrollStudent("Luffy D. Monkey");
        school.enrollStudent("Red B. Dragon");

        System.out.println("====================================================");
        System.out.println("Find the student using ID number: \n");
        school.findStudentById(50);
        school.findStudentById(56);
        school.findStudentById(87);

        System.out.println("====================================================");

        school.listAllStudentIsEnroll();

        System.out.println("====================================================");

        school.listOverallStudent();
        System.out.println("====================================================");
        System.out.println("=                                                  =");
        System.out.println("=                      END                         =");
        System.out.println("=                                                  =");
        System.out.println("====================================================");
    }
}
