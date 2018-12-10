package m03.uf5.p01.grup02.gestioHospital;

import java.util.ArrayList;

/**
 *
 * @author sergi.f.sellares
 */
public class Hospital {
    String nom;
    ArrayList<Pacient> pacients;
    ArrayList<Historial> historials;
    ArrayList<Metge> metges;
    ArrayList<Malaltia> malalties;
    Adreca adreca;
    
    public Hospital(String nom){
        this.nom = nom;
        pacients = new ArrayList<>();
        historials = new ArrayList<>();
        metges = new ArrayList<>();
        malalties = new ArrayList<>();
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
    
    public void afegirHistorial(Historial historial){
        historials.add(historial);
    }
}
