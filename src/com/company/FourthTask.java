package com.company;

import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        Scanner options = new Scanner(System.in);
        System.out.print("Введіть значення: ");
        String y = options.nextLine();
        String op1 = "Погодитись";
        switch (op1){
            case "Погодитись":
                switch (y){
                    case "Так":
                        System.out.print("Я погоджуюсь!");
                        break;
                    case "OK":
                        System.out.print("Я погоджуюсь!");
                        break;
                    case "Yes":
                        System.out.print("Я погоджуюсь!");
                        break;
                    case "Y":
                        System.out.print("Я погоджуюсь!");
                        break;
                    case "+":
                        System.out.print("Я погоджуюсь!");
                        break;
                    case "Ok":
                        System.out.print("Я погоджуюсь!");
                        break;
                }
            case "Відмовитись":
                switch(y){
                    case "Ні":
                        System.out.print("Я відмовляюсь!");
                        break;
                    case "NO":
                        System.out.print("Я відмовляюсь!");
                        break;
                    case "N":
                        System.out.print("Я відмовляюсь!");
                        break;
                    case "-":
                        System.out.print("Я відмовляюсь!");
                        break;
                    case "No":
                        System.out.print("Я відмовляюсь!");
                        break;
                    default:
                        System.out.print("Ви ввели некоректне значення!");

                }


        }

    }
}