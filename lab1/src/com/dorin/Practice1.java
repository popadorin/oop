package com.dorin;

public class Practice1 {
    static public void main(String[] args) {
        Student student = new Student(21);

    }

}


// Define two classes Author and Book.
// Author: name, listOfBooks
// Book: name, publishYear, nrOFpages
class Student {
    final int age;

    {
        System.out.println("nlanlablabla");
    }

    static {
        System.out.println("static block");
    }

    Student(int age) {
        System.out.println("constructor");
        this.age = age;
    }


    void blabla() {
        final int a;
        a = 3;

//        a = 8;
    }
}

