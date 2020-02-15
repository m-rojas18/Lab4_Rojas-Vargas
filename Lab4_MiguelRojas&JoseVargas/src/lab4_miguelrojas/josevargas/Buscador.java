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
        return "Nombre = " + nombre + " | Año = " + anio + " | Numero = " + num_uniforme + " | Rol=" + rol;
    }
    
    public int velocidad(int peso){
        int velocity = (200/this.peso) * 7;
        return velocity;
    }   
}
