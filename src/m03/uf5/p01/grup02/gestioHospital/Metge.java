package m03.uf5.p01.grup02.gestioHospital;

public class Metge extends Persona {

    private final int numEmpleat;
    private final int salariMensual;
    private final String codiCompteCorrent;

    public Metge(String nom, String cognom1, String cognom2, String numSegSocial, String nif, int numEmpleat, int salariMensual, String codiCompteCorrent, String telefon, Adreca adreca) {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon, adreca);
        this.salariMensual = salariMensual;
        this.codiCompteCorrent = codiCompteCorrent;
        this.numEmpleat = numEmpleat;
    }

    public int getNumEmpleat() {
        return numEmpleat;
    }

    public int getSalariMensual() {
        return salariMensual;
    }

    public String getCodiCompteCorrent() {
        return codiCompteCorrent;
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
        chain = chain + ",";
        chain = chain + getNumEmpleat();
        chain = chain + ",";
        chain = chain + getSalariMensual();
        chain = chain + ",";
        chain = chain + getCodiCompteCorrent();
        return chain;
    }
}
