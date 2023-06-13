package Seminar.first;

import java.util.Scanner;

public class hw3 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type 1th characters: ");
        Double num1 = sc.nextDouble();
        System.out.println();
        System.out.print("Select operator (+),(-),(*),(/): ");
        String operator = sc.next();
        System.out.println();
        System.out.print("Type 2th characters: ");
        Double num2 = sc.nextDouble();

        switch (operator) {
            case ("+"):
                System.out.printf("%3f + %3f = %3f", num1, num2, num1 + num2);
                break;

            case ("-"):
                System.out.printf("%3f - %3f = %3f", num1, num2, num1 - num2);
                break;

            case ("*"):
                System.out.printf("%3f x %3f = %3f", num1, num2, num1 * num2);
                break;

            case ("/"):
                System.out.printf("%3f / %3f = %3f", num1, num2, num1 / num2);
                break;
            default:
                System.out.println("Something goes wrong...bye!");

        }
    }
}
//Реализвация простого калькулятора