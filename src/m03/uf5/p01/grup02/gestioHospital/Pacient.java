package m03.uf5.p01.grup02.gestioHospital;

/**
 *
 * @author sergi.f.sellares
 */
public class Pacient extends Persona {
    public static int numHistorial = 0;
    Historial historial;
    
    public Pacient(String nom, String cognom1, String cognom2, String numSegSocial, String nif, String telefon) {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon);
        this.historial = new Historial(this);
    }
    
    public Historial getHistorial() {
        return historial;
    }
    
    @Override
    public String toString() {
        String chain;
        chain = getNom();
        chain = chain + ",";
        chain = chain + getCognom1();
        chain = chain + ",";
        chain = chain + getCognom2();
        chain = chain + ",";
        chain = chain + getNumSegSocial();
        chain = chain + ",";
        chain = chain + getNif();
        chain = chain + ",";
        chain = chain + getTelefon();
        return chain;
    }
}
