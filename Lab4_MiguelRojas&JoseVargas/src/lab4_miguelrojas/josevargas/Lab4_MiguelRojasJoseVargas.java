package lab4_miguelrojas.josevargas;

import java.util.ArrayList;
import java.util.Random;
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
        

        equipos.add(new Equipo("Gryffindor", 10, 2, 80, 91, 65)); 
        equipos.add(new Equipo("Slytherin", 5, 9, 70, 65, 99));
        equipos.add(new Equipo("Ravenclaw", 8, 4, 80, 91, 65));
        equipos.add(new Equipo("Hufflepuff", 5, 9, 70, 65, 99));
        //add jugadores al equipo 0
        equipos.get(0).getJugadores().add(new Jugador("Jose", 3, 43, "Guardian")); equipos.get(0).getJugadores().add(new Jugador("Miguel", 1, 32, "Golpeador")); equipos.get(0).getJugadores().add(new Jugador("Antonio", 2, 2, "Golpeador")); equipos.get(0).getJugadores().add(new Jugador("Emilio", 3, 82, "Cazador")); equipos.get(0).getJugadores().add(new Jugador("Karlo", 7, 20, "Cazador")); equipos.get(0).getJugadores().add(new Jugador("Angel", 5, 77, "Cazador")); equipos.get(0).getJugadores().add(new Jugador("Harry", 4, 99, "Buscador"));
        //add jugadores al equipo 0
        equipos.get(0).getJugadores().add(new Jugador("Iker",1, 1, "Guardian")); equipos.get(0).getJugadores().add(new Jugador("Ronaldo", 6, 7, "Golpeador")); equipos.get(0).getJugadores().add(new Jugador("Mauricio", 4, 8, "Golpeador")); equipos.get(0).getJugadores().add(new Jugador("Greg", 3, 47, "Cazador")); equipos.get(0).getJugadores().add(new Jugador("Michael", 3, 21, "Cazador")); equipos.get(0).getJugadores().add(new Jugador("Brock", 2, 33, "Cazador")); equipos.get(0).getJugadores().add(new Jugador("Messi", 10, 10, "Buscador"));

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
                                if (equipos.size() == 4) {
                                    System.out.println("Ya no se pueden agregar mas equipos");
                                } else {
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
                                } else {
                                    System.out.println("Ingrese la posicion del equipo que desea agregarlo: ");
                                    pos_equipo = entrada.nextInt();
                                    if (equipos.get(pos_equipo).getJugadores().size() == 7) {
                                        System.out.println("El equipo ya esta completo");
                                    } else {
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
                    System.out.println("Simulacion");
                    simulacion();
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
            if (cont_G == 1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_G++;
            }
        } else if (casa.equals("Slytherin")) {
            if (cont_S == 1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_S++;
            }
        } else if (casa.equals("Ravenclaw")) {
            if (cont_R == 1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_R++;
            };
        } else if (casa.equals("Hufflepuff")) {
            if (cont_H == 1) {
                System.out.println("Ya hay un equipo asignado a esta casa");
            } else {
                cont_H++;
            }
        } else {
            throw new myException("La casa no es valida");

        }
    }

    public static void simulacion() {

        Random r = new Random();
        if (equipos.size() < 2) {
            System.out.println("No hay suficientes equipos para jugar");
        } else {
            for (int i = 0; i < equipos.size(); i++) {
                if (equipos.get(i).jugadores.size() < 7) {
                    System.out.println("No hay suficientes jugadores en los equipos");
                    break;
                }
            }
            //Mostrar equipo y Judador a Seleccionar
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println("Equipo [" + i + "]" + equipos.get(i).getCasa());
            }
            System.out.print("Eliga equipo: ");
            int pos_team = entrada.nextInt();
            //
            /*for (int i = 0; i < equipos.size(); i++) {
                System.out.println("Jugadores Equipo[" + i + "] = " + equipos.get(i).jugadores);
            }
            System.out.print("Eliga un jugador: ");
            int jugador = entrada.nextInt();*/

            //Eleccion cpu
            int pos_teamCPU = r.nextInt(4) + 0;
            while (pos_teamCPU == pos_team) {
                pos_teamCPU = r.nextInt(4) + 0;
            }
            int turno = 1;
            boolean fin = true;
            while (fin) {
                if (turno % 2 != 0) {
                    //Modo a Jugar
                    System.out.println("Turno de Jugador");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println("Jugadores Equipo[" + i + "] = " + equipos.get(i).jugadores);
                    }
                    System.out.print("Eliga un jugador: ");
                    int jugador = entrada.nextInt();
                    System.out.println("---------------------");
                    System.out.println("Modo a Jugar");
                    System.out.println("[1] Modo de Juego");
                    System.out.println("[2] Trampa");
                    System.out.println("[3] Terminar Juego");
                    System.out.print("Eliga que movimiento hara: ");
                    int move = entrada.nextInt();
                    switch (move) {
                        case 1:
                            System.out.println("Modo Juego");
                            //Accion de Guardian
                            if (equipos.get(pos_team).jugadores.get(jugador).getRol() == "Guardian") {

                                int pos_random = 0 + r.nextInt(6);
                                //

                                while (equipos.get(pos_teamCPU).jugadores.get(pos_random).getRol() != "Cazador") {
                                    pos_random = 0 + r.nextInt(6);
                                }
                                int refl_guardian = ((Guardian) equipos.get(pos_team).jugadores.get(jugador)).getReflej();
                                int tapar = ((Guardian) equipos.get(pos_team).jugadores.get(jugador)).agilidad(refl_guardian);
                                int peso_CPU = ((Cazadores) equipos.get(pos_teamCPU).jugadores.get(pos_random)).getPeso();
                                int velocidadCPU = ((Cazadores) equipos.get(pos_teamCPU).jugadores.get(pos_random)).velocidad(peso_CPU);
                                if (tapar > velocidadCPU) {
                                    //Tapo
                                    System.out.println("---------------------");
                                    System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                            + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                            + equipos.get(pos_team).getCasa() + ") intento tapar un gol: Exitosamente");
                                    //Sumar 8 a Agilidad
                                    ((Guardian) equipos.get(pos_team).jugadores.get(jugador)).setReflej(((Guardian) equipos.get(pos_team).jugadores.get(jugador)).getReflej() + 8);
                                } else {
                                    //Fallo
                                    System.out.println("---------------------");
                                    System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                            + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                            + equipos.get(pos_team).getCasa() + ") Fallo en tapar un gol");
                                    //System.out.println("10 Puntos para: " + equipos.get(pos_teamCPU).getCasa());
                                }
                                //Accion Golpeador
                            } else if (equipos.get(pos_team).jugadores.get(jugador).getRol() == "Golpeador") {
                                System.out.println("---------------------");
                                System.out.println("Opcion de Golpeador");
                                System.out.println("[1] Atacar");
                                System.out.println("[2] Defender");
                                System.out.print("Eliga una opción: ");
                                int opcion_golp = entrada.nextInt();
                                switch (opcion_golp) {
                                    case 1:
                                        int musculatora_hum = ((Golpeadores) equipos.get(pos_team).jugadores.get(jugador)).getMusculatura();
                                        int fuerza_hum = ((Golpeadores) equipos.get(pos_team).jugadores.get(jugador)).fuerza(musculatora_hum);

                                        int golpCPU1 = r.nextInt(6) + 0;
                                        //Conseguir Golpeadores de el equipo CPU
                                        while (equipos.get(pos_teamCPU).jugadores.get(golpCPU1).getRol() != "Golpeador") {
                                            golpCPU1 = r.nextInt(6) + 0;
                                        }

                                        int golpCPU2 = r.nextInt(7) + 0;
                                        while (equipos.get(pos_teamCPU).jugadores.get(golpCPU1).getRol() != "Golpeador") {
                                            if (golpCPU2 == golpCPU1) {
                                                golpCPU2 = r.nextInt(6) + 0;
                                            } else {
                                                golpCPU2 = r.nextInt(6) + 0;
                                            }
                                        }
                                        //Conseguir Valor de Musculatura de Golpeadores CPU
                                        int musculaturaCPU1 = ((Golpeadores) equipos.get(pos_teamCPU).jugadores.get(golpCPU1)).getMusculatura();
                                        int musculaturaCPU2 = ((Golpeadores) equipos.get(pos_teamCPU).jugadores.get(golpCPU2)).getMusculatura();
                                        //Conseguir Fuerza de Golpeadores CPU
                                        int fuerzaCPU1 = ((Golpeadores) equipos.get(pos_teamCPU).jugadores.get(golpCPU1)).fuerza(musculaturaCPU1);
                                        int fuerzaCPU2 = ((Golpeadores) equipos.get(pos_teamCPU).jugadores.get(golpCPU2)).fuerza(musculaturaCPU2);

                                        int suma_Fuerza = fuerzaCPU1 + fuerzaCPU2;
                                        if (fuerza_hum * 2 + 1 > suma_Fuerza) {
                                            System.out.println("---------------------");
                                            System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                                    + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                                    + equipos.get(pos_team).getCasa() + ") Golpeo a un oponente: Exitosamente");
                                        } else {
                                            System.out.println("---------------------");
                                            System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                                    + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                                    + equipos.get(pos_team).getCasa() + ") Fallo en golpear a un oponente");
                                        }
                                        break;
                                    case 2:
                                        //Caso Defender Golpeador
                                        //Agilidad de Jugador
                                        int reflejo_hum = ((Golpeadores) equipos.get(pos_team).jugadores.get(jugador)).getReflejos();
                                        int agilidad_hum = ((Golpeadores) equipos.get(pos_team).jugadores.get(jugador)).agilidad(reflejo_hum);

                                        int golpeador_CPU1 = r.nextInt(6) + 0;
                                        //Conseguir Golpeadores de el equipo CPU
                                        while (!"Golpeador".equals(equipos.get(pos_teamCPU).jugadores.get(golpeador_CPU1).getRol())) {
                                            golpeador_CPU1 = r.nextInt(6) + 0;
                                        }

                                        int reflejo_CPU = ((Golpeadores) equipos.get(pos_teamCPU).jugadores.get(golpeador_CPU1)).getReflejos();
                                        int agilidad_CPU = ((Golpeadores) equipos.get(pos_teamCPU).jugadores.get(golpeador_CPU1)).agilidad(reflejo_CPU);

                                        if ((agilidad_hum / 2) + 7 > agilidad_CPU) {
                                            System.out.println("---------------------");
                                            System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                                    + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                                    + equipos.get(pos_team).getCasa() + ") Defendio a un Compañero");
                                            ((Golpeadores) equipos.get(pos_team).jugadores.get(jugador)).setReflejos(reflejo_hum + 10);

                                        } else {
                                            System.out.println("---------------------");
                                            System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                                    + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                                    + equipos.get(pos_team).getCasa() + ") No logro Defender a un Compañero");
                                        }

                                        break;
                                    default:
                                        System.out.println("Ingrese una opción valida");
                                }

                            } else if (equipos.get(pos_team).jugadores.get(jugador).getRol() == "Cazador") {
                                //Modo de Cazador

                                //Conseguir valores de reflejo y peso del cazador
                                int reflejo_caz = ((Cazadores) equipos.get(pos_team).jugadores.get(jugador)).getReflex();
                                int peso_caz = ((Cazadores) equipos.get(pos_team).jugadores.get(jugador)).getPeso();

                                //Velocidad y Agilidad del Cazador                            
                                int velocidad_caz = ((Cazadores) equipos.get(pos_team).jugadores.get(jugador)).velocidad(peso_caz);
                                int agilidad_caz = ((Cazadores) equipos.get(pos_team).jugadores.get(jugador)).agilidad(reflejo_caz);

                                //Reflejo y agilidad del cazador CPU
                                int guardian_CPU = r.nextInt(6) + 0;
                                while (equipos.get(pos_teamCPU).jugadores.get(guardian_CPU).getRol() != "Guardian") {
                                    guardian_CPU = r.nextInt(6) + 0;
                                }

                                int reflejo_cazCPU = ((Cazadores) equipos.get(pos_teamCPU).jugadores.get(guardian_CPU)).getReflex();
                                int agilidad_CPU = ((Cazadores) equipos.get(pos_teamCPU).jugadores.get(guardian_CPU)).agilidad(reflejo_cazCPU);

                                //Accion de Cazador
                                if (velocidad_caz + agilidad_caz >= agilidad_CPU) {
                                    System.out.println("---------------------");
                                    System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                            + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                            + equipos.get(pos_team).getCasa() + ") Logro Anotar un GOOOOOOL");
                                    ((Cazadores) equipos.get(pos_team).jugadores.get(jugador)).setReflex(reflejo_caz + 6);
                                    ((Cazadores) equipos.get(pos_team).jugadores.get(jugador)).setPeso(peso_caz + 6);

                                } else {
                                    System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                            + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                            + equipos.get(pos_team).getCasa() + ") Fallo el Gol :(");
                                }

                            } else if (equipos.get(pos_team).jugadores.get(jugador).getRol() == "Buscador") {

                                //Velocidad del Jugador
                                int peso_buscador = ((Buscador) equipos.get(pos_team).jugadores.get(jugador)).getPeso();
                                int velocidad_buscador = ((Buscador) equipos.get(pos_team).jugadores.get(jugador)).velocidad(peso_buscador);

                                //Velocidad de CPU
                                int buscador_CPU = r.nextInt(6) + 0;
                                while (equipos.get(pos_teamCPU).jugadores.get(buscador_CPU).getRol() != "Buscador") {
                                    buscador_CPU = r.nextInt(6) + 0;
                                }
                                int peso_cpu = ((Buscador) equipos.get(pos_teamCPU).jugadores.get(buscador_CPU)).getPeso();
                                int vel_cpu = ((Buscador) equipos.get(pos_teamCPU).jugadores.get(buscador_CPU)).velocidad(peso_cpu);
                                //Accion de buscador
                                if ((velocidad_buscador / 14) + 14 > vel_cpu) {
                                    System.out.println("---------------------");
                                    System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                            + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                            + equipos.get(pos_team).getCasa() + ") Atrapo La Snitch Dorada");
                                    //Fin de Juego si la Accion se Cumple
                                    System.out.println("Ha terminado el Juego\n"
                                            + "El equipo de la casa " + equipos.get(pos_team).getCasa() + "Ha Ganado!!!");
                                    fin = false;
                                    //Metodo validar gane
                                } else {
                                    System.out.println("---------------------");
                                    System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                            + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                            + equipos.get(pos_team).getCasa() + ") Fallo en atrapar la Snitch Dorada");
                                }
                            } else {
                                //Do nothing
                            }
                            break;
                        case 2:
                            System.out.println("Trampa");
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println("Jugadores Equipo[" + i + "] = " + equipos.get(i).jugadores);
                            }
                            System.out.print("Eliga un jugador: ");
                            int jug_trampa = entrada.nextInt();

                            if (equipos.get(pos_team).jugadores.get(jug_trampa).getRol() == "Buscador") {
                                //Trampa Buscador
                                int win_chance = r.nextInt(100) + 0;
                                if (win_chance >= 0 && win_chance <= 5) {
                                    System.out.println("---------------------");
                                    System.out.println(equipos.get(pos_team).jugadores.get(jugador).getNombre()
                                            + "(" + equipos.get(pos_team).jugadores.get(jugador).getRol() + " - "
                                            + equipos.get(pos_team).getCasa() + ") Atrapo La Snitch Dorada Con su Varita");
                                    System.out.println("La casa " + equipos.get(pos_team).getCasa() + "Ha Ganado por  150 Puntos");
                                    fin = false;
                                } else {
                                    System.out.println("La casa " + equipos.get(pos_team).getCasa() + "Ha sido Descalificada por Trampa");
                                    System.out.println("Gana el equipo de la casa: " + equipos.get(pos_teamCPU).getCasa());
                                    fin = false;
                                }
                            } else if (equipos.get(pos_team).jugadores.get(jug_trampa).getRol() == "Golpeador") {
                                //Trampa Golpeador

                                int golpeador_random = r.nextInt(100) + 0;

                                //Conseguir Segundo Golpeador
                                int segundo_golpeador = r.nextInt(6) + 0;
                                while (equipos.get(pos_team).jugadores.get(segundo_golpeador).getRol() != "Golpeador") {
                                    if (segundo_golpeador == golpeador_random) {
                                        segundo_golpeador = r.nextInt(6) + 0;
                                    } else {
                                        segundo_golpeador = r.nextInt(6) + 0;
                                    }

                                }
                                
                                if (golpeador_random >= 0 && golpeador_random < 22) {
                                    //Incremento a Agilidad y Fuerza de Golpeador 1
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).setReflejos(10 + ((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).getReflejos());
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).setMusculatura(10 + ((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).getMusculatura());
                                    //Incremento a Agilidad y Fuerza de Golpeador 2
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).setReflejos(10 + ((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).getReflejos());
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).setMusculatura(10 + ((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).getMusculatura());
                                    System.out.println("Se ha incrementado La Velocidad y Agilidad de los Golpeadores del equipo: " + equipos.get(pos_team).getCasa());
                                } else {
                                    //Decremento a Agilidad y Fuerza de Golpeador 1
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).setReflejos(((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).getReflejos() - 15);
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).setMusculatura(((Golpeadores) equipos.get(pos_team).jugadores.get(jug_trampa)).getMusculatura() - 10);
                                    //Decremento a Agilidad y Fuerza de Golpeador 2
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).setReflejos(((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).getReflejos() - 15);
                                    ((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).setMusculatura(((Golpeadores) equipos.get(pos_team).jugadores.get(segundo_golpeador)).getMusculatura() - 10);
                                    System.out.println("Se ha Decrementado La Velocidad y Agilidad de los Golpeadores del equipo: " + equipos.get(pos_team).getCasa() + "Por Trampa");
                                }

                            } else if (equipos.get(pos_team).jugadores.get(jug_trampa).getRol() == "Cazador") {

                            } else if (equipos.get(pos_team).jugadores.get(jugador).getRol() == "Guardian") {

                            } else {
                                //Do nothing
                            }
                            break;
                        case 3:
                            System.out.println("El partido a parado por malas condiciones climaticas\n"
                                    + "Continuara otro dia");
                            fin = false;
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }
                    //Agregar Velocidad al Buscador
                    int jugador_snitch = r.nextInt(7) + 0;
                    while (equipos.get(pos_team).jugadores.get(jugador_snitch).getRol() != "Buscador") {
                        jugador_snitch = r.nextInt(7) + 0;
                    }
                    ((Buscador) equipos.get(pos_team).jugadores.get(jugador_snitch)).setPeso(10 + ((Buscador) equipos.get(pos_team).jugadores.get(jugador_snitch)).getPeso());
                    turno++;
                } else {
                    System.out.println("Turno de CPU");

                    turno++;
                }

            }

        }

    }
}
