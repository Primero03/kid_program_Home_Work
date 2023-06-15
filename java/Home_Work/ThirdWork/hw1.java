package Seminar.third;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.Rdn;

class third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        GetMaxValue(numbers);
        GetMinValue(numbers);
        MiddleValue(numbers);
    }

    public static void GetMaxValue(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение :" + max);
    }

    public static void GetMinValue(int[] array) {
        int min = 999999999;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение :" + min);
    }

    public static void MiddleValue(int[] array) {
        int middleValue = 0;
        int sum = 0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            quantity++;
            sum += array[i];
        }
        middleValue = sum / quantity;
        System.out.println("Среднее значение :" + middleValue);
    }
}