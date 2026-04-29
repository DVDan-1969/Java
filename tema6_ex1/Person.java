package tema6_ex1;

interface Evaluatable {
    double calculatePerformance();
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // method overloading
    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    public void displayInfo(boolean showAge) {
        if (showAge) {
            System.out.println("Name: " + name + ", Age: " + age);
        } else {
            displayInfo();
        }
    }
}
class Student extends Person implements Evaluatable {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public double calculatePerformance() {
        return grade;
    }
}
class Teacher extends Person implements Evaluatable {
    private int studentsPassed;

    public Teacher(String name, int age, int studentsPassed) {
        super(name, age);
        this.studentsPassed = studentsPassed;
    }

    @Override
    public double calculatePerformance() {
        return studentsPassed * 1.5;
    }
}
class Main {
    public static void main(String[] args) {
        Student s = new Student("Ana", 20, 9.5);
        Teacher t = new Teacher("Ion", 45, 30);

        s.displayInfo(true);
        System.out.println(s.calculatePerformance());

        t.displayInfo();
        System.out.println(t.calculatePerformance());
    }
}
