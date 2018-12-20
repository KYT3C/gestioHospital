package m03.uf5.p01.grup02.gestioHospital;

public class Pacient extends Persona {
    public static int numHistorial = 0;
    Historial historial;
    
    public Pacient(String nom, String cognom1, String cognom2, String numSegSocial, String nif, String telefon, Adreca adreca) {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon, adreca);
        this.historial = new Historial(this);
    }
    
    public Historial getHistorial() {
        return historial;
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
        return chain;
    }
}
