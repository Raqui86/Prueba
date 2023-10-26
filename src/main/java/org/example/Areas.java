package org.example;
import java.util.*;
import javax.swing.*;

public class Areas {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        // print para que no de un salto de linea y \n dara el salto de linea donde queramos
        System.out.print("Elige una opción:  \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
        int figura=entrada.nextInt();
        switch(figura){
            case 1:
                //Integer.parseInt(lo que queremos que pase a entero pq JOptionPane.showInputDialog nos da un string
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de lado: "));
                System.out.println("El área del cuadrado es "+lado*lado);
                break;//para que no siga ejecutandose el programa sale del switch
            case 2:
                int bas_rect=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de base: "));
                int alt_rect=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de altura: "));
                System.out.println("El área del cuadrado es "+bas_rect*alt_rect);
                break;//para que no siga ejecutandose el programa sale del switch
            case 3:
                int bas_tri=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de base: "));
                int alt_tri=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de altura: "));
                System.out.println("El área del triángulo es "+(bas_tri*alt_tri)/2);
                break;//para que no siga ejecutandose el programa sale del switch
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del radio: "));
                System.out.print("El área del circulo es ");
                //en esta linea estamos poniendo que el resultado tenga dos decimales por eso el print acaba en f y %1.2f, despues viene la formnula para elevar a 2 el radio
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
                break;//para que no siga ejecutandose el programa sale del switch

        }

    }
}