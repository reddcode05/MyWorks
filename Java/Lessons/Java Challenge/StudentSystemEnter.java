package OOP;

class Student {

    private String name, course;
    private int gLevel, numSem;

    Student(String name, String course, int gLevel, int numSem) {
        this.name = name;
        this.course = course;
        this.gLevel = gLevel;
        this.numSem = numSem;
    }

    void displayStudent() {
        if (name.equals("Ahriez B. Ponce Jr.")) {
            if (course.equals("BSIT")) {
                if (gLevel == 2) {
                    if (numSem == 1) {
                        System.out.println("This user is a Student of this school!");
                    } else {
                        System.out.println("This user is NOT a Student of this school!");
                    }
                } else {
                    System.out.println("His Level is error.");
                }
            } else {
                System.out.println("The course is error");
            }
        } else {
            System.out.println("His name is unkown!");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        /*
         I want to create a STUDENT LOGIN SYSTEM
         */
        Student s = new Student("Ahriez B. Ponce Jr.","BSIT",2,1);
        s.displayStudent();
    }
}
