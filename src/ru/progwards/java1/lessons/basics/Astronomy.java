package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r){
        double s = 4 * 3.14 * r * r;
        return s;
    }

    public static Double earthSquare(){
        double e = sphereSquare(6371.2);
        return e;
    }

    public static Double mercurySquare(){
        double m = sphereSquare(2439.7);
        return m;
    }

    public static Double jupiterSquare(){
        double j = sphereSquare(71492.0);
        return j;
    }

    public static Double earthVsMercury(){
        double vs = earthSquare() / mercurySquare();
        return vs;
    }

    public static Double earthVsJupiter(){
        double vs = earthSquare() / jupiterSquare();
        return vs;
    }

    public static void main(String[] args){
        System.out.println(earthVsJupiter());

    }
}
