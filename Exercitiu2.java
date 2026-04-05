package Tema3;
/*Write a Java program to calculate the average value of array elements(valoarea medie)*/
public class Exercitiu2 {
    public static void main(String[] args) {
        int numbers[]={2,6,8,10,13,15};
        float avg,sum = 0;
        int length=numbers.length;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        avg=sum/length;
        System.out.println("The average is "+avg);

    }
}
