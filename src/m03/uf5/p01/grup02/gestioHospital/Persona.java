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
    private final Adreca adreca;

    public Persona(String nom, String cognom1, String cognom2, String numSegSocial, String nif, String telefon, Adreca adreca) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.numSegSocial = numSegSocial;
        this.nif = nif;
        this.telefon = telefon;
        this.adreca = adreca;
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

    public String getNumSegSocial() {
        return numSegSocial;
    }

    public String getNif() {
        return nif;
    }

    public String getTelefon() {
        return telefon;
    }
   
    public Adreca getAdreca(){
        return adreca;
    }
}
