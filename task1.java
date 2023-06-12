// Задание
// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] se = s.split(" ");
        Collections.reverse(Arrays.asList(se));
        System.out.println(Arrays.toString(se));
    }
}
/**
 * @apiNote - Реверсия строки
 * @param - Введённая строка в терминал
 * @return - Реверсия строки в виде массива
 */