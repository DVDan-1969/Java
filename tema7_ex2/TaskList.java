package tema7_ex2;

import java.util.LinkedList;

public class TaskList {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.addFirst("Task 1");
        tasks.addLast("Task 2");

        tasks.add("Task 3");

        tasks.removeFirst();

        tasks.add(1, "Urgent Task");

        tasks.push("Action 1");
        tasks.push("Action 2");
        tasks.push("Action 3");

        tasks.pop();

        System.out.println("Lista normală: " + tasks);

        System.out.println("Lista invers:");
        for (int i = tasks.size() - 1; i >= 0; i--) {
            System.out.println(tasks.get(i));
        }
    }
}
