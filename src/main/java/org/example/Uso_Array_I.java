package org.example;

import java.util.Scanner;

public class Uso_Array_I {
    public static void main(String[] args) {

        int[]mi_array=new int[5];
        //tb se puede declarar
        //int mi array=new int [5];

        //dar valores a la matriz
        mi_array[0]=5;
        mi_array[1]=38;
        mi_array[2]=-15;
        mi_array[3]=92;
        mi_array[4]=71;

        //declarar e inicializar
        int mi_array2[]={10,20,30,40,50};

        //mostrar una posicion del array
        System.out.println(mi_array[3]);

        //recorrer todo el array y mostrarlo
       //1º OPCION
        for (int i=0;i<mi_array.length;i++){
            System.out.println("Valor de la índice"+i+" = "+mi_array[i]);
        }


    }
}