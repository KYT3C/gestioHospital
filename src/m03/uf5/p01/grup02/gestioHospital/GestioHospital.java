package m03.uf5.p01.grup02.gestioHospital;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

                System.out.println("Ha seleccionat registrar visita");
                System.out.println("");
            
            }
            
            //Opción para crear nuevo paciente.
            if(option == 2){
            
                //Comprueba si el nombre solo contiene letras.
                String nombre = "Gonzalo3";
                
                System.out.println("Ha seleccionat nou pacient");
                System.out.println("");

                try{
                CharSequence inputStr = nombre;
                Pattern pattern = Pattern.compile("^[a-zA-Z\\s]*$");
                Matcher matcher = pattern.matcher(inputStr);
                
                if(matcher.matches()){
                    System.out.println("El nom s'ha introduït correctament");
                }else{ throw new Exception("El nom que s'ha introduït no és vàlid"); }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

 
            }
            
            //Opción para mostrar un paciente.
            if(option == 3){
            
                System.out.println("Ha seleccionat mostrar pacient");
                System.out.println("");
            
            }
            
            //Opción mstrar un médico.
            if(option == 4){
            
                System.out.println("Ha seleccionat mostrar metge");
                System.out.println("");
            
            }
            
            //Opción para ver el historial.
            if(option == 5){
            
                System.out.println("Ha seleccionat veure historial");
                System.out.println("");
            
            }
            
            //Opción para salir.
            if(option == 6){
            
                System.out.println("Ha seleccionat sortir");
                System.out.println("");
            
            }
            
        }while(option > 6);
    }

    //Método que muestra el menú.
    private static void menu() {
        
        System.out.println("        Menú");
        System.out.println("1. Registrar visita");
        System.out.println("2. Nou pacient");
        System.out.println("3. Mostrar pacient");
        System.out.println("4. Mostrar metge");
        System.out.println("5. Veure historial");
        System.out.println("6. Sotir");
        
        System.out.println("");
        
    }

}
