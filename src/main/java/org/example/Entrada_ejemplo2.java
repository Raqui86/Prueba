package org.example;
//paquete el que pertenece la clase JOptionPane
import javax.swing.*;

public class Entrada_ejemplo2 {
    public static void main(String[] args) {
        //creo una variable que guarde lo que introducimos con una ventana creada por JOptionPane y con  su metodo showInputDialog
 String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre: ");

        // Obtener la edad se pasa de string a integer para realizar la suma
        String edadStr = JOptionPane.showInputDialog("Introduce tu edad: ");
        int edad = Integer.parseInt(edadStr); // Convertir a entero

        // Obtener los años a para sumar se pasa de string a integer para realizar la suma
        String añosStr = JOptionPane.showInputDialog("Introduce los años para saber edad futura: ");
        int años = Integer.parseInt(añosStr); // Convertir a entero

        // Calcular la suma de edad y años
        int suma = edad + años;

        // Mostrar el resultado
        System.out.println("Hola " + nombre_usuario + ", tu edad dentro de " + años + " años será de " + suma + " años.");
    }
}

