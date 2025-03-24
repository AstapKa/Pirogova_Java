import java.util.Scanner;

public class TestTask2 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите значение строки А");
            String inputА = new Scanner(System.in).nextLine();
            System.out.println("Введите значение строки В");
            String inputВ = new Scanner(System.in).nextLine();

            if (inputА.equals(inputВ)) {
                System.out.println("Строки идентичны");
            } else
                System.out.println("Строки неидентичны");
        }
    }
}