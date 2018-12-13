package m03.uf5.p01.grup02.gestioHospital;

/**
 *
 * @author K Y T 3 C
 */
public class Metge extends Persona{
    
    private int numEmpleat;
    private int salariMensual;
    private String codiCompteCorrent;

    public Metge(String nom, String cognom1, String cognom2, String numSegSocial, String nif, String telefon) {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon);
    }
    
    public int getNumEmpleat(){
        return numEmpleat;
    }
    @Override
   public String toString(){
        return null;
   
   }
}
