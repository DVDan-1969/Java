package src.week_3;
/*Write a Java program to sum values of an array.*/
public class Exercitiu1 {
    public static void main(String[] args) {
        int[] numbers={1,3,5,7,10};
        int sum=0;
        for(int n=0;n<numbers.length;n++){
            sum+=numbers[n];
        }
        System.out.println(sum);
    }

}
