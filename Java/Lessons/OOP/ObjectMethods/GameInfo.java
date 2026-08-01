class Character {

    String name, dialog;
    int age, lvl, hp, mp;

    Person(String name, String dialog, int age, int lvl, int hp, int mp) {

        this.name = name;
        this.dialog = dialog;
        this.age = age;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;

    }

    void introduce() {
        System.out.println("Game Info");
        System.out.println("Name   : " + name);
        System.out.println("Dialog : " + dialog);
        System.out.println("Age    : " + age);
        System.out.println("HP     : " + hp);
        System.out.println("MP     : " + mp);
        System.out.println("LVL    : " + lvl);
    }

    void sayDialog() {
        System.out.println(name + " > " + dialog);
    }

    void talkTo(Person x) {
        System.out.println(name + " > HI " + x.name);
    }

}

public class GameInfo {

    public static void main(String[] args) {
        Person p1 = new Person("Reddcode", "What's up brother", 20, 100, 25678, 200000);
        Person p2 = new Person("Whitedcode", "What's up my brother", 20, 100, 25678, 200000);

        p1.introduce();
        System.out.println("");
        p1.sayDialog();
        p2.talkTo(p1);
    }
}
