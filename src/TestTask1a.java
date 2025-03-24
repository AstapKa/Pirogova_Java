import java.util.Scanner;

public class TestTask1a {
    public static void main(String[] args) {

    while (true) {
        System.out.println("Введите целое число А");
        Integer inputА = Integer.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Введите целое число В");
        Integer inputВ = Integer.valueOf(new Scanner(System.in).nextLine());

        int sum = (inputА+inputВ);
        int difference = (inputА-inputВ);
        int multiplication = (inputА*inputВ);
        int division = (inputА/inputВ);

        System.out.println("Сумма чисел A + B равна: " + sum);
        System.out.println("Разность чисел A - B равна: " + difference);
        System.out.println("Произведение чисел A * B равна: " + multiplication);
        System.out.println("Частное чисел A / B равно: " + division);
        }
    }
}
