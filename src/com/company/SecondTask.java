package com.company;

/**
 * •	Создать класс Dog, который будет содержать 2 поля name и says.
 * В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”).
 * И распечатать поля объектов.
 * Created by Rosh on 29.11.2016.
 */
class Dog {
    public String name;
    public String says;

public static void main (String [] args) {
    Dog dog1 = new Dog("Spot","Ruff!");
    Dog dog2 = new Dog("Scruffy", "Wurf!");
    System.out.println(dog1.name+" says: "+dog1.says);
    System.out.println(dog2.name+" says: "+dog2.says);
}

public Dog(String name, String says){
    this.name=name;
    this.says=says;
}

}
