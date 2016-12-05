package com.company;

import java.util.Scanner;

/**•	Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
 * Например, возраст, вес, рост и год рождения. Добавить методы получения и добавления параметров отдельно.
 * Created by Rosh on 03.12.2016.
 */
class Heap {


    private static long heap = 28631751988l;
    private long age;
    private long weight;
    private long height;
    private long yearBirth;

    public void setAge(long age){
        this.heap = (age*1000000000)+(this.heap%1000000000);
        }
    public int getAge() {
        long age = (heap/1000000000);
        return (int) age;
        }

    public void setWeight(long weight){
        this.heap = (weight*1000000000)+(this.heap%10000000);
        }

    public int getWeight() {
        long weight = heap/10000000;
        return (int) weight;
        }

    public void setHeight(long height){
        this.heap = (height*10000000)+(this.heap%10000000);
        }

    public int getHeight(){
        long height = heap/100000;
        return (int) height;
        }

    public void setYearBirth(int yearBirth){
        this.heap = (yearBirth*10000)+(heap%10000);
        }

    public int getYearBirth(){  ////work!!!
        long yearBirth = heap%10000;
        return (int) yearBirth;
        }

        public static void main (String []args)
    {

        System.out.println(heap);
        Heap heap = new Heap();
        heap.setAge(20);
        heap.setWeight(60);
        heap.setHeight(180);
        heap.setYearBirth(1996);
        System.out.println(heap.getWeight());

    }
}
