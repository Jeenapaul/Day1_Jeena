package com.lambton;

public class FirstDay {
    public static void main(String[] args) {
        System.out.println("Jeena");
        //variable declaration
        int a, b, c;
        //value Assignment
        a = 3;
        b = 5;
        //perform adf
        c = a + b;
        //display result
        System.out.println("SUM:" + c);
        int x = Integer.MAX_VALUE;
        System.out.println("x:" + x);
        int y = x + 1;
        System.out.println("y:" + y);
        System.out.println("Min:" + Integer.MIN_VALUE);
        StudentJeena j1 = new StudentJeena();
        j1.setvalues();
        j1.Display();

        for (int i = 1; i <= 10; i++) {

            System.out.println("jeena");


        }
    }
}