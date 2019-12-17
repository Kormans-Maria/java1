package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        double volumeBall = (4 * 3.14 * radius * radius * radius) / 3;
        return volumeBall;
    }

    public static float volumeBallFloat(float radius) {
        float volumeBallF = (float) ((4 * 3.14 * radius * radius * radius) / 3);
        return volumeBallF;
    }

    public static double calculateAccuracy(double radius){
        double result = volumeBallDouble(radius) - volumeBallFloat((float)radius);
        return result;
    }

    public static void main(String[] args){
        double accuracy = calculateAccuracy(6371.2);
        System.out.println(accuracy);
    }


}