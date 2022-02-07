package num1;

import java.util.Scanner;

/**
 *  Программа возвращает сумму цифр,
 *  присутствующих в введенной строке,
 *  если цирф нет возвращает 0.
 */


public class one{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите числа последовательно: ");
        String number = read.nextLine().trim();

        int sum = 0;
        for (char symbol : number.toCharArray()) {
            if (Character.isDigit(symbol)) {
                sum += Character.getNumericValue(symbol);
            }
        }
        System.out.println("Сумма: " + sum);

    }
}