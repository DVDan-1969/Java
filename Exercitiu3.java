package Tema3;
/*Write a Java program to find the index of an array element.*/
public class Exercitiu3 {
    public static void main(String[] args) {
        String cars[] = {
                "Dacia", "Ford", "Hyunday", "BMW", "Mercedes"};
        for (int i = 0; i < cars.length; i++){
            if (cars[i].equals("Ford")) {
                System.out.println(i);
            }
        }

    }

}




