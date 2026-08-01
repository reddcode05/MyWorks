abstract class Animal {
    
    String name;
    
    abstract void makeSound();
    
    void showName() {
        System.out.println("Name: " + name);
    }
    
    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Rawf!");
    }
}

class Cat extends Animal {
    
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Animal d = new Dog();
        Animal c = new Cat();
        
        d.makeSound();
        c.makeSound();
        
        d.setName("Reddcode");
        c.setName("Whiteny");
        
        d.showName();
        c.showName();
    }
}
