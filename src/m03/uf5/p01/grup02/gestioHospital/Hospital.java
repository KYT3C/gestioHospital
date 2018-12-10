package m03.uf5.p01.grup02.gestioHospital;

import java.util.ArrayList;

/**
 *
 * @author sergi.f.sellares
 */
public class Hospital {
    String nom;
    ArrayList<Pacient> pacients;
    ArrayList<Metge> metges;
    ArrayList<Malaltia> malalties;
    Adreca adreca;
    
    public Hospital(String nom, String adreca){
        this.nom = nom;
        pacients = new ArrayList<>();
        metges = new ArrayList<>();
        malalties = new ArrayList<>();
        this.adreca = new Adreca();
    }
    
    public void afegirPacient(Pacient pacient){
        pacients.add(pacient);
    }
    
    public void afegirMetge(Metge metge){
        metges.add(metge);
    }
    
    public void afegirMalaltia(Malaltia malaltia){
        malalties.add(malaltia);
    }
    
    public Pacient buscarPacientNif(String nif){
        
        for(Pacient n : pacients){
            if(n.getNif().equals(nif))
                return n;
        }
        return null;
    }
    
    public Pacient buscarPacientNumSeg(String SegSoc){
        
        for(Pacient n : pacients){
            if(n.getNumSegSocial().equals(SegSoc))
                return n;
        }
        return null;
    }
}
