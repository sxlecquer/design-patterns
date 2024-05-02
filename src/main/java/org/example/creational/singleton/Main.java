package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("flyweight");
        Singleton singleton2 = Singleton.getInstance("proxy");

        System.out.println("These objects have that same reference, don't they? " + (singleton1 == singleton2));
        System.out.println("These objects are identical, aren't they? " + singleton1.equals(singleton2));
        System.out.println("The value of singleton1's data variable is " + singleton1.getData());
        System.out.println("The value of singleton2's data variable is " + singleton2.getData());

        singleton1.setData("proxy");
        System.out.println();

        System.out.println("These objects have that same reference, don't they? " + (singleton1 == singleton2));
        System.out.println("These objects are identical, aren't they? " + singleton1.equals(singleton2));
        System.out.println("The value of singleton1's data variable is " + singleton1.getData());
        System.out.println("The value of singleton2's data variable is " + singleton2.getData());
    }
}
