package com.company;

import java.util.Scanner;

/**
 * •	В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую
 * на экран сумму цифр числа n (n – вводит пользователь).
 * Created by Rosh on 29.11.2016.
 */
class Sum {

    public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите двузначное число:");
    int n = in.nextInt();
    int sum=0;
    while (n!=0){
        sum = n/10 + n%10;
        System.out.println("Сумма цифр введенного вами числа = "+sum);
        break;
                }
    }
}
