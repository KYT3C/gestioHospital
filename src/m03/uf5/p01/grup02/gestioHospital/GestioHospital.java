package m03.uf5.p01.grup02.gestioHospital;

import java.util.Scanner;
/**
 *
 * @author K Y T 3 C
 */
public class GestioHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int option = 0;
        
        menu();
        
        System.out.print("Introdueix una opció : ");
        option = keyboard.nextInt();
        
        do{
            
            //Opción para registrar la visita.
            if(option == 1){
            
                System.out.println("Registrar visita");
                System.out.println("");
            
            }
            
            //Opción para crear nuevo paciente.
            if(option == 2){
            
                System.out.println("Nou pacient");
                System.out.println("");
            
            }
            
            //Opción para mostrar un paciente.
            if(option == 3){
            
                System.out.println("Mostrar pacient");
                System.out.println("");
            
            }
            
            //Opción mstrar un médico.
            if(option == 4){
            
                System.out.println("Mostrar metge");
                System.out.println("");
            
            }
            
            //Opción para ver el historial.
            if(option == 5){
            
                System.out.println("Veure historial");
                System.out.println("");
            
            }
            
            //Opción para salir.
            if(option == 6){
            
                System.out.println("Sortir");
                System.out.println("");
            
            }
            
        }while(option > 6);
    }

    //Método que muestra el menú.
    private static void menu() {
        
        System.out.println("        Menu");
        System.out.println("1. Registrar visita");
        System.out.println("2. Nou pacient");
        System.out.println("3. Mostrar pacient");
        System.out.println("4. Mostrar metge");
        System.out.println("5. Veure historial");
        System.out.println("6. Sotir");
        
        System.out.println("");
        
    }
    
}
