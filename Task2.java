

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Напишите в терминале строку:" + " hello world ");
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String result = reverseString(s);
            System.out.println(result);
        }
    }
    private static String reverseString(String s) {
        String se = s.trim();
        String str1 = se.substring(0, s.length()/2);
        String str2 = se.substring(s.length()/2);
        String res = String.join(" ", str2, str1);
        return res;
    }
}
/**
 * @apiNote - Реверсия строки
 * @param - Строка введенная в терминале
 * @return - Строка в обратном порядке
 */
