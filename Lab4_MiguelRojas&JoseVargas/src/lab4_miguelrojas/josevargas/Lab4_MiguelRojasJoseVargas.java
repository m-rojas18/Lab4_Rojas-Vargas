package lab4_miguelrojas.josevargas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_MiguelRojasJoseVargas {


    static Scanner entrada = new Scanner(System.in);
    static int cont_gua, cont_golp, cont_caz, cont_busc; //Contador para controlar maximo de jugadores por posicion
    static int cont_G = 0, cont_S = 0, cont_R = 0, cont_H = 0; //Control de equipos por casa
    static int pos_equipo = 0;
    static ArrayList<Equipo> equipos = new ArrayList();

    public static void main(String[] args) {
        boolean valid = true;
        int pos_equipo = 0;
        //equipos.add(new Equipo("Gryffindor", 10, 2, 80, 91, 65));
        //equipos.add(new Equipo("Slytherin", 5, 9, 70, 65, 99));
        while (valid) {
            System.out.println("----Quidditch----");
            System.out.println("1] CRUD Equipo");
            System.out.println("2] CRUD Jugadores");
            System.out.println("3] Simulacion de Juego");
            System.out.println("4] Salir del Juego");
            System.out.println("Ingrese una opcion: ");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    boolean valid2 = true;
                    while (valid2) {
                        System.out.println("---------------------");
                        System.out.println("1] Agregar Equipo");
                        System.out.println("2] Modificar Equipo");
                        System.out.println("3] Eliminar Equipo");
                        System.out.println("4] Listar Equipos");
                        System.out.println("5] Regresar al Menu");
                        System.out.println("Ingrese una opcion: ");
                        int op_equipos = entrada.nextInt();
                        switch (op_equipos) {
                            case 1:
                                if(equipos.size()==4){
                                    System.out.println("Ya no se pueden agregar mas equipos");
                                }else{
                                    String casa = "";
                                    boolean flag = true;
                                    while (flag) {
                                        try {
                                            System.out.println("Ingrese la casa de su equipo[Gryffindor, Slytherin, Ravenclaw, Hufflepuff]: ");
                                            casa = entrada.next();
                                            validarCasa(casa);
                                            flag = false;
                                        } catch (myException e) {
                                            e.getMessage();
                                        }
                                    }
                                    
                                    System.out.println("Ingrese la cantidad de partidos ganados: ");
                                    int partidos_win = entrada.nextInt();
                                    System.out.println("Ingrese la cantidad de partidos perdidos: ");
                                    int partidos_lost = entrada.nextInt();
                                    System.out.println("Ingrese el promedio de agilidad: ");
                                    int prom_agilidad = entrada.nextInt();
                                    System.out.println("Ingrese el promedio de velocidad: ");
                                    int prom_velocidad = entrada.nextInt();
                                    System.out.println("Ingrese el promedio de fuerza: ");
                                    int prom_fuerza = entrada.nextInt();
                                    System.out.println("Equipo agregado con exito!");
                                    equipos.add(new Equipo(casa, partidos_win, partidos_lost, prom_agilidad, prom_velocidad, prom_fuerza));
                                }
                                    System.out.println();
                                    break;
                            case 2:
                                for (int i = 0; i < equipos.size(); i++) {
                                    System.out.println("Equipo[" + i + "]" + equipos.get(i));
                                }
                                System.out.println();
                                break;
                            case 3:
                                for (int i = 0; i < equipos.size(); i++) {
                                    System.out.println("Equipo[" + i + "]" + equipos.get(i));
                                }
                                System.out.println("Ingrese el equipo que desea eliminar: ");
                                int eliminar = entrada.nextInt();
                                equipos.remove(eliminar);
                                System.out.println("Equipo Eliminado con Exito");
                                System.out.println();
                                break;
                            case 4:
                                for (int i = 0; i < equipos.size(); i++) {
                                    System.out.println("Equipo[" + i + "]" + equipos.get(i));
                                }
                                System.out.println();
                                break;
                            case 5:
                                valid2 = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean valid3 = true;
                    while (valid3) {
                        System.out.println("---------------------");
                        System.out.println("1] Agregar Jugadores");
                        System.out.println("2] Modificar Jugadores");
                        System.out.println("3] Eliminar Jugadores");
                        System.out.println("4] Listar Jugadores");
                        System.out.println("5] Regresar al Menu");
                        System.out.println("Ingrese una opcion: ");
                        int op_jugadores = entrada.nextInt();
                        switch (op_jugadores) {
                            case 1:
                                if (equipos.isEmpty()) {
                                    System.out.println("No hay equipos disponibles");
                                    valid3 = false;
                                    System.out.println();
                                    break;
                                }else{
                                    System.out.println("Ingrese la posicion del equipo que desea agregarlo: ");
                                    pos_equipo = entrada.nextInt();
                                    if(equipos.get(pos_equipo).getJugadores().size() == 7){
                                        System.out.println("El equipo ya esta completo");
                                    }else{
                                        System.out.println("Ingrese el nombre del jugador: ");
                                        String nombre = entrada.next();
                                        System.out.println("Ingrese el año que cursa en Hogwarts: ");
                                        int anio = entrada.nextInt();
                                        System.out.println("Ingrese el numero del jugador: ");
                                        int num_uniforme = entrada.nextInt();
                                        boolean valid_pos = true;
                                        while (valid_pos) {
                                            System.out.println("Ingrese la posicion del jugador: \n"
                                                    + "1] Guardian\n"
                                                    + "2] Golpeador\n"
                                                    + "3] Cazador\n"
                                                    + "4] Buscador");
                                            int posicion = entrada.nextInt();
                                            switch (posicion) {
                                                case 1:
                                                    if (cont_gua <= 1) {
                                                        cont_gua++;
                                                        equipos.get(pos_equipo).getJugadores().add(new Jugador(nombre, anio, num_uniforme, "Guardian"));
                                                        System.out.println("Jugador Agregado Con Exito");
                                                        valid_pos = false;
                                                    } else {

                                                        System.out.println("Ya hay 1 Guardian en el equipo");
                                                    }
                                                    break;
                                                case 2:
                                                    if (cont_golp <= 2) {
                                                        cont_golp++;
                                                        equipos.get(pos_equipo).getJugadores().add(new Jugador(nombre, anio, num_uniforme, "Golpeadores"));
                                                        System.out.println("Jugador Agregado Con Exito");
                                                        valid_pos = false;
                                                    } else {
                                                        System.out.println("Ya hay 2 Golpeadores en el equipo");
                                                    }
                                                    break;
                                                case 3:
                                                    if (cont_caz <= 3) {
                                                        cont_caz++;
                                                        equipos.get(pos_equipo).getJugadores().add(new Jugador(nombre, anio, num_uniforme, "Cazador"));
                                                        System.out.println("Jugador Agregado Con Exito");
                                                        valid_pos = false;
                                                    } else {
                                                        System.out.println("Ya hay 3 Cazadores en el equipo");
                                                    }
                                                    break;
                                                case 4:
                                                    if (cont_busc <= 1) {
                                                        cont_busc++;
                                                        equipos.get(pos_equipo).getJugadores().add(new Jugador(nombre, anio, num_uniforme, "Buscador"));
                                                        System.out.println("Jugador Agregado Con Exito");
                                                        valid_pos = false;
                                                    } else {
                                                        System.out.println("Ya hay 1 Buscador en el equipo");
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                }
                                System.out.println();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                if (equipos.isEmpty()) {
                                    System.out.println("No hay equipos disponibles");
                                } else {
                                }
                                for (int i = 0; i < equipos.size(); i++) {
                                    System.out.println("Jugadores Equipo[" + i + "] = " + equipos.get(i).jugadores);
                                }
                                    
                                break;
                            case 5:
                                valid3 = false;
                        }
                    }
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Gracias por jugar!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
    }

    public static void validarCasa(String casa) throws myException {

        if (casa.equals("Gryffindor")) {
            if (cont_G==1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_G++;
            }
        } else if (casa.equals("Slytherin")) {
            if (cont_S==1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_S++;
            }
        } else if (casa.equals("Ravenclaw")) {
            if (cont_R==1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_R++;
            };
        } else if (casa.equals("Hufflepuff")) {
            if (cont_H==1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_H++;
            }
        } else {
            throw new myException("La casa no es valida");

        }
    }

    public static void simulacion() {

        int turno = 1;
        boolean fin = true;
        while (fin) {
            if (turno % 2 != 0) {
                System.out.println("Turno de Humano");
                
                turno++;
            } else {
                System.out.println("Turno de CPU");

                turno++;
            }

        }
    }
}
