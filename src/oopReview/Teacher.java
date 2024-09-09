package oopReview;

public class Teacher extends Employee {


    public Teacher(String name, int age, String employeeId, double salary, String companyName) {
        super(name, age, employeeId, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println("Teacher " + getName() + " is teaching.");
    }

    @Override
    public void eat() {
        System.out.println("Teacher " + getName() + " is eating Burger King.");
    }
}
