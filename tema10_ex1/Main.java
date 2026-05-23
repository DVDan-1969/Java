package tema10_ex1;

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i< 5;i++){
            System.out.println("Mesage from Thread1");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i< 5;i++){
            System.out.println("Mesage from Thread2");
        }

    }
}
public class Main{
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}