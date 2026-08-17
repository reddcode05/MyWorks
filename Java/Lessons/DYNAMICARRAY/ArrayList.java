package OOP;

import java.util.ArrayList;

class Student {

    String name, course;

    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("I'am " + name + " from " + course);
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();
        name.add("HAKDOG");
        name.add("CHEESEDOG");
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.get(1));
        name.set(1, "BURGER");
        System.out.println(name.get(1));
        System.out.println(name);
        name.remove(0);
        System.out.println(name);

        
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("reddcode", "BSIT"));
        student.add(new Student("WhiteDcode", "BSIT"));
        
        
        Student s1 = student.get(1);
        s1.display();
        student.add(1, new Student("Blackdcode", "BSIT"));
        Student s2 = student.get(1);
        s2.display();
        student.remove(0);
        s2.display();
        
        

    }
}
