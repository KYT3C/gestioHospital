package m03.uf5.p01.grup02.gestioHospital;

/**
 *
 * @author sergi.f.sellares
 */
public class Pacient extends Persona {
    public static int numHistorial = 0;
    
    
    private static Historial[] historial = new Historial[numHistorial];

    public Pacient(String nom, String cognom1, String cognom2, String numSegSocial, String nif, String telefon) {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon);
    }
    
    @Override
    public String toString() {
        return null;
        
    }
}
