package oopReview;

public class Developer extends Employee implements TechWorker {


    public Developer(String name, int age, String employeeId, double salary, String companyName) {
        super(name, age, employeeId, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + PROGRAMMING_LANGUAGE);
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
/*
Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".

   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

   2.3 Teacher:
       - work(): Displays "[name] is teaching".

   2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.

 */