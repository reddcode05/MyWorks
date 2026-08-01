class Person {

    private String name;
    private int age;

    Person(String name) {
        this.name = name;
    }

    Person(int age) {
        this.age = age;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
}

public class PersonDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Reddcode");
        Person p2 = new Person(20);
        
        System.out.println(p1.getName());
        System.out.println(p2.getAge());
    }
}
