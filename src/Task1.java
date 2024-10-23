import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(reverse("hello World"));
    }

    public static String reverse(String input) {
        String rightPart;
        String leftPart;

        int length = input.length();

        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return input;
        }

        leftPart = input.substring(0, length / 2);

        rightPart = input.substring(length / 2, length);

        // рекурсивно переворачиваем левую и правую часть входной строки
        return reverse(rightPart) + reverse(leftPart);
    }
}