package org.example;

import java.util.Scanner;

public class Adivina_numero_con_doWhile {
    public static void main(String[] args) {
    // el programa generara un num aleatorio entre 0 y 100, para ello utilizaremos el metodo random de la clase Math que genera un num aleatorio doble entre 0 y 1
    // si quiero entre 1 y 100 tendre que multiplicar el num que da por 100 y sino lo quiero decimal lo convertimos a entero

        int aleatorio=(int)(Math.random()*100);

        Scanner entrada= new Scanner(System.in);

        int numero=0;
        int intentos=0;
    //mientras numero sea distinto de aleatorio
      do{
            intentos++;// se incrementa a medida que entras en el bucle para intentar adivinarlo
            System.out.println("Introduce el numero a adivinar: ");
            numero=entrada.nextInt();
            if(aleatorio<numero){
                System.out.println("MAS BAJO!!.El numero introducido es mayor");
            }
            else if(aleatorio>numero){
                System.out.println("MAS ALTO!!.El numero introducido es menor");
            }
        }  while(numero!=aleatorio);
        System.out.println("Correcto!!!. Lo has conseguido en "+intentos+" intentos.");
    }
}