class Animal {
    String name;
    int age;
    
    void makeSound() {
        System.out.println("Please Override This Function.");
    }
    void info() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
    }
}
class Dog extends Animal {
    
    Dog() {
        name = "Whitey";
        age = 5;
    }
    
    @Override
    void makeSound() {
        System.out.println("AW!");
    }
    @Override
    void info() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
    }
}
class Cat extends Animal {
    
    Cat() {
        name = "Blacky";
        age = 5;
    }
    
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
    @Override
    void info() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        
        d.info();
        d.makeSound();
        
    }
}
