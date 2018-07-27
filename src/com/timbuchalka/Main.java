package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        String input = "2018.125";
        double number = Double.parseDouble(input);
        //int number = Integer.parseInt(input);

        System.out.println(input);
        System.out.println(number);

        input += 1;
        number += 1;

        System.out.println(input);
        System.out.println(number);
    }
}
