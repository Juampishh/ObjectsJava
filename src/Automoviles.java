import Enums.COLORES;
import Enums.MARCA;

import java.io.Serializable;
import java.util.Scanner;

public class Automoviles extends Vehiculos implements Serializable, Mantenimiento {
    private MARCA marca;
    private COLORES color;

    public Automoviles(){};
    public Automoviles(MARCA marca, COLORES color) {
        this.marca = marca;
        this.color = color;
    }

    public Automoviles(int anio, int km, MARCA marca, COLORES color) {
        super(anio, km);
        this.marca = marca;
        this.color = color;
    }

    public MARCA getMarca() {
        return marca;
    }

    public void setMarca(MARCA marca) {
        this.marca = marca;
    }

    public COLORES getColor() {
        return color;
    }

    public void setColor(COLORES color) {
        this.color = color;
    }

    @Override
    public String NecesitaMantenimiento() {
       if(getKm() == 0){
           return "No necesita mantenimiento el auto es 0km";
       }else{
           return "Necesita mantenimiento";
       }
    }
}
