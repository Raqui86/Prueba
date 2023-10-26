package org.example;
import javax.swing.*;
import java.util.Scanner;

public class peso_Ideal {
    public static void main(String[] args) {
        String genero="";

        do {
            genero = JOptionPane.showInputDialog("Introduzca su genero(H/M): ");
        //repite las instrucciones mientras lo introducido sea diferente de H y diferente de M, ignoreCase no distingue entre may y minus
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura en cm: "));
        int pesoideal=0;
        if(genero.equalsIgnoreCase("H")){
            pesoideal=altura-110;
        } else if (genero.equalsIgnoreCase("M")) {
            pesoideal=altura-120;
        }
        if(genero.equalsIgnoreCase("H")){
            genero="hombre";
        } else if (genero.equalsIgnoreCase("M")) {
            genero="mujer";

        }
        System.out.println("Tu peso ideal siendo "+genero+" es "+pesoideal+ " kg");
    }
}