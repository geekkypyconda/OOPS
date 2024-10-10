import java.util.*;
import java.io.*;


class Abs{
    public static void main(String args[]){
        Car c1 = new Car("Mercedez", "M5",100,5,4);
        R8 r = new R8("Audi","R8",200,6,2);
        Car c2 = new Car("Mercedez", "M7",1000,50,40);

        c2.start(5);
        r.start(10);
    }
}

abstract class Vehicle{
    String brand,name;
    int price;

    Vehicle(String brand,String name,int price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    abstract void start(int n);
}

class Car extends Vehicle {
    int length,doors;
    Car(String brand,String name,int price,int len,int doors){
        super(brand, name, price);
        this.length = len;
        this.doors = doors;
    }

    @Override
    void start(int n){
        System.out.println(this.name + ",  started in : " + n + " , sec");
    }
}



class R8 extends Car {
    R8(String brand,String name,int price,int len,int doors){
        super(brand, name,price,len, doors);
    }
}


class NN implements Device, Person{
    @Override
    public void print(){
        System.out.println("Device Print");
    }

    @Override
    public void print(int n){
        System.out.println("Person N Print");
    }

    @Override
    public void devFunc(){
        System.out.println("Dev Function");
    }

    @Override
    public void personFunc(){
        System.out.println("Person Function");
    }
}

interface Device{
    void print();
    void devFunc();
}


interface Person{
    void print(int n);
    void personFunc();
}
