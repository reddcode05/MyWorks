class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    void drink() {
        System.out.println("Drink: Coffee");
    }

}

class Toddler extends Person {

    String favFood;

    Toddler(String name, int age, String favFood) {
        super(name, age);
        this.favFood = favFood;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Fav Food : " + favFood);
    }

    @Override
    void drink() {
        System.out.println(name + " is Milk");
    }
}

class Kid extends Toddler {

    int gradeLevel;

    Kid(String name, int age, String favFood, int gradeLevel) {
        super(name, age, favFood);
        this.gradeLevel = gradeLevel;
    }

    @Override
    void drink() {
        System.out.println(name + " is Juice");
    }

    void sayGradeLevel() {
        System.out.println("I'am Grade " + gradeLevel);
    }

}

public class Human {

    public static void main(String[] args) {
        Person p = new Person("ReddCode", 20);
        p.info();
        p.drink();

        System.out.println("");

        Toddler t = new Toddler("WhitedCode", 1, "BURGER");
        t.info();
        t.drink();

        System.out.println("");

        Kid k = new Kid("blackdcode", 13, "Chiken", 6);
        k.info();
        k.drink();
        k.sayGradeLevel();
    }
}
