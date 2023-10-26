package org.example;

public class CalculosConMath {
    public static void main(String[] args) {
    /*double num=9;
        //double raiz=Math.sqrt(num); //es la raiz  cuadrada de un número
        //System.out.println("La raiz de "+num+" es "+raiz);
        double num1=5.85;*/
       /*  // ya que el metodo se almacena en un int va devolver un long y si queremos que nos devuelva tendremos que hacer una refundición obligar al dato a que sea del tipo que queremos
        int resultado=(int)Math.round(num1); //redondea el número
        System.out.println(resultado);*/
        double base=5;
        double exponente=3;
        double resultado=Math.pow(base,exponente); //halla la potencia de un num
        System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+resultado);
    }

    }
