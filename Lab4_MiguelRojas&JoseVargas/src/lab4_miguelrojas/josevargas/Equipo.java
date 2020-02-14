package lab4_miguelrojas.josevargas;

import java.util.ArrayList;

public class Equipo {
    
    private String casa;
    private int partidos_win;
    private int partidos_lost;
    private int prom_agilidad;
    private int prom_velocidad;
    private int prom_fuerza;
    ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo() {
    }

    public Equipo(String casa, int partidos_win, int paridos_lost, int prom_agilidad, int prom_velocidad, int prom_fuerza) {
        this.casa = casa;
        this.partidos_win = partidos_win;
        this.partidos_lost = paridos_lost;
        this.prom_agilidad = prom_agilidad;
        this.prom_velocidad = prom_velocidad;
        this.prom_fuerza = prom_fuerza;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getPartidos_win() {
        return partidos_win;
    }

    public void setPartidos_win(int partidos_win) {
        this.partidos_win = partidos_win;
    }

    public int getParidos_lost() {
        return partidos_lost;
    }

    public void setParidos_lost(int paridos_lost) {
        this.partidos_lost = paridos_lost;
    }

    public int getProm_agilidad() {
        return prom_agilidad;
    }

    public void setProm_agilidad(int prom_agilidad) {
        this.prom_agilidad = prom_agilidad;
    }

    public int getProm_velocidad() {
        return prom_velocidad;
    }

    public void setProm_velocidad(int prom_velocidad) {
        this.prom_velocidad = prom_velocidad;
    }

    public int getProm_fuerza() {
        return prom_fuerza;
    }

    public void setProm_fuerza(int prom_fuerza) {
        this.prom_fuerza = prom_fuerza;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return " Casa = " + casa + " | Partidos Ganados = " + partidos_win + " | Partidos Perdidos = " + partidos_lost + " | PromedioAgilidad = " + prom_agilidad + " | PromedioVelocidad=" + prom_velocidad + " | PromedioFuerza = " + prom_fuerza + " | Jugadores=" + jugadores + '}';
    }
    
    
}
