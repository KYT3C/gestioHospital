package m03.uf5.p01.grup02.gestioHospital;

import java.time.LocalDateTime;

/**
 *
 * @author sergi.f.sellares
 */
public class Historial {
    static int numHistorial = 1;
    int codi;
    LocalDateTime data;
    String nom;
    String cognom1;
    String cognom2;
    String malaltia;
    
    private static Visita[] visita = new Visita[codi];
    
    public Historial(LocalDateTime data, String nom, String cognom1, String cognom2, String malaltia){
        codi = numHistorial++;
        this.data = data;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.malaltia = malaltia;
    }
    
    public int getCodi() {
        return codi;
    }

    public static int getNumHistorial() {
        return numHistorial;
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
