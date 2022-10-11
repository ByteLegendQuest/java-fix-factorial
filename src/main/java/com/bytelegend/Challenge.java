package com.bytelegend;

public class Challenge {

    public static void main(String[] args) {
        System.out.println("0 != " + factorial(0));
        System.out.println("1 != " + factorial(1));
        System.out.println("2 != " + factorial(2));
        System.out.println("3 != " + factorial(3));
        System.out.println("4 != " + factorial(4));
        System.out.println("5 != " + factorial(5));
    }

    public static int factorial(int number) {
        if(number > 1){
        return factorial(number - 1) * number;}
        else{
            return 1;
        }
    }
}
