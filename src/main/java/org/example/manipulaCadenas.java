package org.example;

public class manipulaCadenas {
    public static void main(String[] args) {

        String nombre="Raquel";
        System.out.println("Mi nombre es "+ nombre);
        System.out.println("Mi nombre tiene "+nombre.length()+ " letras");
        System.out.println("La primera letra de "+ nombre+ " es la "+nombre.charAt(0));
        //para saber la ultima letra de cualquien nombre tengo que saber la longitud del nombre y pnersela al método charAt
    // es -1 pq comienza por 0
        int ultima_letra= nombre.length();
        System.out.println("La última letra de "+nombre+ " es la "+nombre.charAt(ultima_letra-1));

    }
}
