package m03.uf5.p01.grup02.gestioHospital;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Visita {

    private final LocalDateTime data;
    private final Metge metge;
    private final Malaltia malaltia;

    public Visita(LocalDateTime data, Metge metge, Malaltia malaltia) {
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
    
    @Override
    public String toString(){
        String chain;
        chain = "Data: "+data.format(DateTimeFormatter.ISO_DATE)+"\n";
        chain += "   "+data.format(DateTimeFormatter.ISO_TIME)+"\n";
        chain += "Metge\n";
        chain += "  "+metge.getNom()+"\n";
        chain += "  "+metge.getNif()+"\n";
        chain += "Malaltia\n";
        chain += "  "+malaltia.getNom();
        chain += "  "+malaltia.getCodi();
        return chain;
    }
}
