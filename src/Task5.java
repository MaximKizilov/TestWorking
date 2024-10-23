import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        System.out.println("Введите слово для подсчета:");
        String word = scanner.nextLine();

        Map<String, Integer> wordCount = countWords(input, word);
        System.out.println("Количество вхождений слова '" + word + "': " + wordCount.get(word));
    }

    public static Map<String, Integer> countWords(String input, String word) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\p{P}+|\\s+");

        for (String w : words) {
            w = w.toLowerCase();
            if (w.equals(word.toLowerCase())) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
}