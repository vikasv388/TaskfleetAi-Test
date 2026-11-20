
class Student {

    // Encapsulation
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Inheritance
class CollegeStudent extends Student {

    CollegeStudent(String name, int age) {
        super(name, age);
    }

    // Polymorphism (Method Overriding)
    @Override
    void display() {
        System.out.println("Student Details:");
        super.display();
        System.out.println("College: ABC College");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        CollegeStudent s1 =
            new CollegeStudent("Rahul", 20);

        s1.display();
    }
}
