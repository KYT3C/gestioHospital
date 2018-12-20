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
        chain = "    Metge    \n";
        chain = chain + "Nom: " + getNom() + "\n";
        chain = chain + "Primer cognom: " + getCognom1() + "\n";
        chain = chain + "Segon cognom: " + getCognom2() + "\n";
        chain = chain + "NIF: " + getNif() + "\n";
        chain = chain + "Número Seguretat Social: " + getNumSegSocial() + "\n";
        chain = chain + "Telefon: " + getTelefon() + "\n";
        chain = chain + "Número d'empleat: " + getNumEmpleat() + "\n";
        chain = chain + "Salari mensual: " + getSalariMensual() + "\n";
        return chain;
    }
}
