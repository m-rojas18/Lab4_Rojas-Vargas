package lab4_miguelrojas.josevargas;

public class Buscador extends Jugador{
    
    private int peso;

    public Buscador() {
        
    }

    public Buscador(int peso, String nombre, int anio, int num_uniforme, String rol) {
        super(nombre, anio, num_uniforme, rol);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Buscador{" + "peso=" + peso + '}';
    }
    
    
    
}
