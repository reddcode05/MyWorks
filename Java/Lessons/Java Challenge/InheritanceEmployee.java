package mainpackages;

class Employee {

    public String name, employeeId;
    public double baseSalary;

    Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return this.baseSalary;
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.employeeId);
        System.out.println("Calculated Salary: " + this.calculateSalary());
    }
}

class Manager extends Employee {

    public int teamSize;

    public Manager(String name, String employeeId, double baseSalary, int teamSize) {
        super(name, employeeId, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    double calculateSalary() {
        double totalBonus = this.teamSize * 500;
        return this.baseSalary + totalBonus;
    }

}

class Developer extends Employee {

    int projectsCompleted;

    public Developer(String name, String employeeId, double baseSalary, int projectsCompleted) {
        super(name, employeeId, baseSalary);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    double calculateSalary() {
        double totalBonus = this.projectsCompleted * 1000;
        return this.baseSalary + totalBonus;
    }

}

class Intern extends Employee {
    
    public Intern(String name, String employeeId, double baseSalary) {
        super(name, employeeId, baseSalary);
    }
    
    @Override
    double calculateSalary() {
        return this.baseSalary * .50;
    }
}
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager("Red D. Code", "001", 100000, 100);
        manager.displayInfo();
        
        Developer developer = new Developer("White D. Code","005",50000,80);
        developer.displayInfo();
        
        Intern intern = new Intern("Black D. Code", "010", 30000);
        intern.displayInfo();
        
    }
}
