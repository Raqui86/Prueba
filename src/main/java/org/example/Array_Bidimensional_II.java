package org.example;

public class Array_Bidimensional_II {
    public static void main(String[] args) {

        int [][]matrix ={
     /*primer array*/        {15,21,20},
  /*seg array*/             {80,10,30}};

        for(int[] primer:matrix){
            //imprime los valores de el primer array
            System.out.println();//da saltos de linea cada vez que acaba posiciones de el primer
            for(int segundo:primer){
                System.out.print(segundo+ " ");// imprime los del segundo que esta dentro de primer
            }
        }
    }
 }
