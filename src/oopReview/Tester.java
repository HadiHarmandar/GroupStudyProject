package oopReview;

public class Tester extends Employee implements TechWorker {


    public Tester(String name, int age, String employeeId, double salary, String companyName) {
        super(name, age, employeeId, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing in " + PROGRAMMING_LANGUAGE + " language in" + getCompanyName());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Java");
    }

    @Override
    public void workTech() {
        System.out.println(getName() + " is working tech");
    }
}
