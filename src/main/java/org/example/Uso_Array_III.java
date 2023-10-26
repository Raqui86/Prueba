package org.example;

public class Uso_Array_III {
    public static void main(String[] args) {
    //Rellenar una matriz con números aleatorios

    int[]matriz_aleatorios= new int[150];
    for(int i=0;i<matriz_aleatorios.length;i++){
        //math. round es para redondear el numero, el int delante es para forzar a que sea un int ya que round
        //da decimales y math.random*100 es para que nos de aleatorios entre 1 y 100
        matriz_aleatorios[i]=(int) Math.round(Math.random()*100);

    }
    for(int aleatorio:matriz_aleatorios){
        //para que no salgan unos debajo de otros sino todos a continuacion se usa print
        System.out.print(aleatorio+" ");
    }

    }
}