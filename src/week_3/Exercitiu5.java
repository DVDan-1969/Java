package src.week_3;

import java.util.HashSet;
import java.util.Set;

/*Write a Java program to remove duplicate elements from an array.*/
public class Exercitiu5 {
    public static void main(String[] args) {
       String[] students={"Ana","Ion","Ana","Maria","Ion"};
       Set<String> unique=new HashSet<String>();
       for(String str:students){
           unique.add(str);
       }
       System.out.println(unique);

    }
}
