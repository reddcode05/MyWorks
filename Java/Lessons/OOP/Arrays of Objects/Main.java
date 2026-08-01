class Employee {

    String name;
    String jobTitle;

    Employee(String name, String jobtitle) {
        this.name = name;
        this.jobTitle = jobtitle;
        
    }
    
    void introduceSelf() {
        System.out.println("Name  :  " + name + " Title  :  " + jobTitle);
    }
}

public class Main {

    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0]= new Employee("Reddcode","Man");
        e[1]= new Employee("Whie","Angel");
        e[2]= new Employee("Blek","Demon");
        e[3]= new Employee("Shadow","Killer");
        e[4]= new Employee("G-Ghost","Joker");
        
        e[3].introduceSelf();
        
        for (int i = 0; i < e.length; i++) {
            e[i].introduceSelf();
        }
    }
}
