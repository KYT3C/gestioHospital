package m03.uf5.p01.grup02.gestioHospital;

import java.util.ArrayList;

public class Hospital {
    String nom;
    ArrayList<Pacient> pacients;
    ArrayList<Metge> metges;
    ArrayList<Malaltia> malalties;
    ArrayList<Historial> historials;
    Adreca adreca;
    
    public Hospital(String nom, Adreca adreca){
        this.nom = nom;
        pacients = new ArrayList<>();
        metges = new ArrayList<>();
        malalties = new ArrayList<>();
        historials = new ArrayList<>();
        this.adreca = adreca;
    }
    
    public void afegirPacient(Pacient pacient){
        pacients.add(pacient);
        historials.add(pacient.getHistorial());
    }
    
    public void afegirMetge(Metge metge){
        metges.add(metge);
    }
    
    public void afegirMalaltia(Malaltia malaltia){
        malalties.add(malaltia);
    }
    
    //Buscar pacients
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
    
    public Pacient buscarPacientCodiHistorial(int codi){
        for(Historial h : historials){
            if(h.getCodi() == codi)
                return h.getPacient();
        }
        return null;
    }
    
    //Buscar malalties
    public Malaltia buscarMalaltiaCodi(int codi){
        for(Malaltia m : malalties)
            if(m.getCodi() == codi)
                return m;
        return null;
    }
    
    //Buscar metges
    public Metge bucarMetgeNif(String nif){
        for(Metge m : metges)
            if(m.getNif().equals(nif))
                return m;
        return null;
    }
    
    public Metge buscarMetgeNumSeg(String SegSoc){
        for(Metge m: metges)
            if(m.getNumSegSocial().equals(SegSoc))
                return m;
        return null;
    }
    
    
    public Metge buscarMetgeNumEmpleat(int numEmpleat){
        for(Metge m: metges)
            if(m.getNumEmpleat() == numEmpleat)
                return m;
        return null;
    }
    
    //Buscar Historial
    
    public Historial buscarHistorial(int codi){
        for(Historial h: historials){
            if(h.codi == codi)
                return h;
        }
        return null;
    }
    
    //Crear visita
    /**
     * 
     * @param pacient pacient que fa la visita
     * @param metge metge que aten
     * @param malaltia malaltia diagnosticada
     */
    public void crearVisita(Pacient pacient, Metge metge, Malaltia malaltia){
        if(pacient == null || metge == null || malaltia == null){
            throw new NullPointerException("Uno de los parametros es null");
        }
        pacient.getHistorial().crearVisita(metge, malaltia);
    }
}
