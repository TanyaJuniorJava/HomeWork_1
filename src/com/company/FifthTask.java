package com.company;

import java.util.Scanner;

/**•	Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь).
 * Created by Rosh on 02.12.2016.
 */
class Comporation {

    public static void main (String []args)
    {
        System.out.println("Введите 2 числа:");
        Scanner inFirst = new Scanner (System.in);
        int m = inFirst.nextInt();
        Scanner inSecond = new Scanner (System.in);
        int n = inSecond.nextInt();
        int m1;
        int n1;
        m1 = Math.abs(10-m);
        n1 = Math.abs(10-n);
        System.out.println("Ближайшее к 10-ти число: ");
        if ((m1>n1))
            System.out.println(n);
        else
            System.out.println(m);
    }
}
