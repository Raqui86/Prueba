package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su factorial: ");
        int num = entrada.nextInt();
        int factorial = 1;
        for (int i =num ; i>0; i--) {
            factorial = factorial * i;

        }
        System.out.println("El resultado del factorial de " + num + " es " + factorial);

    }
}