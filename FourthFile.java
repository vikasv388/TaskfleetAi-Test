class Student {
    public static void main(String[] args) {
        String name = "Rahul";
        int rollNo = 101;
        int age = 18;
        double marks = 85.5;

        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
