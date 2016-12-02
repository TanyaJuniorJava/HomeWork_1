package com.company;

import java.util.Scanner;

/**•	В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 * Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).
 * Created by Rosh on 02.12.2016.
 */
class Triangle {
    public static void main (String [] args)
    {
        System.out.println("Введите 2 числа(катета): ");
        Scanner inA = new Scanner(System.in);
        int a = inA.nextInt();
        Scanner inB = new Scanner(System.in);
        int b = inB.nextInt();
        int S  = (a*b)/2;
        double c, P;
        c = Math.sqrt((a*a)+(b*b));
        P = a+b+c;
        System.out.println("Square = "+S+", Perimetr = "+P);
    }
}
