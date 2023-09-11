import java.io.Serializable;

public abstract class Vehiculos implements Serializable {
    private int anio;
    private int km;

    public Vehiculos(){};

    public Vehiculos(int anio, int km) {
        this.anio = anio;
        this.km = km;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
