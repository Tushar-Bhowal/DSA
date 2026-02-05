package MathAndNumberTheory;

import java.util.*;

public class DecimalToBinary {
    static String decimalToBinaryUsingString(int number) {
        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            binary.append(number % 2);
            number = number / 2;
        }
        return binary.reverse().toString();
    }

    static int decimalToBinary(int number) {
        int binary = 0;
        int place = 1;

        while (number > 0) {
            int rem = number % 2;
            binary = binary + rem * place;
            place = place * 10;
            number = number / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.close();
        int answer = decimalToBinary(number);

        System.out.println("Decimal To Binary Convertion is :" + answer);
        String answerInString = decimalToBinaryUsingString(number);
        System.out.println("Decimal To Binary Convertion in String is :" + answerInString);
    }
}
