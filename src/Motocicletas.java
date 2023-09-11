import Enums.COLORES;
import Enums.MOTOMARCA;

import java.io.Serializable;

public class Motocicletas extends Vehiculos implements Serializable {
    private int cc;
    private Boolean motor;
    private COLORES color;
    private MOTOMARCA marca;
    public Motocicletas(){}

    public Motocicletas(int anio, int km, int cc,COLORES color,Boolean motor,MOTOMARCA marca) {
        super(anio, km);
        this.cc = cc;
        this.color = color;
        this.motor = motor;
        this.marca = marca;
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

    public Boolean getMotor() {
        return motor;
    }

    public void setMotor(Boolean motor) {
        this.motor = motor;
    }

    public MOTOMARCA getMarca() {
        return marca;
    }

    public void setMarca(MOTOMARCA marca) {
        this.marca = marca;
    }

    public String NecesitaMantenimiento() {
        if(getMotor() == false){
            if (getKm() == 0){
                return "El auto es 0km el mantenimiento esta hecho";
            }
            return "El moto se encuentra en buen estado y no necesita mantenimiento";
        }else {
            return "El motor necesita mantenimiento";
        }
    }
}
