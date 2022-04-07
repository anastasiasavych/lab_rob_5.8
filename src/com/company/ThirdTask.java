package com.company;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner floor = new Scanner(System.in);
        System.out.print("Введіть поточний поверх: ");
        int f1 = floor.nextInt();
        System.out.print("Введіть потрібний поверх: ");
        int f2 = floor.nextInt();
        if(f1 >= 1 && f1 <= 9 && f1 < f2  && f2 <= 9 && f2 != 2){
            System.out.print("Ви піднялись на " + f2 + " поверх");
        }else if(f1 >= 1 && f1 <= 9 && f1 > f2 && f2 <= 9 && f2 !=2){
            System.out.print("Ви спустились на " + f2 + " поверх");
        }else if(f1 >=1 && f1 <= 9 && f1 < f2 && f2 == 2 && f2 <= 9){
            System.out.print("Ви піднялись на 3 поверх");
        }else if(f1 >=1 && f1 <= 9 && f1 > f2 && f2 == 2 && f2 <=9){
            System.out.print("Ви спустились на 1 поверх");
        }else{
            System.out.print("Ви вказали неіснуючий поверх");
        }


    }
}
