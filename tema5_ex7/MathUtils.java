package tema5_ex7;

public class MathUtils {
    //Constructor privat ca sa nu poata fi create obiecte
    private MathUtils() {

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
    public static int max(int a,int b) {
        return Math.max(a, b);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.max(2,3));
        System.out.println(MathUtils.add(1,2));
        System.out.println(MathUtils.subtract(1,2));
        System.out.println(MathUtils.isEven(4));




    }
}
