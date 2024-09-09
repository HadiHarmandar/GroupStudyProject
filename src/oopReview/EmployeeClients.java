package oopReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeClients {

    public static void main(String[] args) {

        Developer developer = new Developer("David", 34, "A01", 115000, "Google");
        Tester tester = new Tester("John", 27, "B01", 105000, "Apple");
        Teacher teacher = new Teacher("Sara", 46, "C01", 65000, "Public School");
        Driver driver = new Driver("Abdullah", 38, "D01", 55000, "Uber");

        List<Employee> employees = new ArrayList<>(Arrays.asList(developer, tester, teacher, driver));

        Person person = new Developer("David", 34, "A01", 115000, "Google");
        //TechWorker techWorker = (TechWorker) new Driver("Abdullah", 38, "D01", 55000, "Uber");

        boolean checkClass = person instanceof TechWorker;

        System.out.println(checkClass);

        System.out.println("---------------------");

        // TODO: show me the most earning person with the salary

        String name = driver.getName();
        double mostEarning = driver.getSalary();

        for (Employee each : employees) {
            if (each.getSalary() > mostEarning) {
                mostEarning = each.getSalary();
                name = each.getName();
            }
        }

        System.out.println("Name: " + name + ", Most Earning: $" + mostEarning);

        System.out.println("---------------------");

        // TODO: show me the employees that age is greater than 35

        for (Employee each : employees) {
            if (each.getAge() > 35) {
                System.out.println(each.getName() + " : " + each.getAge());
            }
        }

    }
}
/*
Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.
 */