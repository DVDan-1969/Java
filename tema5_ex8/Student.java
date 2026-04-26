package tema5_ex8;

public class Student {
    private String name;
    private int id;
    private static int studentCount = 0;

    public Student(String name) {
        this.name = name;
        studentCount++;      // incrementăm numărul total de studenți
        this.id = studentCount; // atribuim ID unic
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    // numărul total de studenți
    public static int getStudentCount() {
        return studentCount;
    }
}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ana");
        Student s2 = new Student("Bogdan");
        Student s3 = new Student("Carmen");

        System.out.println(s1.getName() + " ID: " + s1.getId());
        System.out.println(s2.getName() + " ID: " + s2.getId());
        System.out.println(s3.getName() + " ID: " + s3.getId());

        System.out.println("Total studenti: " + Student.getStudentCount());
    }
}
