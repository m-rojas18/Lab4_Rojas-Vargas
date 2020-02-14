package lab4_miguelrojas.josevargas;

import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private int anio;
    private int num_uniforme;
    private String rol;

    public Jugador() {

    }

    public Jugador(String nombre, int anio, int num_uniforme, String rol) {
        this.nombre = nombre;
        this.anio = anio;
        this.num_uniforme = num_uniforme;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNum_uniforme() {
        return num_uniforme;
    }

    public void setNum_uniforme(int num_uniforme) {
        this.num_uniforme = num_uniforme;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + " | Año = " + anio + " | Numero = " + num_uniforme + " | Rol=" + rol;
    }

    public int velocidad() {
        return 0;
    }

    public int agilidad() {
        return 0;
    }
    
    public int fuerza(){
        return 0;
    }
}
