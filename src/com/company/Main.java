package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMin = Integer.MIN_VALUE;
        int myMax = Integer.MAX_VALUE;
        System.out.println("Max:" + myMax+"," + "Min:" + myMin);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);


        byte myByteNum = 10;
        short myShortNum = 20;
        int myIntNum = 50;
        long myLongNum = 50000L + 10L * (myByteNum + myShortNum + myIntNum);
        System.out.println(myLongNum);

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println(myMinFloat);
        System.out.println(myMaxFloat);

        int myIntValue = 5;
        float myFloatValue = 5.25F;
        double myDoubleValue = 5.25D;

        double kilogram = 0.45359237d;
        double pounds = 165d;
        double poundsToKilogrmas = pounds * kilogram;
        System.out.println(poundsToKilogrmas);

        String num = "250.45";
        double total = Double.parseDouble(num) + 49.55;
        System.out.println(total);

    }
}
