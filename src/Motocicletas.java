import Enums.COLORES;

import java.io.Serializable;

public class Motocicletas extends Vehiculos implements Serializable {
    private int cc;

    private COLORES color;
    public Motocicletas(){}

    public Motocicletas(int anio, int km, int cc,COLORES color) {
        super(anio, km);
        this.cc = cc;
        this.color = color;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public COLORES getColor() {
        return color;
    }

    public void setColor(COLORES color) {
        this.color = color;
    }

    public String NecesitaMantenimiento(){
        if(getKm() == 0){
            return "No necesita mantenimiento";
        }else{
            return "Necesita manteniemiento";
        }
    }
}
