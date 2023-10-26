package org.example;
 //INVERTIR UNA CADENA DE CARACTERES
public class Invertir_cadena {
    public static void main(String[] args) {
        String original = "Hola, mundo!";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }

    public static String reverseString(String cadena) {
        StringBuilder reversed = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversed.append(cadena.charAt(i));
        }
        return reversed.toString();
    }
}