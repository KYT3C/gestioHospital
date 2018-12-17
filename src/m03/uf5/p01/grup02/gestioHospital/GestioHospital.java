package m03.uf5.p01.grup02.gestioHospital;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author K Y T 3 C
 */
public class GestioHospital {

    static Hospital h;
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int option = 0;

        menu();

        do {
            System.out.print("Introdueix una opció : ");
            option = keyboard.nextInt();
            System.out.println("");

            //Opción para registrar la visita.
            if (option == 1) {

                System.out.println("Ha seleccionat registrar visita");
                System.out.println("");

            } //Opción para crear nuevo paciente.
            else if (option == 2) {

                //Comprueba si el nombre solo contiene letras.
                String nombre = "";

                System.out.println("Ha seleccionat nou pacient");
                System.out.println("");

                try {
                    CharSequence inputStr = nombre;
                    Pattern pattern = Pattern.compile("^[a-zA-Z\\s]*$");
                    Matcher matcher = pattern.matcher(inputStr);

                    if (matcher.matches()) {
                        System.out.println("El nom s'ha introduït correctament");
                    } else {
                        throw new Exception("El nom que s'ha introduït no és vàlid");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } //Opción para mostrar un paciente.
            else if (option == 3) {

                System.out.println("Ha seleccionat mostrar pacient");
                System.out.println("");
                
                System.out.println("Amb quina identificació vols buscar al pacient?");
                System.out.println("");
                System.out.println("1. NIF");
                System.out.println("2. NSS");
                System.out.println("3. CH");

                do {
                    String buscar;
                    System.out.print("Selecciona una opció: ");
                    option = keyboard.nextInt();
                    System.out.println("");

                    if (option == 1) {
                        System.out.print("Introdueix el NIF del pacient: ");
                        buscar = keyboard.nextLine();
                        h.buscarPacientNif(buscar);
                    }
                    if (option == 2) {
                        System.out.print("Introdueix el NSS del pacient: ");
                        buscar = keyboard.nextLine();
                        h.buscarPacientNumSeg(buscar);
                    }
                    if (option == 3) {
                        System.out.print("Introdueix el NE del pacient: ");
                        buscar = keyboard.nextLine();
                        h.buscarPacientCodiHistorial(Integer.parseInt(buscar));
                    }
                    if (option == 4) {
                        System.out.println("Tancant la sessió...");
                    }
                } while (option != 4);

            } //Opción mstrar un médico.
            else if (option == 4) {

                System.out.println("Ha seleccionat mostrar metge");
                System.out.println("");

                System.out.println("Amb quina identificació vols buscar al metge?");
                System.out.println("");
                System.out.println("1. NIF");
                System.out.println("2. NSS");
                System.out.println("3. NE");

                do {
                    String buscar;
                    System.out.print("Selecciona una opció: ");
                    option = keyboard.nextInt();
                    System.out.println("");

                    if (option == 1) {
                        String buscar = null;
                    }
                    if (option == 2) {
                        System.out.print("Introdueix el NSS del metge: ");
                        buscar = keyboard.nextLine();
                        h.buscarMetgeNumSeg(buscar);
                    }
                    if (option == 3) {
                        System.out.print("Introdueix el NE del metge: ");
                        buscar = keyboard.nextLine();
                        h.buscarMetgeNumEmpleat(buscar);
                    }
                    if (option == 4) {
                        System.out.println("Tancant la sessió...");
                    }
                } while (option != 4);

            } //Opción para ver el historial.
            else if (option == 5) {

                System.out.println("Ha seleccionat veure historial");
                System.out.println("");

            } //Opción para salir.
            else if (option == 6) {

                System.out.println("Ha seleccionat sortir");
                System.out.println("");

            }

        } while (option != 6);
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

    public static void creaHospital(){
        h = new Hospital("Hospital General", new Adreca("Terrassa",8228,"C/ Baivén", 34,"0ª","1ª"));
        h.afegirMalaltia(new Malaltia("Refredat", false, "Sopa y mocadors", 5));
        h.afegirMalaltia(new Malaltia("Grip", true, "Antigrip PlusUltra", 15));
        h.afegirMalaltia(new Malaltia("Insomni", false, "Dormidina", 3));
        
        h.afegirMetge(new Metge("Ignacio","Verde","Pistacho", "40 12345678 42", "45932905L", "905236245",new Adreca("Terrassa",8228,"C/ Cardo", 10,"1º","3ª")));
    }
}
