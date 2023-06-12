// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность в строку: ");
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            int[] res = returnNewArray(s);
            int result = sumValues(res);
            System.out.println("sum = " + result);
        }
    }

    public static int[] returnNewArray(String s) {
        String sArr[] = s.split(" ");
        int numArr[] = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            numArr[i] = Integer.parseInt(sArr[i]);
        }
        return numArr;
    }

    public static int sumValues(int[] res) {
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0 && res[i + 1] < 0) {
                sum += res[i];
            }
        }
        return sum;
    }
}
/**
 * @apiNote - Дана последовательность целых чисел, оканчивающаяся нулем. 
 * Найти сумму положительных чисел, после которых следует отрицательное число.
 * @param - Введённая строка в чисел в терминал
 * @return - Сумму положительных значений массива, после которых идёт отрицательное значение.
 */