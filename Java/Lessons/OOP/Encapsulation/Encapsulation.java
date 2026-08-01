class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Person p = new Person("Reddcode", 20);

        String name1 = p.getName();
        int age1 = p.getAge();

        System.out.println("Name : " + name1);
        System.out.println("Age  : " + age1);

        p.setName("WhiteDCode");
        p.setAge(21);

        String name2 = p.getName();
        int age2 = p.getAge();

        System.out.println("Name : " + name2);
        System.out.println("Age  : " + age2);
    }
}

