package lab4_miguelrojas.josevargas;

public class Golpeadores extends Jugador{
    
    private int reflejos;
    private int musculatura;

    public Golpeadores() {
    }


    public Golpeadores(int reflejos, int musculatura, String nombre, int anio, int num_uniforme, String rol) {
        super(nombre, anio, num_uniforme, rol);
        this.reflejos = reflejos;
        this.musculatura = musculatura;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int getMusculatura() {
        return musculatura;
    }

    public void setMusculatura(int musculatura) {
        this.musculatura = musculatura;
    }

    @Override
    public String toString() {
        return "Golpeadores{" + "reflejos=" + reflejos + ", musculatura=" + musculatura + '}';
    }
    
    
    public int fuerza(int musculatura){
        int fuerza = (musculatura * 2) - 7;
        return fuerza;
                
    }
    
    public int agilidad(int reflejos){
        int agilidad = reflejos + 7;
        return agilidad;
        
    }
    
}
