package MainPackages;

import java.util.Scanner;
import java.util.ArrayList;

class Student {

    private String name;
    private int Id;
    private int daysPresent;
    private double GWA;

    public Student(String name, int Id, int daysPresent, double GWA) {
        this.name = name;
        this.Id = Id;
        this.daysPresent = daysPresent;
        this.GWA = GWA;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public int getPresent() {
        return daysPresent;
    }

    public double getGWA() {
        return GWA;
    }
}

class StudentAttendanceGradeSystem {

    ArrayList<Student> students = new ArrayList();
    int totalDays = 365;

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudent() {
        int i = 1;
        for (Student student : students) {
            System.out.println("================================================");
            System.out.println("Student #" + i);
            System.out.println("Name:\t\t\t" + student.getName());
            System.out.println("ID:\t\t\t" + student.getId());
            System.out.printf("Percent of Present:\t%.2f%%\n", ((double) student.getPresent() / totalDays) * 100);
            System.out.println("GWA:\t\t\t" + student.getGWA());
            System.out.println("================================================");
            i++;
        }
    }

    public void searchStudent(int ID) {
        for (Student student : students) {
            if (ID == student.getId()) {
                System.out.println("Name: " + student.getName() + ", His grade is: " + student.getGWA());
            return;
            }
        }
        System.out.println("The Student is not Exist...");
    }

    public void showTopStudent() {
        for (Student student : students) {
            if (student.getGWA() < 0 || student.getGWA() > 100) {
                System.out.println("Out of Bounds of score...");
            } else if (student.getGWA() >= 90) {
                System.out.println("Name: " + student.getName() + " is TOP Student!");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("The System is start");
        try (Scanner sc = new Scanner(System.in)) {
            StudentAttendanceGradeSystem sag = new StudentAttendanceGradeSystem();
            int choice = 0;
            while (choice != 5) {
                System.out.println("1. Add Student");
                System.out.println("2. Display All Student");
                System.out.println("3. Search Student");
                System.out.println("4. Show Top Student");
                System.out.println("5. Exit");

                choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    //add student
                    System.out.print("Input the Full name: ");
                    String name = sc.nextLine();
                    System.out.print("Input Id number: ");
                    int Id = sc.nextInt();
                    System.out.print("Input Days of Present: ");
                    int pres = sc.nextInt();
                    System.out.print("Input the GWA: ");
                    double GWA = sc.nextDouble();
                    sag.addStudent(new Student(name, Id, pres, GWA));
                } else if (choice == 2) {
                    //display all student
                    sag.displayAllStudent();
                } else if (choice == 3) {
                    //search student
                    System.out.print("Search a student using ID number: ");
                    int Id = sc.nextInt();
                    System.out.println("====================================================");
                    sag.searchStudent(Id);
                    System.out.println("====================================================");
                } else if (choice == 4) {
                    //show top student
                    System.out.println("====================================================");
                    sag.showTopStudent();
                    System.out.println("====================================================");
                } else if (choice == 5) {
                    //exit
                } else {
                    System.out.println("Input again.");
                }
            }
            sc.close();
            System.out.println("The System is End!");
        } catch (Exception e) {
            System.out.println("Error Plz Try Again... Click shift + f6... If you use netbeans");
        }
    }

}
