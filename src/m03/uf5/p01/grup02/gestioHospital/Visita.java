package m03.uf5.p01.grup02.gestioHospital;

import java.time.LocalDateTime;

/**
 *
 * @author sergi.f.sellares
 */
public class Visita {
    private final LocalDateTime data;
    private final Metge metge;
    private final Malaltia malaltia;
    
    public Visita(LocalDateTime data, Metge metge, Malaltia malaltia){
        this.data = data;
        this.metge = metge;
        this.malaltia = malaltia;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Metge getMetge() {
        return metge;
    }

    public Malaltia getMalaltia() {
        return malaltia;
    }
}
