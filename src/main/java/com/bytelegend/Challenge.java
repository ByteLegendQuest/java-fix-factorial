package com.bytelegend;

public class Challenge {
    public static int num;

    public static void main(String[] args) {
        System.out.println("0 != " + factorial(0));
        System.out.println("1 != " + factorial(1));
        System.out.println("2 != " + factorial(2));
        System.out.println("3 != " + factorial(3));
        System.out.println("4 != " + factorial(4));
        System.out.println("5 != " + factorial(5));
    }

    public static int factorial(int number) {
        int i= 1;
        int jieguo = 1;
        while (i<=number){
            jieguo *=i;
            i++;
        }
        return jieguo;
    }
}
