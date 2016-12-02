package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * •	В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить
 * и выводить на экран вещественные корни квадратного уравнения ax^2+bx+c=0, либо сообщать, что корней
 * нет (a, b и c – вводит пользователь).
 * Created by Rosh on 02.12.2016.
 */
class Equation {
    
    public static void main (String[]args)
    {
        System.out.println("Введите переменные а,в,с для квадратного уравнения ax^2+bx+c=0");
        Scanner inA = new Scanner(System.in);
        double a = inA.nextDouble();
        Scanner inB = new Scanner(System.in);
        double b = inB.nextDouble();
        Scanner inC = new Scanner(System.in);
        double c = inC.nextDouble();
        double Decr, x1,x2;
        System.out.println("Вычисляю корни уравнения...");
            Decr = Math.pow(b, 2) - (4*a*c);
                if (Decr>0) {
                    x1 = (-b - Math.sqrt(Decr)) / (2 * a);
                    x2 = (b - Math.sqrt(Decr)) / (2 * a);
                    System.out.println("x1 = "+x1+", x2 = "+x2); }
                else if (Decr == 0){
                    x1=x2=-b/(2*a);
                    System.out.println("x1 = x2 = "+x1);   }
                else
                    System.out.println("Действительных корней нет!");
    }
}
