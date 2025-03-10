package com.agnes;

public class Main {
    public static void main(String[] args) {

        // practicing important String methods that are useful for beginners.

        // 1) length of a string

        String name = " Agnes Nazie";
        int length = name.length();

        // 2) chartAt of a string
        char letter= name.charAt(6);

       // 3) variable of the index
        int index = name.indexOf("N");

        // 4) how to use the lastIndex method
        int lastIndex = name.lastIndexOf("a");

        // 5) how to make strings uppercase.
        name=name.toUpperCase();

        //6) how to make strings lowercases.
        name=name.toLowerCase();

        //7) how to use trim method.
        name=name.trim();

        //8) how to replace character with another.
        name=name.replace("e", "i");

        //9) how to add IsEmpty method to a string. it is used to return a boolean value. it is very useful with an if statement.


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);


    }
}