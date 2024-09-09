package oopReview;

public abstract class Employee extends Person {

    private final String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;
    public static boolean hasJob;

    static {
        hasJob = true;
    }

    public Employee(String name, int age, String employeeId, double salary, String companyName) {
        super(name, age);
        if (employeeId == null || employeeId.isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        }
        this.employeeId = employeeId;
        setJobTitle(getClass().getSimpleName());
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public abstract void work();

    public static void showJobSituation() {
        System.out.println("Job Situation" + hasJob);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", companyName='" + companyName + '\'' +
                ", hasJob='" + hasJob + '\'' +
                '}';
    }
}
/*
Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation All the fields.
       Condition:
            Salary can not be zero or negative

   Add a constructor to initialize all fields.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.
 */