package m03.uf5.p01.grup02.gestioHospital;

public class Malaltia {
    static int numMalaltia = 0;
    int codi;
    String nom;
    boolean donaBaixa;
    String tractament;
    int duradaDies;
    
    public Malaltia(String nom, boolean donaBaixa, String tractament, int duradaDies){
        codi = numMalaltia++;
        this.nom = nom;
        this.donaBaixa = donaBaixa;
        this.tractament = tractament;
        this.duradaDies = duradaDies;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getCodi(){
        return codi;
    }
    
    public boolean motiuDeBaixaLaboral(){
        return donaBaixa;
    }
    
    public String tractamentASeguir(){
        return tractament;
    }
    
    public int duradaDeTractament(){
        return duradaDies;
    }
}
