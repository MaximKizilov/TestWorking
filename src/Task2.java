import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        System.out.println(reverse(input));
    }

    public static String reverse(String input) {
        char[] stringToArray = input.toCharArray();
        StringBuilder c = new StringBuilder();
        for (int i = stringToArray.length - 1; 0 <= i; i--) {
            c.append(stringToArray[i]);
        }
        return c.toString();
    }
}
