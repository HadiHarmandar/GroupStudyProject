package oopReview;

public abstract class Person {

    private String name;
    private int age;

    public Person(String name) {
        setName(name);
    }

    public Person(String name, int age) {
        this(name); // Constructor chaining
        setAge(age);
    }

    public String getName() { // READ ONLY
        return name;
    }

    public void setName(String name) { // WRITE ONLY
        if (name == null || name.isEmpty() || name.isBlank()) {
//            System.err.println("Name cannot be null or empty or blank");
//            System.exit(1);
            throw new IllegalArgumentException("Name cannot be null or empty or blank");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be less than or equal to zero");
        }
        this.age = age;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        return name.equals(((Person) obj).name) && age == ((Person) obj).age;
//    }
}
/*
Create a class named "Person" with the following specifications:
   Attributes:
       - name: String
       - age: int

   Encapsulation All the fields.
        Conditions:
            Name can not be set to null or empty
            Age can not be set to zero or negative

   Add a constructor to initialize all fields.

   Actions:
       - eat(): Displays the person's name with the message " is eating"
       - sleep(): Displays the person's name with the message " is sleeping"
       - toString(): Returns a string representation of the Person object.
 */