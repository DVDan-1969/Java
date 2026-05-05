package tema7_ex1;
import java.util.ArrayList;


public class StudentGrades {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(10);
        grades.add(9);
        grades.add(8);
        grades.add(10);
        grades.add(7);

        System.out.println("A treia notă: " + grades.get(2));

        grades.set(1, 100);

        if (grades.contains(10)) {
            System.out.println("Nota 10 există.");
        } else {
            System.out.println("Nota 10 nu există.");
        }

        grades.remove(Integer.valueOf(10));
        grades.remove(Integer.valueOf(10));

        System.out.println("Lista finală: " + grades);
    }
}
