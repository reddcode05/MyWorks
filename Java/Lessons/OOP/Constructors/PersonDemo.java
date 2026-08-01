
class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

}

public class PersonDemo {

    public static void main(String[] args) {
        Person p = new Person("RED", 20);

    }
}
