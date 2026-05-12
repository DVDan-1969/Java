package tema8_ex7;

public class Main {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Hello Generics!");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox = new Box<>(123);
        System.out.println(integerBox.getItem());
    }

}
