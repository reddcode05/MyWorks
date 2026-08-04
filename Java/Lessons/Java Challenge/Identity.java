class PersonIdentity {

    private String name, city, religion, history, familyName;
    private int age, yr;
    private double ft;

    PersonIdentity(String name, String city, String religion, String history, String familyName, int age, double ft, int yr) {
        this.name = name;
        this.age = age;
        this.familyName = familyName;
        this.religion = religion;
        this.city = city;
        this.history = history;
        this.ft = ft;
        this.yr = yr;
    }

    void displayIdentity() {
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("Name         : " + name);
        System.out.println("Family Name  : " + familyName);
        System.out.println("Age          : " + age);
        System.out.println("Religion     : " + religion);
        System.out.println("Foot         : " + ft);
        System.out.println("Year of Stay : " + yr);
        System.out.println("History      : " + history);
    }
}

public class Identity {

    public static void main(String[] args) {
        PersonIdentity p = new PersonIdentity("Ahriez B. Ponce Jr.","Imus","Roman chatolic","Warrior","Ponce",21,5.4,5);
        p.displayIdentity();
    }
}
