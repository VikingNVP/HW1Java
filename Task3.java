
// Example 3:
// Input: s = "a good   example"
// Output: "example good a"

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Напишите в терминале строку:" + "a good   example");
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String result = reverseString(s);
            System.out.println(result);
        }
    }
    private static String reverseString(String s) {
        String substr1 = s.substring(0, s.length()/2);
        String str1 = substr1.trim();
        String substr2 = s.substring(s.length()/2);
        String str2 = substr2.trim();
        String res = String.join(" ", str2, str1);
        return res;
    }
}
