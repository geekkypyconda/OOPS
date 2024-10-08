import java.util.*;
import java.io.*;


class encap {
    public static void main(String args[]){
        Person p1 = new Person("Axt",100);
        p1.speak(5);
        Person p2 = new Person("Pramod",100);
        p2.speak(3);

        // This is possible
        Person p4 = new Akshat("makshat",90);

        System.out.println(p4.getName());
    }
}

class Person{
    private String name;
    private int age;
    private static int count = 0;

    Person(String name,int age){
        this.name = name;
        this.age = age;
        count++;
    }

    void printD(){
        System.out.println("Name : " + name + ", age : " + age);
    }

    void speak(int k){
        while(k-- > 0){
            System.out.println(name + " Speaking : " + k);
        }

        System.out.println();
    }

    static void getSet(){
        System.out.println("hey");
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    int getCount(){
        return count;
    }
}

class Akshat extends Person{
    Akshat(String name, int age){
        super(name,age);
    }
}

