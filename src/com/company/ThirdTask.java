package com.company;

import java.util.Scanner;

/*•	Создать программу, проверяющую и сообщающую на экран, является ли целое число,
записанное в переменную n, чётным либо нечётным (n – вводит пользователь).*/
class ChetNeChet {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            System.out.println(n);
            if ((n%2)==0)
                System.out.println(n+" - chet");
            else
                System.out.println(n+" - ne chet");
            // write your code here
    }
}
