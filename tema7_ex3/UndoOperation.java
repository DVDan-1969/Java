package tema7_ex3;

import java.util.Stack;

public class UndoOperation {
    public static void main(String[] args) {

        Stack<String> actions = new Stack<>();

        // 1. Adăugăm 3 acțiuni
        actions.push("Write code");
        actions.push("Delete line");
        actions.push("Save file");

        // 2. Undo ultima acțiune
        String undoneAction = actions.pop();

        System.out.println("Acțiune anulată: " + undoneAction);
        System.out.println("Acțiuni rămase: " + actions);
    }
}
