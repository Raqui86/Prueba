package poo;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int pesoTotal;
    private boolean climatizador, asientos_cuero;

//un método setter se puede llamar como quieras
    public void configura_climatizador(String climatizador){//SETTER
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador= false;
        }
    }
    public String dimeClimatizador(){//GETTER
        if(climatizador==true){
            return "El coche incorpora climatizador";
        }else{
          return "El coche no incorpora climatizador";
        }
    }
    public void configura_asientos(String asientos_cuero) {//SET
        //aquí el nombre de la variable y del parametro que se pasan se llaman igual
        if (asientos_cuero.equalsIgnoreCase("si")){
            //esto es para que si la variable asientos_cuero booleano da si, la variable string con el mismo nombre dara un string positivo
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }
    public String dimeAsientos(){//GET
        if(asientos_cuero==true){
            return"El coche tiene asientos de cuero";
        }
        else{
            return "El coche tiene asientos de serie";
        }
    }
    public void establece_color(String color_coche){//un metodo setter porque modifica el dato le decimos que le pasamos un parametro
    color=color_coche;
    }

    public String dime_color() {//el getter puede llevar otro nombre y este muestra el valor
        return "El color del coche es "+ color;
    }

    public String dime_datos_generales(){//GETTER para que me devuelva todos los datos del coche
     return("La plataforma del vehiculo tiene "+ruedas+" ruedas. Mide "+largo/1000+" metros con un ancho de "+ancho+
             " cm y un peso de plataforma "+peso_plataforma+" kg.");
    }
    //METODO QUE ES GETTER Y SETTER NO RECOMENDADO
    public String dime_peso_coche() {
        int peso_carroceria = 500;
        //el peso total de un coche sin extras es:
        pesoTotal = peso_plataforma + peso_carroceria;

        if (asientos_cuero == true) {
            pesoTotal = pesoTotal + 50;
        } if(climatizador==true) {
            pesoTotal=pesoTotal+20;
        }
        return "El peso total del coche es "+pesoTotal;
    }
    public int PrecioCoche(){
        int precioFinal=10000;
        if(asientos_cuero==true){
            precioFinal+=2000;
        }
        if(climatizador==true){
            precioFinal+=1500;
        }
        return precioFinal;
    }

    //METODO CONSTRUCTOR: en el que se inician las propiedades
    public Coche(){
      ruedas=4;
      largo=2000;
      ancho=300;
      motor=1600;
      peso_plataforma=500;
    }

}
