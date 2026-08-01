class Person {
    
    String firstName;
    String lastName;
    char sex;
    int age;
    
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.firstName = "RED";
        p.lastName = "code";
        p.sex = 'M';
        p.age = 20;
        
        System.out.println(p.firstName);
        System.out.println(p.lastName);
        System.out.println(p.sex);
        System.out.println(p.age);
        
    }
}
