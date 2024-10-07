import java.util.*;
import java.io.*;


class Polymorphism {
    public static void main(String args[]){
        Person p1 = new Person("Axt",100);
        p1.speak(5);
        Person p2 = new Person("Pramod",100);
        p2.speak(3);

        p2.getSet();

        System.out.println();
    }
}

class Person{
    String name;
    int age;
    static int count = 0;

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
}

// class Akshat extends Person{
//     int age;String name;
//     Akshat(String name, int age){
//         this.name = super.name;
//         this.age = age;
//     }
// }

