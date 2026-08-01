interface Animal {

    void makeSound();

}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("RAR");
    }
}

class Cat implements Animal {

    public void makeSound() {
        System.out.println("Meow");
    }

}

public class Main {

    public static void main(String[] args) {

        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}
