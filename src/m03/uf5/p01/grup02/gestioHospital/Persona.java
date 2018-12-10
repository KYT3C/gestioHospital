package m03.uf5.p01.grup02.gestioHospital;

/**
 *
 * @author K Y T 3 C
 */
public abstract class Persona {
    
    private final String nom;
    private final String cognom1;
    private final String cognom2;
    private final String numSegSocial;
    private final String nif;
    private final String telefon;

    public Persona(String nom, String cognom1, String cognom2, String numSegSocial, String nif, String telefon) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.numSegSocial = numSegSocial;
        this.nif = nif;
        this.telefon = telefon;
    }
    
}
