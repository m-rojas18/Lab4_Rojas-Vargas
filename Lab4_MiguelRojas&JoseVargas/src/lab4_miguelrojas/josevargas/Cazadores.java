package lab4_miguelrojas.josevargas;

public class Cazadores extends Jugador{
    
    private int peso;
    private int reflex;

    public Cazadores() {
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getReflex() {
        return reflex;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    @Override
    public String toString() {
        return "Cazadores{" + "peso=" + peso + ", reflex=" + reflex + '}';
    }
    
    public int velocidad(int peso){
        int velocidad = (200/peso) * 7;
        return velocidad;
    }
    
    public int agilidad(int reflex){
        int agilidad = reflex + 7;
        return agilidad;
    }
    
}
