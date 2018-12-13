package m03.uf5.p01.grup02.gestioHospital;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author sergi.f.sellares
 */
public class Historial {
    static int numHistorial = 1;
    int codi;
    Pacient pacient;
    
    private ArrayList<Visita> visita;
    
    public Historial(Pacient pacient){
        codi = numHistorial++;
        visita = new ArrayList<>();
        this.pacient = pacient;
    }
    
    public int getCodi() {
        return codi;
    }
    
    public Pacient getPacient() {
        return pacient;
    }
    
    public void crearVisita(Metge metge, Malaltia malaltia){
        LocalDateTime s;
        s = LocalDateTime.now();
        visita.add(new Visita(s, metge, malaltia));
    }
    
    @Override
    public String toString() {
        return null;
        
    }
}
