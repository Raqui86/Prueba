package poo;
import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche Renault=new Coche(); //para instanciar una clase se hace nombre_clase nombre_objeto=new nombre_constructor


        Coche miCoche=new Coche();
        miCoche.establece_color(JOptionPane.showInputDialog("Introduce el color del coche: "));//hay que establecer el set antes de hacer el get, aqui le estamos pasando un parámetro
        System.out.println(miCoche.dime_color());//hacer el get

        System.out.println(miCoche.dime_datos_generales());

        miCoche.configura_asientos(JOptionPane.showInputDialog("¿Dispone de asientos de cuero?"));
        System.out.println(miCoche.dimeAsientos());

        miCoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(miCoche.dimeClimatizador());

        System.out.println(miCoche.dime_peso_coche());// no hace falta establecerle la propiedad porque ya hacia los dos
        System.out.println("El precio total del coche es "+miCoche.PrecioCoche());


    }
}
