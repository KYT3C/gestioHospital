package m03.uf5.p01.grup02.gestioHospital;

/**
 *
 * @author K Y T 3 C
 */
public class Adreca {
    
    private String ciutat;
    private int codiPostal;
    private String carrer;
    private int numero;
    private String planta;
    private String porta;
    
    public Adreca(String ciutat, int codiPostal, String carrer,int numero,String planta,String porta){
        this.ciutat = ciutat;
        this.codiPostal = codiPostal;
        this.carrer = carrer;
        this.numero = numero;
        this.planta = planta;
        this.porta = porta;
    }

    public String getCiutat() {
        return ciutat;
    }

    public int getCodiPostal() {
        return codiPostal;
    }

    public String getCarrer() {
        return carrer;
    }

    public int getNumero() {
        return numero;
    }

    public String getPlanta() {
        return planta;
    }

    public String getPorta() {
        return porta;
    }
}
