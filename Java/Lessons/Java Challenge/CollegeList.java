package mainpackage;

import java.util.Scanner;

class Person {

    private String name;
    private String contactNum;

    public void setName(String n) {
        if (n.isEmpty()) {
            this.name = "N/A";
        } else {
            this.name = n;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setContactNum(String c) {
        if (c.isEmpty()) {
            this.contactNum = "N/A";
        } else {
            this.contactNum = c;
        }
    }

    public String getContactNum() {
        return this.contactNum;
    }
}

class Student extends Person {

    private String program;
    private int yearLevel;

    public void setProgram(String p) {
        if (p.equalsIgnoreCase("bsit") || p.equalsIgnoreCase("bstm")) {
            this.program = p;
        } else {
            this.program = "N/A";
        }
    }

    public String getProgram() {
        return this.program.toUpperCase();
    }

    public void setYearLevel(int y) {
        if (y == 1 || y == 2 || y == 3 || y == 4) {
            this.yearLevel = y;
        } else {
            this.yearLevel = 0;
        }
    }

    public int getYearLevel() {
        return this.yearLevel;
    }
}

class Faculty extends Employee {

    private boolean status;

    public void setRegular(boolean status) {
        this.status = status;
    }

    public boolean isRegular() {
        return this.status;
    }
}

class Employee extends Person {

    private double salary;
    private String department;

    public void setSalary(double s) {
        this.salary = s;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartment(String d) {
        if (d.isEmpty()) {
            this.department = "N/A";
        } else {
            this.department = d;
        }
    }

    public String getDepartment() {
        return this.department;
    }
}

public class CollegeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== The System is Start ==========");

        String select = "A";
        while (!select.equalsIgnoreCase("B")) {

            System.out.print("Press E for Employee, F for Faculty, or S for Student and Press B to End the System: ");
            select = sc.nextLine();

            if (select.equalsIgnoreCase("E")) {

                Employee e = new Employee();
                System.out.println("Type employee's name, contact number, salary, and department.");
                System.out.println("Press Enter after every input.");
                e.setName(sc.nextLine());
                e.setContactNum(sc.nextLine());
                String salaryIn = sc.nextLine();
                double salary = salaryIn.isEmpty() ? 0: Double.parseDouble(salaryIn);
                e.setSalary(salary);
                e.setDepartment(sc.nextLine());
                System.out.println("---------------------------");
                System.out.println("Name: " + e.getName());
                System.out.println("Contact Number: " + e.getContactNum());
                System.out.println("Salary: " + e.getSalary());
                System.out.println("Department: " + e.getDepartment());
                System.out.println("---------------------------");

            } else if (select.equalsIgnoreCase("F")) {

                Faculty f = new Faculty();
                System.out.println("Type faculty name, contact number, salary, department.");
                System.out.println("Press Enter after every input.");
                System.out.print("Enter Name: ");
                f.setName(sc.nextLine());
                System.out.print("Enter Contact Number: ");
                f.setContactNum(sc.nextLine());
                System.out.print("Enter Salary: ");
                String salaryIn = sc.nextLine();
                double salary = salaryIn.isEmpty() ? 0: Double.parseDouble(salaryIn);
                f.setSalary(salary);
                System.out.print("Enter Department: ");
                f.setDepartment(sc.nextLine());
                System.out.print("Press Y if regular/tenured and N for not: ");
                select = sc.nextLine();

                if (select.equalsIgnoreCase("Y")) {
                    f.setRegular(true);
                } else if (select.equalsIgnoreCase("N")) {
                    f.setRegular(false);
                }

                System.out.println("---------------------------");
                System.out.println("Name: " + f.getName());
                System.out.println("Contact Number: " + f.getContactNum());
                System.out.println("Salary: " + f.getSalary());
                System.out.println("Department: " + f.getDepartment());
                System.out.println("Status: " + (true == f.isRegular() ? "Regular/tenured" : "NOT"));
                System.out.println("---------------------------");

            } else if (select.equalsIgnoreCase("S")) {

                Student s = new Student();
                System.out.println("Type student name, contact number, program, year level.");
                System.out.println("Press Enter after every input.");
                System.out.print("Enter Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter Contact Number: ");
                s.setContactNum(sc.nextLine());
                System.out.print("Enter Program (BSIT, BSTM): ");
                s.setProgram(sc.nextLine());
                System.out.print("Type a year level (1 to 4): ");
                String yearLevel = sc.nextLine();
                int level = yearLevel.isEmpty() ? 0 : Integer.parseInt(yearLevel);
                s.setYearLevel(level);
                
                System.out.println("---------------------------");
                System.out.println("Name: " + s.getName());
                System.out.println("Contact Number: " + s.getContactNum());
                System.out.println("Program: " + s.getProgram());
                System.out.println("Year Level: " + s.getYearLevel());
                System.out.println("---------------------------");

            }
        }
        System.out.println("=========== The System is End ==========");
        sc.close();
    }
}
