import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static int x;
    public static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Введите число x:");
                x = scanner.nextInt();
                System.out.println("Введите число y:");
                y = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число. Пожалуйста, повторите попытку.");
                scanner.next(); // очистка буфера ввода
            }
            int tmp = x;
            x = y;
            y = tmp;
            System.out.println("x=" + x + ", y=" + y);
        }
    }
}
