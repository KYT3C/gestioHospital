package m03.uf5.p01.grup02.gestioHospital;

import java.util.Scanner;

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
       Scanner keyboard = new Scanner(System.in);
        int option;
        
        System.out.println("¿Por que método quieres encontrar al médico?");
        System.out.println("");
        System.out.println("1. NIF");
        System.out.println("2. NSS");
        System.out.println("3. NE");
        
        do{
            System.out.print("Selecciona una opción : ");
            option = keyboard.nextInt();
            System.out.println("");
            
            if(option == 1){
            
            }
            if(option == 2){
            
            }
            if(option == 3){
            
            }
            if(option == 4){
                System.out.println("Cerrando sesión...");
            }
        }while(option != 4);
        return null;
   
   }
}
