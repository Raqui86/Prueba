package org.example;
import javax.swing.*;

public class Uso_Bucle_For_2 {
    public static void main(String[] args) {

/* for(int i=0;i<=9;i++){
     System.out.println("Raquel"+ i);
 }*/
    //lo ponemos en int para hacerlo contador y que no haya mas de una arroba
     int arroba=0;
     //para saber que el email tiene como minimo un punto lo podremos en false
     boolean punto=false;
     String email= JOptionPane.showInputDialog("Introduce un email: ");
     //length nos dice la longitud del email
     for(int i=0;i<email.length();i++){
         //metodo charAt devuelve el caracter en la posicion indicada y en este caso que sea igual a la @
        if(email.charAt(i)=='@'){
            //cada vez que encontramos una arroba incrementamos la variable en uno
            arroba++;
        }
        if(email.charAt(i)=='.'){
            //si se encuentra como minimo un punto se pondra a true
            punto=true;
        }
     }
     //si el arroba es igual a uno es correcta sino es incorrecto
     if(arroba==1 && punto==true){
         System.out.println("El email es correcto");
     }
     else{
         System.out.println("El email no es correcto");
     }
    }
}