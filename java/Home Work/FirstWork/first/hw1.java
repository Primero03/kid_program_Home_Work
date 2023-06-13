package Seminar.first;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Type of chatacters: ");
        int character = iScanner.nextInt();
        int sum = 0;
        int prod = 1;
        for (int i = 0; i <= character; i++) {
            sum += i;
        }
        System.out.println(" ");
        System.out.print("Сумма чисел:");
        System.out.println(sum);
        for (int i = 1; i <= character; i++) {
            prod *= i;
        }
        System.out.print("Произведение чисел:");
        System.out.println(prod);
    }
}
//Вычислить N-0e треугольное число (сумма от 1 до N),N!(произведение чисел от 1 до N)
