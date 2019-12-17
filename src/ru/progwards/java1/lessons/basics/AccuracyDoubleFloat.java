package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        double volumeBall = ((4 * 3.14 * radius * radius * radius)/3) ;
        return volumeBall;
    }

    public static float volumeBallFloat(float radius) {
        float radiusF = (float)radius;
        float count = (float)(4f/3f * 3.14f);
        float volumeBallF = (float)(count * radius * radius * radius);
        return volumeBallF;
    }

    public static double calculateAccuracy(double radius){
        float radiusF = (float)radius;
        double result = volumeBallDouble(radius) - volumeBallFloat(radiusF);
        return result;
    }

    public static void main(String[] args){
        double accuracy = calculateAccuracy(6371.2);
        System.out.println(accuracy);
    }


}