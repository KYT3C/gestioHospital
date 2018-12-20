package m03.uf5.p01.grup02.gestioHospital;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestioHospital {

    static Hospital h;
    static boolean valid;

    public static void main(String[] args) {

        int option;
        creaHospital();

        Scanner keyboard = new Scanner(System.in, "ISO-8859-1");

        do {
            menu();
            System.out.print("Introdueix una opció: ");

            option = obtenNumeroTeclado(keyboard);
            System.out.println("");

            switch (option) {
                //Opción para registrar la visita.
                case 1:
                    Pacient pacient = null;
                    Metge metge = null;
                    Malaltia malaltia;
                    String pacientSt,
                     metgeSt;
                    int pacientCH,
                     metgeNE,
                     malaltiaInt;

                    System.out.println("Ha seleccionat registrar visita");
                    System.out.println("");

                    System.out.println("Amb quina identificació vols buscar al pacient?");
                    System.out.println("");
                    System.out.println("1. NIF");
                    System.out.println("2. NSS");
                    System.out.println("3. Codi Historial");

                    System.out.print("Selecciona una opció: ");
                    int optionPacient = obtenNumeroTeclado(keyboard);
                    System.out.println("");

                    switch (optionPacient) {
                        case 1:
                            do {
                                System.out.print("Introdueix el NIF del pacient: ");
                                valid = comprobarNif(pacientSt = keyboard.nextLine());
                            } while (valid != true);
                            pacient = h.buscarPacientNif(pacientSt);
                            break;
                        case 2:
                            do {
                                System.out.print("Introdueix el NSS del pacient: ");
                                valid = comprobarNumSeguretatSocial(pacientSt = keyboard.nextLine());
                            } while (valid != true);
                            pacient = h.buscarPacientNumSeg(pacientSt);
                            break;
                        case 3:
                            do {
                                System.out.print("Introdueix el Codi Historial del pacient: ");
                                valid = h.buscarPacientCodiHistorial(pacientCH = obtenNumeroTeclado(keyboard)) != null;
                            } while (valid != true);
                            pacient = h.buscarPacientCodiHistorial(pacientCH);
                            break;
                    }

                    System.out.println("");
                    System.out.println("Amb quina identificació vols buscar al metge?");
                    System.out.println("");
                    System.out.println("1. NIF");
                    System.out.println("2. NSS");
                    System.out.println("3. Número empleat");

                    System.out.print("Selecciona una opció: ");
                    int optionMetge = obtenNumeroTeclado(keyboard);;
                    System.out.println("");

                    switch (optionMetge) {
                        case 1:
                            do {
                                System.out.print("Introdueix el NIF del metge: ");
                                valid = comprobarNif(metgeSt = keyboard.nextLine());
                            } while (valid != true);
                            metge = h.bucarMetgeNif(metgeSt);
                            break;
                        case 2:
                            do {
                                System.out.print("Introdueix el NSS del metge: ");
                                valid = comprobarNumSeguretatSocial(metgeSt = keyboard.nextLine());
                            } while (valid != true);
                            metge = h.buscarMetgeNumSeg(metgeSt);
                            break;
                        case 3:
                            do {
                                System.out.print("Introdueix el CE del metge: ");
                                valid = h.buscarMetgeNumEmpleat(metgeNE = obtenNumeroTeclado(keyboard)) != null;
                            } while (valid != true);
                            metge = h.buscarMetgeNumEmpleat(metgeNE);
                            break;
                    }

                    System.out.println("");
                    do {
                        System.out.print("Introdueix el codi de la malaltia: ");
                        valid = h.buscarMalaltiaCodi(malaltiaInt = obtenNumeroTeclado(keyboard)) != null;
                    } while (valid != true);
                    malaltia = h.buscarMalaltiaCodi(malaltiaInt);

                    System.out.println("");

                    h.crearVisita(pacient, metge, malaltia);
                    System.out.println("S'ha registrat la visita.");
                    System.out.println("");

                    break;
                //Opción para crear nuevo paciente.
                case 2:
                    //nom, cognom1, cognom2, numSegSocial, nif, telefon, adreca
                    String nombre,
                     cognom1,
                     cognom2,
                     numSeguretatSocial,
                     nif,
                     telefon;
                    System.out.println("Per crear un nou pacient necessitem totes les següents dades: ");

                    do {
                        System.out.print("Introdueïx el nom: ");
                        nombre = keyboard.nextLine();
                        valid = comprobarNombre(nombre);
                    } while (valid != true);

                    do {
                        System.out.print("Introdueix el primer cognom: ");
                        cognom1 = keyboard.nextLine();
                        valid = comprobarNombre(cognom1);
                    } while (valid != true);

                    do {
                        System.out.print("Introdueix el segon cognom: ");
                        cognom2 = keyboard.nextLine();
                        valid = comprobarNombre(cognom2);
                    } while (valid != true);

                    do {
                        System.out.print("Introdueix el número de la seguretat social: ");
                        numSeguretatSocial = keyboard.nextLine();
                        valid = comprobarNumSeguretatSocial(numSeguretatSocial);
                    } while (valid != true);

                    do {
                        System.out.print("Introdueix el NIF: ");
                        nif = keyboard.nextLine();
                        valid = comprobarNif(nif);
                    } while (valid != true);

                    do {
                        System.out.print("Introdueix el telèfon: ");
                        telefon = keyboard.nextLine();
                        comprobarTelefon(telefon);
                    } while (valid != true);

                    Adreca adreca = creaAdreca();

                    h.afegirPacient(new Pacient(nombre, cognom1, cognom2, numSeguretatSocial, nif, telefon, adreca));

                    break;
                //Opción para mostrar un paciente.
                case 3:
                    System.out.println("Ha seleccionat mostrar pacient");
                    System.out.println("");

                    System.out.println("Amb quina identificació vols buscar al pacient?");
                    System.out.println("");
                    System.out.println("1. NIF");
                    System.out.println("2. NSS");
                    System.out.println("3. Codi Historial");

                    System.out.print("Selecciona una opció: ");
                    option = obtenNumeroTeclado(keyboard);;
                    System.out.println("");

                    switch (option) {
                        case 1: {
                            String buscar;
                            System.out.print("Introdueix el NIF del pacient: ");
                            buscar = keyboard.nextLine();
                            Pacient p = h.buscarPacientNif(buscar);
                            System.out.println(p.toString());
                            break;
                        }
                        case 2: {
                            String buscar;
                            System.out.print("Introdueix el NSS del pacient: ");
                            buscar = keyboard.nextLine();
                            Pacient p = h.buscarPacientNumSeg(buscar);
                            System.out.println(p.toString());
                            break;
                        }
                        case 3: {
                            int buscar;
                            System.out.print("Introdueix el CH del pacient: ");
                            buscar = obtenNumeroTeclado(keyboard);
                            Pacient p = h.buscarPacientCodiHistorial(buscar);
                            System.out.println(p.toString());
                            break;
                        }
                    }
                    break;
                //Opción mstrar un médico.
                case 4:
                    System.out.println("Ha seleccionat mostrar metge");
                    System.out.println("");

                    System.out.println("Amb quina identificació vols buscar al metge?");
                    System.out.println("");
                    System.out.println("1. NIF");
                    System.out.println("2. NSS");
                    System.out.println("3. Número empleat");

                    System.out.print("Selecciona una opció: ");
                    option = obtenNumeroTeclado(keyboard);;
                    System.out.println("");

                    switch (option) {
                        case 1: {
                            String buscar;
                            System.out.print("Introdueix el NIF del metge: ");
                            buscar = keyboard.nextLine();
                            Metge m = h.bucarMetgeNif(buscar);
                            System.out.println(m.toString());
                            break;
                        }
                        case 2: {
                            String buscar;
                            System.out.print("Introdueix el NSS del metge: ");
                            buscar = keyboard.nextLine();
                            Metge m = h.buscarMetgeNumSeg(buscar);
                            System.out.println(m.toString());
                            break;
                        }
                        case 3: {
                            int buscar;
                            System.out.print("Introdueix el NE del metge: ");
                            buscar = obtenNumeroTeclado(keyboard);
                            Metge m = h.buscarMetgeNumEmpleat(buscar);
                            System.out.println(m.toString());
                            break;
                        }
                    }
                    break;
                //Opción mstrar un médico.
                case 5:
                    System.out.println("Ha seleccionat mostrar malaltia");
                    System.out.println("");

                    for (int i = 0; i < h.malalties.size(); i++) {
                        System.out.println("Codi malaltia: " + h.malalties.get(i).getCodi() + "    Nom malaltia: " + h.malalties.get(i).getNom());
                    }

                    break;
                //Opción para ver el historial.
                case 6:
                    System.out.println("Ha seleccionat veure historial");
                    System.out.println("");
                    break;
                //Opción para salir.
                case 7:
                    System.out.println("Ha seleccionat sortir");
                    System.out.println("");
                    break;
                default:
                    break;
            }

        } while (option != 7);
    } //Método que muestra el menú.

    private static void menu() {

        System.out.println("        Menú        ");
        System.out.println("1. Registrar visita");
        System.out.println("2. Nou pacient");
        System.out.println("3. Mostrar pacient");
        System.out.println("4. Mostrar metge");
        System.out.println("5. Mostrar malalties");
        System.out.println("6. Veure historial");
        System.out.println("7. Sotir");

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
        h.afegirPacient(new Pacient("Maria", "Vazquez", "Escabeche", "32 56481379 95", "42159785A", "956363154", new Adreca("Terrassa", 8228, "C/ Teleñeco", 103, "2º", "4ª")));
        h.afegirPacient(new Pacient("Eugenio", "Caraca", "Varana", "21 45632198 55", "46323251D", "753215843", new Adreca("Terrassa", 8228, "C/ Vasquez", 7, "-", "-")));
        h.afegirPacient(new Pacient("Aitor", "Tilla", "Buena", "11 74185236 42", "43561532S", "651856493", new Adreca("Terrassa", 8228, "C/ Matinada", 4, "1º", "1ª")));

        h.crearVisita(h.buscarPacientNif("42159785A"), h.bucarMetgeNif("45932905L"), h.buscarMalaltiaCodi(1));
    }

    public static Adreca creaAdreca() {
        Adreca adreca1;
        String poblacio, carrer, pis, porta;
        int codiPostal, bloc;

        Scanner keyboard = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Creació de l'adreça");
        System.out.println("");

        System.out.print("Introdueix la població: ");
        poblacio = keyboard.nextLine();

        System.out.print("Introdueix el codi postal: ");
        codiPostal = obtenNumeroTeclado(keyboard);

        System.out.print("Introdueix el carrer: ");
        carrer = keyboard.nextLine();

        System.out.print("Introdueix el bloc: ");
        bloc = obtenNumeroTeclado(keyboard);

        System.out.print("Introdueix el pis: ");
        pis = keyboard.nextLine();

        System.out.print("Introdueix la porta: ");
        porta = keyboard.nextLine();

        adreca1 = new Adreca(poblacio, codiPostal, carrer, bloc, pis, porta);

        System.out.println("");
        return adreca1;
    }

    private static int obtenNumeroTeclado(Scanner keyboard) {
        boolean valido = true;
        int cod;
        while (true) {
            try {
                cod = Integer.parseInt(keyboard.nextLine());
                return cod;
            } catch (NumberFormatException e) {
                System.out.println("El número no es valido");
            }
        }
    }

    private static boolean comprobarNombre(String nombre) {

        CharSequence inputStr = nombre;

        Pattern pattern = Pattern.compile("^[a-zA-ZáéíóúàèìòùÀÈÌÒÙÁÉÍÓÚñÑçÇäÄëËïÏöÖüÜ]*$");
        Matcher matcher = pattern.matcher(inputStr);

        return matcher.matches();

    }

    private static boolean comprobarTelefon(String telefon) {
        Pattern pattern = Pattern.compile("^[976][9876543210]{8}");
        Matcher matcher = pattern.matcher(telefon);
        return matcher.matches();
    }

    private static boolean comprobarNif(String nif) {
        char[] arrayLetrasNif = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        try {
            if (nif.length() == 9) {

                String nifSinLetra = nif.substring(0, nif.length() - 1);
                int nifSinLetraInt = Integer.parseInt(nifSinLetra);

                char letraNum = nif.toUpperCase().charAt(8);
                int moduloNif = nifSinLetraInt % 23;

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
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
