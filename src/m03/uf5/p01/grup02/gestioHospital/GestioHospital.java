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
        
        int option;
        creaHospital();

        Scanner keyboard = new Scanner(System.in);

        do {
            option = 0;
            menu();
            System.out.print("Introdueix una opció : ");
            option = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("");

            //Opción para registrar la visita.
            switch (option) {
                //Opción para crear nuevo paciente.
                case 1:
                    System.out.println("Ha seleccionat registrar visita");
                    System.out.println("");
                    System.out.print("Introdueix el NIF del teu pacient: ");
                    String pacient = keyboard.nextLine();
                    System.out.print("Introdueix el teu NIF: ");
                    String metge = keyboard.nextLine();
                    System.out.print("Introdueix el codi de la malaltia: ");
                    int malaltia = keyboard.nextInt();
                    System.out.println("");
                    h.crearVisita(h.buscarPacientNif(pacient), h.bucarMetgeNif(metge), h.buscarMalaltiaCodi(malaltia));
                    break;
                //Opción para mostrar un paciente.
                case 2:
                    //nom, cognom1, cognom2, numSegSocial, nif, telefon, adreca
                    System.out.println("Per crear un nou pacient necessitem totes les següents dades: ");
                    System.out.print("Introdueïx el teu nom : ");
                    String nombre = keyboard.next();
                    comprobarNombre(nombre);
                    System.out.println("");
                    System.out.println("Introdueix el teu primer cognom : ");
                    String cognom1 = keyboard.next();
                    comprobarNombre(cognom1);
                    System.out.println("");
                    System.out.println("Introdueix el teu segon cognom : ");
                    String cognom2 = keyboard.next();
                    comprobarNombre(cognom2);
                    System.out.println("");
                    System.out.println("Introdueix el teu número de la seguretat social : ");
                    String numSeguretatSocial = keyboard.next();
                    comprobarNumSeguretatSocial(numSeguretatSocial);
                    System.out.println("");
                    System.out.println("Introdueix el teu NIF : ");
                    String nif = keyboard.next();
                    comprobarNif(nif);
                    System.out.println("");
                    System.out.println("Introdueix el teu telèfon : ");
                    String telefon = keyboard.next();
                    comprobarTelefon(telefon);
                    System.out.println("");
                    System.out.println("Introdueix la teva adreça : ");
                    break;
                //Opción mstrar un médico.
                case 3:
                    do {
                        System.out.println("Ha seleccionat mostrar pacient");
                        System.out.println("");

                        System.out.println("Amb quina identificació vols buscar al pacient?");
                        System.out.println("");
                        System.out.println("1. NIF");
                        System.out.println("2. NSS");
                        System.out.println("3. CH");

                        System.out.print("Selecciona una opció: ");
                        option = keyboard.nextInt();
                        keyboard.nextLine();
                        System.out.println("");

                        if (option == 1) {
                            String buscar;
                            System.out.print("Introdueix el NIF del pacient: ");
                            buscar = keyboard.nextLine();
                            Pacient p = h.buscarPacientNif(buscar);
                            printPacient(p);
                        }
                        if (option == 2) {
                            String buscar;
                            System.out.print("Introdueix el NSS del pacient: ");
                            buscar = keyboard.nextLine();
                            Pacient p = h.buscarPacientNumSeg(buscar);
                            printPacient(p);
                        }
                        if (option == 3) {
                            int buscar;
                            System.out.print("Introdueix el CH del pacient: ");
                            buscar = keyboard.nextInt();
                            Pacient p = h.buscarPacientCodiHistorial(buscar);
                            printPacient(p);
                        }
                        if (option == 4) {
                            System.out.println("Tancant la sessió...");
                        }
                    } while (option != 4);
                    break;
                //Opción para ver el historial.
                case 4:
                    do {
                        System.out.println("Ha seleccionat mostrar metge");
                        System.out.println("");

                        System.out.println("Amb quina identificació vols buscar al metge?");
                        System.out.println("");
                        System.out.println("1. NIF");
                        System.out.println("2. NSS");
                        System.out.println("3. NE");

                        System.out.print("Selecciona una opció: ");
                        option = keyboard.nextInt();
                        keyboard.nextLine();
                        System.out.println("");

                        if (option == 1) {
                            String buscar;
                            System.out.print("Introdueix el NIF del metge: ");
                            buscar = keyboard.nextLine();
                            Metge m = h.bucarMetgeNif(buscar);
                            printMetge(m);
                        }
                        if (option == 2) {
                            String buscar;
                            System.out.print("Introdueix el NSS del metge: ");
                            buscar = keyboard.nextLine();
                            Metge m = h.buscarMetgeNumSeg(buscar);
                            printMetge(m);
                        }
                        if (option == 3) {
                            int buscar;
                            System.out.print("Introdueix el NE del metge: ");
                            buscar = keyboard.nextInt();
                            Metge m = h.buscarMetgeNumEmpleat(buscar);
                            printMetge(m);
                        }
                        if (option == 4) {
                            System.out.println("Tancant la sessió...");
                        }
                    } while (option != 4);
                    break;
                //Opción para salir.
                case 5:
                    System.out.println("Ha seleccionat veure historial");
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Ha seleccionat sortir");
                    System.out.println("");
                    break;
                default:
                    break;
            }

        } while (option != 6);
    }

    //Método que muestra el menú.
    private static void menu() {

        System.out.println("        Menú        ");
        System.out.println("1. Registrar visita");
        System.out.println("2. Nou pacient");
        System.out.println("3. Mostrar pacient");
        System.out.println("4. Mostrar metge");
        System.out.println("5. Veure historial");
        System.out.println("6. Sotir");

        System.out.println("");

    }

    //Método que muestra el paciente.
    private static void printPacient(Pacient p) {

        System.out.println("");
        System.out.println("    Pacient    ");
        System.out.println("Nom: " + p.getNom());
        System.out.println("Primer cognom: " + p.getCognom1());
        System.out.println("Segon cognom: " + p.getCognom2());
        System.out.println("NIF: " + p.getNif());
        System.out.println("Número Seguretat Social: " + p.getNumSegSocial());
        System.out.println("Telefon: " + p.getTelefon());

        System.out.println("");

    }

    private static void printMetge(Metge m) {

        System.out.println("");
        System.out.println("    Metge    ");
        System.out.println("Nom: " + m.getNom());
        System.out.println("Primer cognom: " + m.getCognom1());
        System.out.println("Segon cognom: " + m.getCognom2());
        System.out.println("NIF: " + m.getNif());
        System.out.println("Número Seguretat Social: " + m.getNumSegSocial());
        System.out.println("Telefon: " + m.getTelefon());
        System.out.println("Número d'empleat: " + m.getNumEmpleat());
        System.out.println("Slari mensual: " + m.getSalariMensual());

        System.out.println("");

    }

    public static void creaHospital() {
        h = new Hospital("Hospital General", new Adreca("Terrassa", 8228, "C/ Baivén", 34, "-", "-"));
        h.afegirMalaltia(new Malaltia("Refredat", false, "Sopa y mocadors", 5));
        h.afegirMalaltia(new Malaltia("Grip", true, "Antigrip PlusUltra", 15));
        h.afegirMalaltia(new Malaltia("Insomni", false, "Dormidina", 3));

        //nom, cognom1, cognom2, numSegSocial, nif, numEmpleat, salariMensual, codiCompteCorrent, telefon, adreca
        h.afegirMetge(new Metge("Anastasio", "Verde", "Pistacho", "40 12345678 42", "45932905L", 1, 15000, "ES6621000418401234567891", "905236245", new Adreca("Terrassa", 8228, "C/ Cardo", 10, "1º", "3ª")));
        h.afegirMetge(new Metge("Patricia", "Estrella", "Calamarda", "20 18372946 50", "45226855T", 2, 900, "ES9465489651491615156151", "645398256", new Adreca("Barcelona", 8123, "C/ Martín", 3, "-", "-")));
        h.afegirMetge(new Metge("Mario", "Caballo", "Tejas", "15 98765432 83", "44656565H", 3, 1200, "ES6618948488841162177423", "655321654", new Adreca("Sabadell", 8224, "C/ Rábada", 6, "2º", "1ª")));

        //nom, cognom1, cognom2, numSegSocial, nif, telefon, adreca
        h.afegirPacient(new Pacient("Maria", "Vazquez", "Escabeche", "32 56481379 02", "42159785A", "956363154", new Adreca("Terrassa", 8228, "C/ Teleñeco", 103, "2º", "4ª")));
        h.afegirPacient(new Pacient("Eugenio", "Caraca", "Varana", "21 45632198 55", "46323251D", "653215843", new Adreca("Terrassa", 8228, "C/ Vasquez", 7, "-", "-")));
        h.afegirPacient(new Pacient("Aitor", "Tilla", "Buena", "11 74185236 42", "43561532S", "651856493", new Adreca("Terrassa", 8228, "C/ Matinada", 4, "1º", "1ª")));

        h.crearVisita(h.buscarPacientNif("42159785A"), h.bucarMetgeNif("45932905L"), h.buscarMalaltiaCodi(5));
    }

    private static String comprobarNombre(String nombre) {

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

        return nombre;
    }

    private static void comprobarTelefon(String telefon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean comprobarNif(String nif) {
        char[] arrayLetrasNif = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        try {
            if (nif.length() == 9) {

                String nifSinLetra = nif.substring(0, nif.length() - 1);
                int nifSinLetraInt = Integer.parseInt(nifSinLetra);

                char letraNum = nif.charAt(8);
                String letraNumString = Character.toString(letraNum);
                int moduloNif = nifSinLetraInt % 23;

                comprobarNombre(letraNumString);

                return arrayLetrasNif[moduloNif] == letraNum;

            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean comprobarNumSeguretatSocial(String numSeguretatSocial) {
        try {
            long num;
            num = Integer.parseInt(numSeguretatSocial.substring(0, 2));
            if (!((num <= 50 && num >= 1) || num == 53 || num == 66)) {
                return false;
            }
            long num2 = Integer.parseInt(numSeguretatSocial.substring(3, 11));

            num2 = num2 + num * 100000000;
            long lastNum = Integer.parseInt(numSeguretatSocial.substring(12, 14));

            return num2 % 97 == lastNum;
        } catch (Exception e) {
            return false;
        }
    }
}
