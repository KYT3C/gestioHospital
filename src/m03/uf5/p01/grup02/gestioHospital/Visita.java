package m03.uf5.p01.grup02.gestioHospital;

import java.time.LocalDateTime;

/**
 *
 * @author sergi.f.sellares
 */
public class Visita {
    private final LocalDateTime data;
    private final String nom;
    private final String cognom1;
    private final String cognom2;
    private final String malaltia;
    
    public Visita(LocalDateTime data, String nom, String cognom1, String cognom2, String malaltia){
        this.data = data;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.malaltia = malaltia;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom1() {
        return cognom1;
    }
    
    public String getCognom2() {
        return cognom2;
    }

    public String getMalaltia() {
        return malaltia;
    }
}
