/**
 * Created by LolHens on 20.01.2015.
 */
public class Main {
    public static boolean aspectj = false;

    public static void main(String[] args) {
        test();

        if (aspectj) {
            System.out.println("AspectJ SUCCESS!");
        } else {
            System.out.println("Aspectj FAILURE");
        }

        int tmp1 = 1;
    }

    public static void test() {
    }
}
