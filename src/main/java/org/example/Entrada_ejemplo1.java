package org.example;
//paquete el que pertenece la clase scanner
import java.util.Scanner;

public class Entrada_ejemplo1 {
    public static void main(String[] args) {
    //Creamos el objeto entrada de la clase scanner como argumentos le pasamos el origen de consola del sistema, es decir System.in.
        Scanner entrada=new Scanner(System.in);
        //mensaje para introducir los datos
        System.out.println("Introduce tu nombre: ");
        //crear una variable para guardar lo introducido
        String nombre_usuario;
        //usas el objeto creado de Scanner y le pones el metodo nextLine para recoger los datos
        nombre_usuario=entrada.nextLine();


        System.out.println("Introduce tu edad: ");
            int edad=entrada.nextInt();

        //muestras por pantalla
        System.out.println("Hola "+nombre_usuario+" tu edad es "+edad+ " años");

    }
}