package org.example;

public class Array_Bidimensional {
    public static void main(String[] args) {
        //declaración array bidimensional
        int[][] matrix=new int[2][3];
        //tipo de datos, dos pares de corchetes porque son bidimensional nombre de matriz =new int[num elem primera matriz]
        // [num elem 2 matriz]

        //rellenar valores: array de 2 por array de 3

        matrix[0][0]=15;
        matrix[0][1]=21;
        matrix[0][2]=20;


        matrix[1][0]=80;
        matrix[1][1]=10;
        matrix[1][2]=30;

       for(int i=0;i<2;i++){
           //no incrementa i hasta acabar el bucle for de j
           System.out.println();//se le pone un espacio para que cuando cambie la i haga un salto de linea
           for(int j=0;j<3;j++){
               System.out.print(matrix[i][j]+ " ");
           }
       }
    }
}