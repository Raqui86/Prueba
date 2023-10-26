package org.example;
import javax.swing.*;
public class Uso_Array_II {
    public static void main(String[] args) {

       String[]paises=new String[8];
        for (int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduzca el "+(i+1)+"º pais");
        }
       /*  //tb se puede declarar
        //int mi array=new int [5];
        //dar valores a la matriz
        paises[0]="España";
        paises[1]="México";
        paises[2]="Colombia";
        paises[3]="Perú";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Ecuador";
        paises[7]="Venezuela";*/

     //declarar array de manera simplificada
       // String paises[]={"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};

               //recorrer todo el array y mostrarlo
       //1º OPCION
       /* for (int i=0;i<paises.length;i++){
            System.out.println("Valor de la índice "+i+" = "+paises[i]);
        }*/
       //2ºOPCION CON FOR EACH
        for(String pais:paises){

        //pais seria la variable para coger cada pais es String pq es del bucle string despues dos puntos y el nombre del array
            System.out.println("Pais = "+pais);

        }
    }
}