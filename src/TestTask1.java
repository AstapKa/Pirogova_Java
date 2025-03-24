import java.util.Scanner;

public class TestTask1 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите целое число А");
            Integer inputА = Integer.valueOf(new Scanner(System.in).nextLine());
            System.out.println("Введите целое число В");
            Integer inputВ = Integer.valueOf(new Scanner(System.in).nextLine());

            if (inputА > inputВ) {
                System.out.println("a > b");
            } else if (inputА < inputВ) {
                System.out.println("a < b");
            } else if (inputА == inputВ) {
                System.out.println("a = b");
            } else {
                System.out.println("неверные данные");
            }
        }
    }
}