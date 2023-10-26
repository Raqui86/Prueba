package org.example;
import java.util.*;

public class Evalua_edad {
    public static void main(String[] args) {
        //creamos objeto llamado entrada de la clase Scanner
    Scanner entrada=new Scanner(System.in);

        System.out.println("Introduzca su edad, por favor: ");
        //creamos una variable para guardar lo que introducen por teclado, será del objeto entrada y al ser un int se pondra nextInt
        int edad=entrada.nextInt();
        //primero se evalua esta sino se cumple evalua uno a uno los else if
        if(edad<18){
            System.out.println("Eres adolescente");
        }
        else if(edad<40){
            System.out.println("Eres joven");
        } else if (edad<65) {
            System.out.println("Eres maduro");
        }
        //sino se cumplen ninguna de las condiciones va por este camino
        else{
            System.out.println("Cuidate!!");
        }

    }
}