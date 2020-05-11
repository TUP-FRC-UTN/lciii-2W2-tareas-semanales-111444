/*
1. Agregar a la clase Equipo (unidad 1) un arreglo con los datos de los jugadores.
De cada jugador se conoce su nombre, posición (1: arquero, 2: defensor, 3:
mediocampo, 4: delantero) número de camiseta, cantidad de partidos jugados y
porcentaje de estado físico (100 equivale a un jugador sano y 0 a uno imposibilitado
de jugar por lesiones).
Desarrollar un programa que permita cargar todos los datos de un equipo y a
continuación informe:
1. Cantidad de jugadores con menos de 10 partidos jugados.
2. Nombre del jugador con mayor cantidad de partidos jugados.
3. Promedio de estado físico de todo el equipo.
4. Estado físico de un jugador particular identificado por número de camiseta.
5. Promedio de partidos jugados de los jugadores de cada posición (4
resultados).
 */
package tareaejercicio1105;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Marina
 */
public class TareaEjercicio1105 {

    public static void main(String[] args) {

        Equipo equipo = new Equipo();
        List<Jugadores> listJugadores = new ArrayList<Jugadores>();
        String nombre;
        boolean nombreVal = false;
        int posicion;
        boolean posicionVal = false;
        int partidos;
        boolean partidosVal = false;
        int estado;
        boolean estadoVal = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo: ");
        equipo.setName(sc.nextLine());

        do {
            Jugadores jugador = new Jugadores();
            System.out.println("Ingrese los datos del jugador...");
            do {
                System.out.println("Nombre:");
                nombre = sc.nextLine();
                if (!nombre.isEmpty()) {
                    jugador.setNombre(nombre);
                    break;
                }
                nombreVal = true;
                System.out.println("El nombre no puede estar vacio");
            } while (nombreVal);

            do {
                System.out.println("Ingrese la posicion:(1: arquero, 2: defensor, 3: mediocampo, 4: delantero)");
                posicion = sc.nextInt();
                switch (posicion) {
                    case 1:
                        System.out.println("Arquero");
                        break; // break es opcional
                    case 2:
                        System.out.println("Defensor");
                        break; // break es opcional
                    case 3:
                        System.out.println("MedioCampo");
                        break; // break es opcional
                    case 4:
                        System.out.println("Delantero");
                        break; // break es opcional
                    default:
                        posicionVal = true;
                        break; // break es opcional
                }
                if(!posicionVal){
                    jugador.setPosicion(posicion);
                    break;
                }
                System.out.println("La posicion ingresada es invalida");
                
            } while (posicionVal);

            System.out.println("Cantidad de partidos jugados:");
            jugador.setCantPartidos(sc.nextInt());
            System.out.println("Estado fisico: (1-100)");
            jugador.setEstadoFisico(sc.nextInt());

        } while (true);

    }

}
