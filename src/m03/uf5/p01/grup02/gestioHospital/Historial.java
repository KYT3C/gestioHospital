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
    Metge metge;
    Malaltia malaltia;
    
    private ArrayList<Visita> visita;
    
    public Historial(LocalDateTime data, Metge metge, Malaltia malaltia){
        visita = new ArrayList<>();
        codi = numHistorial++;
        this.metge = metge;
        this.malaltia = malaltia;
    }
    
    public int getCodi() {
        return codi;
    }
    
    public Metge getMetge(){
        return metge;
    }
    
    public Malaltia getMalaltia() {
        return malaltia;
    }
    
    public void crearVisita(){
        LocalDateTime s;
        s = LocalDateTime.now();
        visita.add(new Visita(s,getMetge(),getMalaltia())); 
    }
}
