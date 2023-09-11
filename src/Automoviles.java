import Enums.COLORES;
import Enums.MARCA;

import java.io.Serializable;

public class Automoviles extends Vehiculos implements Serializable, Mantenimiento {
    private MARCA marca;
    private COLORES color;
    private Boolean motor;

    public Automoviles(){};
    public Automoviles(MARCA marca, COLORES color,Boolean motor) {
        this.marca = marca;
        this.color = color;
        this.motor = motor;
    }

    public Automoviles(int anio, int km, MARCA marca, COLORES color, Boolean motor) {
        super(anio, km);
        this.marca = marca;
        this.color = color;
        this.motor = motor;
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

    public Boolean getMotor() {
        return motor;
    }

    public void setMotor(Boolean motor) {
        this.motor = motor;
    }

    @Override
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
