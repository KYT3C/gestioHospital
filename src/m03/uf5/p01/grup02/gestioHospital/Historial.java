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

    private final ArrayList<Visita> visita;

    public Historial(Pacient pacient) {
        codi = numHistorial++;
        this.pacient = pacient;
        visita = new ArrayList<>();
    }

    public int getCodi() {
        return codi;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void crearVisita(Metge metge, Malaltia malaltia) {
        LocalDateTime s;
        s = LocalDateTime.now();
        visita.add(new Visita(s, metge, malaltia));
    }

    @Override
    public String toString() {
        String chain;
        chain = Integer.toString(codi);
        chain = chain + ",";
        chain = chain + pacient.toString();
        chain = chain + ",";
        chain = chain + visita.size();
        chain = chain + ",";
        chain = chain + visita.toString();
        return chain;
    }
}
