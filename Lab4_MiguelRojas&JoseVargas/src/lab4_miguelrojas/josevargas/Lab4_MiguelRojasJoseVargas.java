
package lab4_miguelrojas.josevargas;

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
            switch(opcion){
                case 1:
                    boolean valid2 = true;
                    while(valid2){
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
                                System.out.println("Equipo agregado con exito!");
                                System.out.println();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                valid2 = false;
                        }
                    }
                    break;
                case 2:
                    boolean valid3 = true;
                    while(valid3){
                        System.out.println("1] Agregar Jugadores");
                        System.out.println("2] Modificar Jugadores");
                        System.out.println("3] Eliminar Jugadores");
                        System.out.println("4] Listar Jugadores");
                        System.out.println("5] Regresar al Menu");
                        System.out.println("Ingrese una opcion: ");
                        int op_jugadores = entrada.nextInt();
                        switch(op_jugadores){
                            case 1:
                                System.out.println("Ingrese el nombre del jugador: ");
                                String nombre = entrada.next();
                                System.out.println("Ingrese el numero del jugador: ");
                                int numero = entrada.nextInt();
                                System.out.println("Ingrese la posicion del jugador: \n"
                                        + "1] Guardian\n"
                                        + "2] Golpeador\n"
                                        + "3] Cazador\n"
                                        + "4] Buscador\n");
                                int posicion = entrada.nextInt();
                                
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
