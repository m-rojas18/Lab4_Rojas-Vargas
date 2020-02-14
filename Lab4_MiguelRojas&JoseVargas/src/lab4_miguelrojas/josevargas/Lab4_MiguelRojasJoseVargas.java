
package lab4_miguelrojas.josevargas;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab4_MiguelRojasJoseVargas {
static Scanner entrada = new Scanner(System.in);
static int cont_gua, cont_golp, cont_caz, cont_busc; //Contador para controlar maximo de jugadores por posicion

    public static void main(String[] args) {
        boolean valid = true;
        while(valid){
            System.out.println("----Quidditch----");
            System.out.println("1] CRUD Equipo");
            System.out.println("2] CRUD Jugadores");
            System.out.println("3] Simulacion de Juego");
            System.out.println("4] Salir del Juego");
            System.out.println("Ingrese una opcion: ");
            int opcion = entrada.nextInt();
            ArrayList<Equipo> equipos = new ArrayList();
            switch(opcion){
                case 1:
                    boolean valid2 = true;
                    while(valid2){
                        System.out.println("---------------------");
                        System.out.println("1] Agregar Equipo");
                        System.out.println("2] Modificar Equipo");
                        System.out.println("3] Eliminar Equipo");
                        System.out.println("4] Listar Equipos");
                        System.out.println("5] Regresar al Menu");
                        System.out.println("Ingrese una opcion: ");
                        int op_equipos = entrada.nextInt();
                        switch(op_equipos){
                            case 1:
                                System.out.println("Ingrese la casa de su equipo: ");
                                String casa = entrada.next();
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
                                System.out.println();
                                break;
                            case 2:
                                System.out.println();
                                break;
                            case 3:
                                System.out.println();
                                break;
                            case 4:
                                for (int i = 0; i < equipos.size(); i++) {
                                    System.out.println("Equipo["+i + "]" + equipos.get(i));
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
                    while(valid3){
                        System.out.println("---------------------");
                        System.out.println("1] Agregar Jugadores");
                        System.out.println("2] Modificar Jugadores");
                        System.out.println("3] Eliminar Jugadores");
                        System.out.println("4] Listar Jugadores");
                        System.out.println("5] Regresar al Menu");
                        System.out.println("Ingrese una opcion: ");
                        int op_jugadores = entrada.nextInt();
                        switch(op_jugadores){
                            case 1:
                                System.out.println("Ingrese la posicion del equipo que desea agregarlo: ");
                                int pos_equipo = entrada.nextInt();
                                System.out.println("Ingrese el nombre del jugador: ");
                                String nombre = entrada.next();
                                System.out.println("Ingrese el año que cursa en Hogwarts: ");
                                String anio = entrada.next();
                                System.out.println("Ingrese el numero del jugador: ");
                                int numero = entrada.nextInt();
                                boolean valid_pos = true;
                                while(valid_pos){
                                    System.out.println("Ingrese la posicion del jugador: \n"
                                            + "1] Guardian\n"
                                            + "2] Golpeador\n"
                                            + "3] Cazador\n"
                                            + "4] Buscador\n");
                                    int posicion = entrada.nextInt();
                                    switch(posicion){
                                        case 1:
                                            if(cont_gua<=1){
                                                cont_gua++;
                                                valid_pos = false;
                                            }else{
                                                System.out.println("Ya hay 1 Guardian en el equipo");
                                            }
                                            break;
                                        case 2:
                                            if(cont_golp<=2){
                                                cont_golp++;
                                                valid_pos = false;
                                            }else{
                                                System.out.println("Ya hay 2 Golpeadores en el equipo");
                                            }
                                            break;
                                        case 3:
                                            if(cont_caz<=3){
                                                cont_caz++;
                                                valid_pos = false;
                                            }else{
                                                System.out.println("Ya hay 3 Cazadores en el equipo");
                                            }
                                            break;
                                        case 4:
                                            if(cont_busc<=1){
                                                cont_busc++;
                                                valid_pos = false;
                                            }else{
                                                System.out.println("Ya hay 1 Buscador en el equipo");
                                            }
                                            break;
                                    }
                                }
                                System.out.println();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
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
                    System.out.println("");
                    System.exit(opcion);
                    break;
            }
        }
    }
    
}
