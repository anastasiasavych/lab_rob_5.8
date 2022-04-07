package com.company;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ціле тризначне число: ");
        int n = scan.nextInt();
        int a = n%10;
        int b = n/10;
        int c = b%10;
        int d = b/10;
        if(a > c && a > d){
            System.out.println("Найбільше число :" + a);
        }else if(c > a && c > d){
            System.out.println("Найбільше число :" + c);
        }else{
            System.out.println("Найбільше число :" + d);
        }
    }
}
