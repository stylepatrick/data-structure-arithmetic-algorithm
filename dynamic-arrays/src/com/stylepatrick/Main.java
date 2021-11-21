package com.company;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array(4);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);
        arr.insert(70);
        arr.addAt(1, 99);
        arr.removeAt(6);
        System.out.println(arr.indexOf(0));
        arr.print();
    }
}
