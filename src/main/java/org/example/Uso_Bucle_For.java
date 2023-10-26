package org.example;
import javax.swing.*;
public class Uso_Bucle_For {
    public static void main(String[] args) {

/* for(int i=0;i<=9;i++){
     System.out.println("Raquel"+ i);
 }*/

     boolean arroba=false;
     String email= JOptionPane.showInputDialog("Introduce un email: ");
     //length nos dice la longitud del email
     for(int i=0;i<email.length();i++){
         //metodo charAt devuelve el caracter en la posicion indicada y en este caso que sea igual a la @
        if(email.charAt(i)=='@'){
            arroba=true;
        }
     }
     if(arroba==true){
         System.out.println("El email es correcto");
     }
     else{
         System.out.println("El email no es correcto");
     }
    }
}