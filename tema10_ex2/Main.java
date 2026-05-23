package tema10_ex2;



class Task1 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
    }

}
class Task2 implements Runnable{
    @Override
    public void run() {
        for(char c='A';c<='E';c++){
            System.out.println(c);
        }
    }
}

public class Main{
    public static void main(String[] args){
        Task1 task1 = new Task1();//obiecte care implementeaza Runnable
        Task2 task2 = new Task2();
        Thread t1=new Thread(task1);//creare thread,constructor cu task ca parametru.
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();
    }
}