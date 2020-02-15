package lab4_miguelrojas.josevargas;

public class Guardian extends Jugador {

    private int reflej;

    public Guardian() {
        super();
    }


    public Guardian(int reflej, String nombre, int anio, int num_uniforme, String rol) {
        super(nombre, anio, num_uniforme, rol);
        this.reflej = reflej;
    }


        
    public int getReflej() {
        return reflej;
    }

    public void setReflej(int reflejo) {
        this.reflej = reflejo;
    }

     @Override
    public String toString() {
        return "Nombre = " + nombre + " | Año = " + anio + " | Numero = " + num_uniforme + " | Rol=" + rol;
    }
    
    
    public int agilidad(int reflej){
        int agilidad = reflej + 7;
        return agilidad;
    }
    
}
