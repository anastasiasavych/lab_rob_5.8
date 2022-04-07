package com.company;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть не ціле число: ");
        float n = scan.nextFloat();

        if (n >= 50 && n <= 100){
            System.out.println("Число " + n + " міститься в проміжку(50; 100)");
        }else{
            System.out.println("Число " + n + " не міститься в проміжку(50; 100)");
        }
    }
}
