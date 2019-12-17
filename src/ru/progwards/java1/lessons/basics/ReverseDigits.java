package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int a;
        int b;
        int c;
        int sum;
        a = number % 10;
        a = a * 100;
        b = number % 100;
        b = b / 10;
        b = b * 10;
        c = number / 100;
        sum = a + b + c;
        return sum;

    }

    public static void main(String[] args) {
        int k = reverseDigits(321);
        System.out.println(k);
    }
}
