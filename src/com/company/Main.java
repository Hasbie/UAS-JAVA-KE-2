package com.company;

/**
 Ini adalah soal no 2
 */
public class Main {

    public static void main(String[] args) {
        int a = 9;
        int b = 4;
        int c = a/b;

        System.out.println(c);
    }
}

/**
 Ini adalah contoh Constructor Soal no 1
 */
class Demo{
    int  value1;
    int  value2;
    Demo(){
        value1 = 10;
        value2 = 20;
        System.out.println("Inside Constructor");
    }

    public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }

    public static void main(String args[]){
        Demo d1 = new Demo();
        d1.display();
    }
}

/**
 Ini adalah contoh Method Soal no 1
 */
class Numbers {
    public static void main(String[] args) {
        System.out.print("Square root of 4 is: " + Math.sqrt(4));
    }
}
