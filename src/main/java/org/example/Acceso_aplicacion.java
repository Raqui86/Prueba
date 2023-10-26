package org.example;
import javax.swing.*;
public class Acceso_aplicacion {
    public static void main(String[] args) {

        String clave="Raquel";
        //la inicializamos vacia
        String pass="";

        //mientras la clave introducida por teclado no sea igual pass pedira continuamente introducirla
        //el metodo equals es un metodo de la clase string que compara si son iguales dos cadenas de texto(clave y pass)
        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduzca su clave, por favor: ");
            if(clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta, introduzcala de nuevo.");
            }

        }
        System.out.println("Contraseña correcta. Acceso permitido");
    }
}