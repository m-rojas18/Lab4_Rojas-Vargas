package lab4_miguelrojas.josevargas;

public class Cazadores extends Jugador{
    
    private int peso;
    private int reflex;

    public Cazadores() {
    }


    public Cazadores(int peso, int reflex, String nombre, int anio, int num_uniforme, String rol) {
        super(nombre, anio, num_uniforme, rol);
        this.peso = peso;
        this.reflex = reflex;
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
        return "Nombre = " + nombre + " | Año = " + anio + " | Numero = " + num_uniforme + " | Rol=" + rol;
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
