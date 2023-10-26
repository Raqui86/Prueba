package org.example;

public class manipulaCadenas2 {
    public static void main(String[] args) {

        String frase="Hoy es un día estupendo para aprender a programar en Java";
        //substring extrae una cadena de una cadena
        String frase_resumen=frase.substring(0,29)+ " irnos a la playa y olvidarnos de todo..."+" y "+frase.substring(29,57);
        System.out.println(frase_resumen);

        
    }
}
