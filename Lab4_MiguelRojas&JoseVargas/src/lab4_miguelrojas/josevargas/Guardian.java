package lab4_miguelrojas.josevargas;

public class Guardian extends Jugador {

    private int reflejo;

    public Guardian() {
        super();
    }


    public Guardian(int reflejo, String nombre, int anio, int num_uniforme, String rol) {
        super(nombre, anio, num_uniforme, rol);
        this.reflejo = reflejo;
    }


        
    public int getReflejo() {
        return reflejo;
    }

    public void setReflejo(int reflejo) {
        this.reflejo = reflejo;
    }

    @Override
    public String toString() {
        return "Guardian{" + "reflejo=" + reflejo + '}';
    }
    
    
    

}
